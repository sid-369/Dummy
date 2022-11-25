package com.fairBilling;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FairBilling {

	protected List<String> loadFileToList(String fileName) throws IOException {
		List<String> noOfLines = Collections.emptyList();

		try {
			noOfLines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
		} catch (Exception e) {
			throw new Exception("File error " + fileName, e);
		}

		return noOfLines;
	}

	protected List<Result> processFileAsList(List<String> noOfLines) {

		if (noOfLines == null || noOfLines.isEmpty()) {
			return new ArrayList<>();
		}

		List<TimeDuration> timeSessionList = breakUpAllTheLines(noOfLines);

		LocalTime firstTime = null;
		LocalTime lastTime = null;
		Map<String, List<Session>> map = processLines(timeSessionList);

		List<Result> results = new ArrayList<>();

		for (String username : map.keySet()) {
			int total = 0;
			int numberOfSessions = 0;
			for (Session s : map.get(username)) {
				numberOfSessions++;
				if (s.getStartTime() == null) {
					s.setStartTime(firstTime);
				}
				if (s.getEndTime() == null) {
					s.setEndTime(lastTime);
				}
				total += +Duration.between(s.getStartTime(), s.getEndTime()).getSeconds();
			}
			results.add(new Result(username, numberOfSessions, total));
		}

		return results;

	}

	protected Map<String, List<Session>> processLines(List<TimeDuration> l) {

		Map<String, List<Session>> sessionMap = new LinkedHashMap<>();

		for (TimeDuration line : l) {

			List<Session> sessionList = sessionMap.get(line.getUserName());

			sessionMap.put(line.getUserName(), sessionList);
		}

		return sessionMap;
	}

	protected List<TimeDuration> breakUpAllTheLines(List<String> l) {

		List<TimeDuration> TimeDurationList = new ArrayList<>();

		for (String line : l) {

			TimeDuration timeDuration = new TimeDuration();

		}

		return TimeDurationList;
	}

	public static void main(String[] args) {

		try {

			String fileName = args[args.length - 1];

			FairBilling fairBilling = new FairBilling();
			List<String> noOfLines = fairBilling.loadFileToList(fileName);

			List<Result> results = fairBilling.processFileAsList(noOfLines);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

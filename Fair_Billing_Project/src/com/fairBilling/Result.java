package com.fairBilling;

public class Result {
	
	private String userName;
	private int numberOfSessions;
	private int totalTimeInSeconds;
	
	public Result() {
		super();
	}

	public Result(String userName, int numberOfSessions, int totalTimeInSeconds) {
		super();
		this.userName = userName;
		this.numberOfSessions = numberOfSessions;
		this.totalTimeInSeconds = totalTimeInSeconds;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getNumberOfSessions() {
		return numberOfSessions;
	}

	public void setNumberOfSessions(int numberOfSessions) {
		this.numberOfSessions = numberOfSessions;
	}

	public int gettotalTimeInSeconds() {
		return totalTimeInSeconds;
	}

	public void settotalTimeInSeconds(int totalTimeInSeconds) {
		this.totalTimeInSeconds = totalTimeInSeconds;
	}

	@Override
	public String toString() {
		return "Result [userName=" + userName + ", numberOfSessions=" + numberOfSessions + ", totalTimeInSeconds="
				+ totalTimeInSeconds + "]";
	}

	
	
}

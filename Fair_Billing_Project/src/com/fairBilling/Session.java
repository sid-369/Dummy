package com.fairBilling;

import java.time.LocalTime;

public class Session {
	
	private String username;
	private LocalTime startTime;
	private LocalTime endTime;
	
	public Session() {
		super();
	}

	public Session(String username, LocalTime startTime, LocalTime endTime) {
		super();
		this.username = username;
		this.startTime = startTime;
		this.endTime = endTime;
	}


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public LocalTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}

	public LocalTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}

	@Override
	public String toString() {
		return "UserSession [username=" + username + ", startTime=" + startTime + ", endTime=" + endTime + "]";
	}
	
	
	
	

}

package com.fairBilling;

public class TimeDuration {
	
	private boolean valid;
	
	private String hours;
	private String minutes;
	private String seconds;
	private String userName;
	private String action; // Start or End
	 
	
	public TimeDuration() {
		super();
	}


	public TimeDuration(boolean valid, String hours, String minutes, String seconds, String userName, String action) {
		super();
		this.valid = valid;
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
		this.userName = userName;
		this.action = action;
	}


	public boolean isValid() {
		return valid;
	}


	public void setValid(boolean valid) {
		this.valid = valid;
	}


	public String getHours() {
		return hours;
	}


	public void setHours(String hours) {
		this.hours = hours;
	}


	public String getMinutes() {
		return minutes;
	}


	public void setMinutes(String minutes) {
		this.minutes = minutes;
	}


	public String getSeconds() {
		return seconds;
	}


	public void setSeconds(String seconds) {
		this.seconds = seconds;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getAction() {
		return action;
	}


	public void setAction(String action) {
		this.action = action;
	}


	@Override
	public String toString() {
		return "TimeDuration [valid=" + valid + ", hours=" + hours + ", minutes=" + minutes + ", seconds=" + seconds
				+ ", userName=" + userName + ", action=" + action + "]";
	}
	
	
	

}

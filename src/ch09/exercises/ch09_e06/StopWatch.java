package ch09.exercises.ch09_e06;

import java.util.Date;

public class StopWatch {

	// The private instance variables
	private Date startTime;
	private Date endTime;

	// Constructor

	// No-arg/Default constructor
	// +StopWatch()
	public StopWatch() {
		startTime = new Date();
		endTime = new Date();
	}

	// Getter and Setter methods

	// Getter method for private instance variable 'startTime'
	public Date getStartTime() {
		return startTime;
	}

	// Setter method for private instance variable 'startTime'
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	// Getter method for private instance variable 'endTime'
	public Date getEndTime() {
		return endTime;
	}

	// Setter method for private instance variable 'endTime'
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	// +start(): void
	// this method resets the startTime to the current time
	public void start() {
		startTime.setTime(System.currentTimeMillis());
	}

	// +stop(): void
	// this method sets the endTime to the current time
	public void stop() {
		endTime.setTime(System.currentTimeMillis());
	}

	// +getElapsedTime(): long
	// this method returns the elapsed time for the stop watch in milliseconds
	public long getElapsedTime() {
		return endTime.getTime() - startTime.getTime();
	}
}

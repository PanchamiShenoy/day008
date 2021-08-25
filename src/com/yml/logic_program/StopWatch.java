package com.yml.logic_program;

public class StopWatch {
	public static long startTime, stopTime;

	public static void start() {
		startTime = System.currentTimeMillis();
		System.out.println("Stop watch has been started");
		System.out.println("Start time is " + startTime + " milliseconds");
	}

	public static void stop() {
		stopTime = System.currentTimeMillis();
		System.out.println("Stop watch has been stopped");
		System.out.println("Stop time is " + stopTime + " milliseconds");
	}

	public static long getElapsedTime()
	{
		return  stopTime - startTime;
	}
}

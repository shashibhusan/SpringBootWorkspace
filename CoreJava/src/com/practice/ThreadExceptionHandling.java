package com.practice;

import java.lang.Thread.UncaughtExceptionHandler;

public class ThreadExceptionHandling {

	public static void main(String[] args) {

		Thread.UncaughtExceptionHandler handler = new UncaughtExceptionHandler() {

			@Override
			public void uncaughtException(Thread t, Throwable e) {

				System.out.println("Uncought handle exception is : " + e);
			}
		};
		Thread thread = new Thread() {
			public void run() {
				System.out.println("Thread has started....");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				throw new RuntimeException();
			}
		};
		thread.setUncaughtExceptionHandler(handler);

		thread.start();
	}

}

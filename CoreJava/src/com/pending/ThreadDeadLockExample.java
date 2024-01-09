package com.pending;

public class ThreadDeadLockExample {

	public static void main(String[] args) {

		final String resourceOne = "Shashi Bhusan Patel";
		final String resourceTwo = "Dharmendra kumar singh";

		Thread th1 = new Thread() {
			public void run() {
				synchronized (resourceOne) {
					System.out.println("Thread th1 has lock on resourceOne");
					try {
						Thread.sleep(100);
					} catch (Exception e) {
					}

				synchronized (resourceTwo) {
					System.out.println("Thread th1 has lock on resourceTwo");
				}
			}

			}
		};

		Thread th2 = new Thread() {
			public void run() {
				synchronized (resourceTwo) {
					System.out.println("Thread th2 has lock on resourceTwo");
					try {
						Thread.sleep(100);
					} catch (Exception e) {
					}
				synchronized (resourceOne) {
					System.out.println("Thread th2 has lock on resorceOne");
				}
			}
			}
		};

		th1.start();
		th2.start();

	}

}

package javaconcept.oftheday;

public class StopAThread extends Thread {

	public static void main(String[] args) {

		StopAThread aThread = new StopAThread();
		aThread.start();

		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		aThread.changeStatus();
	}

	public volatile boolean flag = true;

	public void changeStatus() {
		flag = false;
	}

	@Override
	public void run() {
		while (flag) {
			System.out.println("Thread is running");
		}
		System.out.println("Stopping runnig............");
	}

}

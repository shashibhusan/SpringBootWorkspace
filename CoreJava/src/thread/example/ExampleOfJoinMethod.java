package thread.example;

public class ExampleOfJoinMethod implements Runnable {

	public static void main(String[] args) {
		ExampleOfJoinMethod exampleOfJoinMethod = new ExampleOfJoinMethod();
		Thread thread1 = new Thread(exampleOfJoinMethod);
		Thread thread2 = new Thread(exampleOfJoinMethod);
		thread1.start();
		try {
			thread1.join();// Check the result after commenting it
		} catch (Exception e) {
			e.printStackTrace();
		}
		thread2.start();
	}

	@Override
	public void run() {
		for (int i = 1; i < 10; i++) {
			try {
				System.out.println(i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

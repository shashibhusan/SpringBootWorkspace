package thread.example;

public class ExampleOfThreadLocal implements Runnable {

	ThreadLocal<Integer> local = new ThreadLocal<>();

	public static void main(String[] args) {
		Thread thread1 = new Thread(new ExampleOfThreadLocal());
		Thread thread2 = new Thread(new ExampleOfThreadLocal());
		thread1.start();
		thread2.start();
	}

	@Override
	public void run() {
		local.set((int) (Math.random() * 100D));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread local value is : " + local.get());
	}

}

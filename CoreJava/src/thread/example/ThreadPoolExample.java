package thread.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {

	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(2);
		Thread thread1 = new Thread() {
			public void run() {
				System.out.println("The one has started ... ");
			}
		};

		Thread thread2 = new Thread() {
			public void run() {
				System.out.println("The two has started ... ");
			}
		};

		Thread thread3 = new Thread() {
			public void run() {
				System.out.println("The three has started ... ");
			}
		};

		service.execute(thread1);
		service.execute(thread2);
		service.execute(thread3);
		service.shutdown();
	}

}

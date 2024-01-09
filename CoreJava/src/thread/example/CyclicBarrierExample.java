package thread.example;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExample extends Thread {

	int durration;
	static CyclicBarrier cb;
	public static void main(String[] args) {
		cb = new CyclicBarrier(4);
		CyclicBarrierExample thread1 = new CyclicBarrierExample(1000);
		CyclicBarrierExample thread2 = new CyclicBarrierExample(1000);
		CyclicBarrierExample thread3 = new CyclicBarrierExample(1000);
		CyclicBarrierExample thread4 = new CyclicBarrierExample(1000);
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
	}

	@Override
	public void run() {
		try {
			Thread.sleep(durration);
			System.out.println("Thread " + Thread.currentThread().getName() + " calling await()");
			cb.await();
			System.out.println("Thread " + Thread.currentThread().getName() + " Started again");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public CyclicBarrierExample(int durration) {
		this.durration = durration;
	}

}

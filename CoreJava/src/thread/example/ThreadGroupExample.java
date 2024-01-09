package thread.example;

public class ThreadGroupExample extends Thread {

	public ThreadGroupExample(String thName, ThreadGroup grName) {
		super(grName, thName);
	}

	@Override
	public void run() {
		System.out.println("Thread started ....");
	}

	public static void main(String[] args) {
		ThreadGroup group = new ThreadGroup("TG1");
		ThreadGroupExample th1 = new ThreadGroupExample("th1", group);
		th1.start();

	}


}

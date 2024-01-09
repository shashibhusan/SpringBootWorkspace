package thread.example;

public class AddShutdownHookExample {

	public static void main(String[] args) {

		Object object = new Object() {
			@Override
			protected void finalize() throws Throwable {
				System.out.println("This is finalize method");
			}
		};

		object = null;
		System.gc();
		
		Runtime.getRuntime().addShutdownHook(new Thread() {
			@Override
			public void run() {
				System.out.println("This is the ShutdownHook method");
			}
		});
		System.out.println("Calling System.exit(0)");
		System.exit(0);
	}

}

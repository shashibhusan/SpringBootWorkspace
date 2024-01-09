public class Singleton {
	private static Singleton singleton = null;

	private Singleton() {
		System.out.println("This is private constructor");
	}
	public static Singleton getSingleton() {
		if (singleton == null) {
			return new Singleton();
		} else {
			return singleton;
		}
	}
}

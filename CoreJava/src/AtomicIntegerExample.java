import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerExample {

	public static void main(String[] args) {
		AtomicInteger atomicInteger = new AtomicInteger();
		System.out.println("AtomicInteger " + atomicInteger);
		atomicInteger.incrementAndGet();
		System.out.println("AtomicInteger " + atomicInteger);

	}

}

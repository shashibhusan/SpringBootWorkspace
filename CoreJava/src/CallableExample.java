import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class TestOne implements Callable<Integer> {
	@Override
	public Integer call() throws Exception {
		return 3;
	}

}

class TestTwo implements Callable<Double> {
	@Override
	public Double call() throws Exception {

		return 3.5;
	}

}

public class CallableExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		Future retInt = executorService.submit(new TestOne());
		Future retDouble = executorService.submit(new TestTwo());
		System.out.println("Return value from callables are :" + retInt.get() + " and " + retDouble.get());
	}

}

package tricky.question;

public class ExceptionHandlingOne {
	public static void aMethod() throws Exception {
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.print(" CatchBlock");
		} finally {
			System.out.print(" finally ");
		}
	}

	public static void main(String args[]) {
		try {
			aMethod();
		} catch (Exception e) {
			System.out.print(" exception ");
		}
		System.out.print(" finished");
	}
}

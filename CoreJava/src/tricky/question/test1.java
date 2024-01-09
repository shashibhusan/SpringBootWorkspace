package tricky.question;

class A {
	/*
	 * public A(int x) { }
	 */
}

class B extends A {

}

public class test1 {
	public static void main(String args[]) {
		A a = new B();
		System.out.println("complete");
	}
}
/*
 * Since a constructor has been defined in class A java will no longer supply a
 * default constructor for class A therefore when class B calls class A's
 * default constructor it will result in a compile error.
 */
package tricky.question;

//A Java program to show that we can change members using
//reference if we do not change the reference itself.
class TestOne {
	int x;

	TestOne(int i) {
		x = i;
	}

	TestOne() {
		x = 0;
	}
}

public class MainTwo {
	public static void main(String[] args) {
		// t is a reference
		TestOne t = new TestOne(5);

		// Reference is passed and a copy of reference
		// is created in change()
		change(t);

		// New value of x is printed
		System.out.println(t.x);
	}

	// This change() doesn't change the reference, it only
	// changes member of object referred by reference
	public static void change(TestOne t) {
		t.x = 10;
	}
}


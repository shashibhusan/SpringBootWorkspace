package tricky.question;

public class StringOne {

	public static void main(String[] args) {
//-----------------------------------------------
		String c = "xyzabc";
		String b = "xyzAbc";
		String a = c.replace('a', 'A');
		if (a == b) {
			System.out.println("a==b are equals");
		} else if (a.equals(b)) {
			System.out.println("a.equals(b) are equals");
		}

//-----------------------------------------------
		String x = new String("xyz");
		String y = "abc";
		x = x.concat(y);
		String z = "xyzabc";
		if (x == z) {
			System.out.println("x==z are equals");
		}
		if (x.equals(z)) {
			System.out.println("x.equals(y) are equals");
		}
	}

}

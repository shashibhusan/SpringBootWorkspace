
class Parent {
	int value = 1000;

	Parent() {
		System.out.println("Parent Constructor");
	}

	public String play() {
		System.out.println("Parent class play method");
		return "Parent";
	}
}

class Child extends Parent {
	int value = 10;

	Child() {
		System.out.println("Child Constructor");
	}

	public String play() {
		System.out.println("Parent class play method");
		return "child";
	}
}

public class Important {

	public static void main(String[] args) {
		Child obj = new Child();
		System.out.println("Reference of Child Type :" + obj.play());
		Parent par = new Child();
		System.out.println("Reference of Parent Type :" + par.play());
		Parent par1 = obj;
		System.out.println("Reference of Parent Type :" + par1.play());
	}

}

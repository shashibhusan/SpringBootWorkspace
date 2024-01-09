
class InvalidAgeException extends Exception {
	InvalidAgeException(String message) {
		super(message);
	}
}

public class CustomException {

	public static void ageVaidate(int age) throws InvalidAgeException {
		if(age<18) {
			throw new InvalidAgeException("You are not elegible to vote");
		} else {
			System.out.println("Your welocome");
		}
	}
	public static void main(String[] args) {
		try {
			ageVaidate(2);
		} catch (InvalidAgeException e) {
			System.out.println("Following execption occurs : " + e);
		}
	}

}

import java.time.LocalDate;

public class TestOne {

	public static void main(String[] args) {
	
		LocalDate lt
        = LocalDate.now().minusDays(90);
		
		System.out.println("==local date="+lt);

	}

}

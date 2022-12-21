public class TestObjects {
	public static void main(String[] args) {
//creating two instances of the Employee class  
		Employee emp1 = new Employee(12, "Maria", "bhusan");
		Employee emp2 = new Employee(12, "Maria", "bhusan");
//invoking hashCode() method 

		if (emp1.equals(emp2)) {
			System.out.println("=====same===");
		} else {
			System.out.println("=====not same===");
		}
	}
	
}


package scenarioBased.Java8.program;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Employee {
	private String name;
	private int age;
	private int salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Employee(String name, int age, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
}

public class AverageSalaryOfEmployeesOlderThan30 {

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee("Shashi", 35, 20000));
		employeeList.add(new Employee("Bhusan", 31, 10000));
		employeeList.add(new Employee("Patel", 29, 5000));

		double average = employeeList.stream().filter(e -> e.getAge() > 30).mapToDouble(e -> e.getSalary()).average()
				.orElse(0.0);
		System.out.println("Average salary is : " + average);

		Employee emp = employeeList.stream().max(Comparator.comparingDouble(Employee::getSalary)).orElse(null);
		System.out.println("Name of the student with highest salary is : " + emp.getName());

	}

}

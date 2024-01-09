package java8.program;

public class Employee {
	private String name;
	private int salary;

	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		return this.salary;
	}

	@Override
	public boolean equals(Object obj) {
		Employee e = (Employee) obj;
		if (e.salary == this.salary) {
			return true;
		}
		return false;
	}

}

import java.util.Objects;

public class Employee {
	
	
	private int age;
	private String fname;
	private String lname;
	
	public Employee(int age, String fname, String lname) {
		super();
		this.age = age;
		this.fname = fname;
		this.lname = lname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age &&
        		
                Objects.equals(fname, employee.fname)&&
                Objects.equals(lname, employee.lname);
    }
}

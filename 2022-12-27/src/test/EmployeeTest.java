package test;

class Person2 {
	String name;

	public Person2() {

	}
	
	public Person2(String name) {
		this.name = name;
	}
}

class Employee extends Person2 {
	String id;

	public Employee(String id) {
		super();
	}

	public Employee(String name, String id) {
		super(name);
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
}

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e = new Employee("Lee", "123456789");
		System.out.println(e);
	}

}

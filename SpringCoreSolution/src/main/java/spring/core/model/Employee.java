package spring.core.model;

//@Data
public class Employee {
	private String name;
	private int id;
	
	
	
	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
		System.out.println("Employee.Employee()");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		System.out.println("Employee.setName()");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
		System.out.println("Employee.setId()");
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}
	
	
	
}

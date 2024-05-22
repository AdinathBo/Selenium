package practice;

public class Employee {
	
	private int id;
	private String name;
	private double salary;
	private String joiningDate;
	private String destination;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(String joiningDate) {
		this.joiningDate = joiningDate;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Employee(int id, String name, double salary, String joiningDate, String destination) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.joiningDate = joiningDate;
		this.destination = destination;
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", joiningDate=" + joiningDate
				+ ", destination=" + destination + "]";
	}
	
}

package practice;

public class Student {
	
	private int id;
	private String name;
	private String joiningdate;
	private double salary;
	private String destination;
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, String joiningdate, double salary, String destination) {
		super();
		this.id = id;
		this.name = name;
		this.joiningdate = joiningdate;
		this.salary = salary;
		this.destination = destination;
	}
	
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
	public String getJoiningdate() {
		return joiningdate;
	}
	public void setJoiningdate(String joiningdate) {
		this.joiningdate = joiningdate;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", joiningdate=" + joiningdate + ", salary=" + salary
				+ ", destination=" + destination + "]";
	}
		
}




package practice;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee = new Employee(101, "Adinath", 50000, "22 march", "Pune");
		
		Employee two = new Employee ();
		two.setId(501);
		two.setName("shubham");
		two.setSalary(70000);
		two.setDestination("mumbai");
		two.setJoiningDate("20 march");
		
		System.out.println(two);
		
		System.out.println("Employee before modification : "+employee);
		
		employee.setSalary(600000);
		
		
		
		System.out.println("Employee after modification : "+employee);
		
	}

}

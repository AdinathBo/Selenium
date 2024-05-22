package practice;

public class StudentTest {

	public static void main(String[] args) {
		
		Student st = new Student(104,"ram","23 feb",45000,"nagpur");
		
		System.out.println(st);
		
		Student st1 = new Student();
		
		st1.setId(503);
		st1.setName("shyam");
		st1.setJoiningdate("25 march 24");
		st1.setSalary(25000);
		st1.setDestination("hadapsar");
		
		System.out.println(st1);
		
	}

}

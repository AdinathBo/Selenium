package jbk;

public class Person {
	    int id;
	    String name;
	Person (int id,String name){
		this.id=id;
		this.name=name;
	}
}
class Students extends Person {
        int rollno;
        String course;
	Students(int id, String name,int rollno,String course) {
		super(id, name);
		this.rollno=rollno;
		this.course=course;	
	}	
}

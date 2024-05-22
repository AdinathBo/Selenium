package jbk;

import java.util.Scanner;
public class Student {
      int id;
      String name;
      String course;
      Float per;
      
      void accept() {
    	  Scanner s=new Scanner(System.in);
    	  System.out.println("enter id of student");
    	  id=s.nextInt();
    	  System.out.println("enter name of student");
    	  name=s.next();
    	  System.out.println("enter course of student");
    	  course=s.next();
    	  System.out.println("enter per of student");
    	  per=s.nextFloat();	  
      }
      void display() {
    	  System.out.println(id);
    	  System.out.println(name);
    	  System.out.println(course);
    	  System.out.println(per);
      }
}



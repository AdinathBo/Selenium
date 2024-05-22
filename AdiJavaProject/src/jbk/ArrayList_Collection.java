package jbk;

import java.util.ArrayList;

public class ArrayList_Collection {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("raman");
		al.add("rahul");
		al.add("vaibhav");
		System.out.println(al);
		
		al.add(3,"radha");             //add another element with alternate position.
		al.add(1,"yogesh");
		al.add(5,"rushikesh");
		al.add(6,"renuka");
		
		al.remove(4);          //remove element.
		
		al.set(2, "gajanan");    //Replace element
		
		System.out.println(al.get(1));      //print those element we want.
		
		al.clear();                         //clear whole array.
		System.out.println(al);
	}

}

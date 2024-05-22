package test_ng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG4 {
	
	@Test
	public void h() {
		System.out.println("this is h test case method");
	}
	
	@Test
	public void z() {
		System.out.println("this is z test case method");
	}
	
	@BeforeMethod
	public void f() {
		System.out.println("this is f test case method");
	}
	
	@AfterMethod
	public void s() {
		System.out.println("this is s test case method");
	}
}

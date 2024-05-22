package test_ng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG3 {
	
	//STCM
	
	@AfterMethod
	public void s() {
		System.out.println("this is s test case method");
	}
	
	@BeforeSuite
	public void p() {
		System.out.println("this is p test case method");
	}
	
	@Test
	public void a() {
		System.out.println("this is a test case method");
	}
	
	@BeforeTest
	public void f() {
		System.out.println("this is f test case method");
	}
	
	@Test
	public void z() {
		System.out.println("this is z test case method");
	}
	
	@Test
	public void k() {
		System.out.println("this is k test case method");
	}
}

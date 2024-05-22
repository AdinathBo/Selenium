package javapackage;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook2 {
	
	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter username/phone number");
		String un=sc.next();
		
		System.out.println("Please enter password");
		String pw=sc.next();
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(un);
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(pw);
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}

}

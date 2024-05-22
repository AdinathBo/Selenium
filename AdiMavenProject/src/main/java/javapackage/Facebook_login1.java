package javapackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_login1 {
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://paytm.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.manage().window().minimize();
		Thread.sleep(2000);
		
		//driver.navigate().forward();
		//Thread.sleep(2000);
		
		//driver.navigate().back();
		//Thread.sleep(2000);
		
		//driver.navigate().refresh();
		//Thread.sleep(2000);
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
	}

}

package javapackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Login {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.manage().window().minimize();
		Thread.sleep(3000);
		
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
		driver.close();
	}

}

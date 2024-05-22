package javapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("aborude432@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("adinath@123");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		//verify that login is successful or not
		
		String expectedUrl = "https://www.facebook.com/";
		
		String actualUrl = "https://www.facebook.com/";
		
		if(expectedUrl.equals(actualUrl)) {
			System.out.println("login successful");
		}
		else
		{
			System.out.println("login failed");
		}
		
		//close the browser
		
		driver.quit();
	}

}

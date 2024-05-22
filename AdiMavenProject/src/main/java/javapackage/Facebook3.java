package javapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook3 {
	
	public static void main(String[] args) throws Exception  {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='radio'][@value='1']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='radio'][@value='2']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='radio'][@value='-1']")).click();
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.xpath("//input[@type='radio'][@value='1']")).isEnabled());
		
		System.out.println(driver.findElement(By.xpath("//input[@type='radio'][@value='2']")).isDisplayed());
		
		System.out.println(driver.findElement(By.xpath("//input[@type='radio'][@value='-1']")).isSelected());
	}

}

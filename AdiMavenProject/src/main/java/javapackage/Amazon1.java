package javapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon1 {
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/s?k=vivo+t2+pro+5g+mobile&crid=37KJELFF9HR87&sprefix=vivo+t2+pro+5g+mobile%2Caps%2C246&ref=nb_sb_noss_1");
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("vivo t2 pro 5g mobile");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//img[@class='s-image'][@data-image-index='1']")).click();
		//driver.findElement(By.linkText("Vivo T2 Pro 5G (Dune Gold, 256 GB) (8 GB RAM)")).click();
		//Thread.sleep(2000);
		
	}

}

package javapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

        public class YoutubeSong1 {

	    public static void main(String[] args) {
	        // Set the path to your chromedriver. Make sure to download the appropriate webdriver for your browser.
	        // You can download chromedriver from: https://sites.google.com/a/chromium.org/chromedriver/downloads

	        // Initialize Chrome WebDriver
	        WebDriver driver = new ChromeDriver();

	        // Open YouTube
	        driver.get("https://www.youtube.com");

	        // Wait for 3 seconds for the page to load
	        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

	        // Find the search input field and search for the song
	        WebElement searchBox = driver.findElement(By.id("search"));
	        searchBox.sendKeys("khairiyat puchho");
	        searchBox.sendKeys(Keys.RETURN);

	        // Wait for 3 seconds for the search results to load
	        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

	        // Click on the first video that appears in the search results
	        WebElement video = driver.findElement(By.xpath("//*[@id='contents']/ytd-video-renderer[1]"));
	        video.click();

	        // Wait for 5 seconds to let the video load
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	        // Close the browser after 30 seconds
	        try {
	            Thread.sleep(30000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        driver.quit();
	    }
}

	


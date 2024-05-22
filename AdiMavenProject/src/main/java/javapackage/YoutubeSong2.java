package javapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Scanner;

    public class YoutubeSong2 {    	

    	    public static void main(String[] args) {
    	        // Set the path to your chromedriver    	        

    	        // Initialize Chrome WebDriver
    	        WebDriver driver = new ChromeDriver();

    	        // Open YouTube
    	        driver.get("https://www.youtube.com");

    	        // Create a Scanner object to get input from the user
    	        Scanner scanner = new Scanner(System.in);
    	        System.out.print("Enter the song name: ");
    	        String songName = scanner.nextLine();

    	        // Find the search input field and search for the song
    	        WebElement searchBox = driver.findElement(By.name("search_query"));
    	        searchBox.sendKeys(songName);
    	        searchBox.sendKeys(Keys.RETURN);

    	        // Click on the first video that appears in the search results
    	        WebElement video = driver.findElement(By.xpath("//*[@id='contents']/ytd-video-renderer[1]"));
    	        video.click();
    	        
    	        driver.findElement(By.linkText("Full Song: KHAIRIYAT (BONUS TRACK) | CHHICHHORE | Sushant, Shraddha | Pritam, Amitabh B|Arijit Singh")).click();

    	        // Wait for 10 seconds for the video to load and start playing
    	        try {
    	            Thread.sleep(2000);
    	        } catch (InterruptedException e) {
    	            e.printStackTrace();
    	        }
    	        
    	       // driver.findElement(By.linkText("Full Song: KHAIRIYAT (BONUS TRACK) | CHHICHHORE | Sushant, Shraddha | Pritam, Amitabh B|Arijit Singh")).click();

    	        // Close the browser
    	        //driver.quit();
    	    }
  }



	


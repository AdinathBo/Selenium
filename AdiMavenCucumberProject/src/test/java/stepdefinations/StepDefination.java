package stepdefinations;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.AdminPage;
import utilities.ReadConfig;

public class StepDefination extends Base {

	//Hooks Concept in BDD Cucumber
	@Before
	public void setUp() throws Exception {
		System.out.println("Set up method execution before each scenario");
		
		readconfig=new ReadConfig();//Creating object of ReadConfig
		
		String browser=readconfig.getBrowser();//chrome
		
		if(browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver ();
			driver.manage().window().maximize();
			Thread.sleep(2000);
		}else if(browser.equalsIgnoreCase("firefox")) {
			driver=new ChromeDriver ();
			driver.manage().window().maximize();
			Thread.sleep(2000);
	    } else if(browser.equalsIgnoreCase("IE")) {
		    driver=new ChromeDriver ();
		    driver.manage().window().maximize();
		    Thread.sleep(2000);
	    }
	}
	@Given("User Lanch Chrome Browser")
	public void user_lanch_chrome_browser() throws Exception {
	   driver=new ChromeDriver();
	   
	   admin=new AdminPage(driver);//create object of AdminPage java class
	   Thread.sleep(1000);
	}

	@When("User open url {string}")
	public void user_open_url(String url) throws Exception {
	    driver.get(url);
	    Thread.sleep(1000);
	}

	@When("User enter Email as {string} and password as {string}")
	public void user_enter_email_as_and_password_as(String email, String Password) throws Exception {
	   admin.SetEmail(email);
	   admin.SetPassword(Password);
	   Thread.sleep(1000);
	}

	@When("User click on Login button")
	public void user_click_on_login_button() throws Exception {
	  admin.clickOnLogin();
	  Thread.sleep(1000);
	}

	@Then("User verify page title should be {string}")
	public void user_verify_page_title_should_be(String title) throws Exception {
	   
		Assert.assertEquals("Dashboard / nopCommerce administration", title);
		Thread.sleep(1000);
	}

	@Then("close browser")
	public void close_browser() throws Exception {
	   driver.close();
	   Thread.sleep(1000);
	}
	@After
	public void tearDown (Scenario sc) throws Exception {
		//System.out.println(" tearDown method will execute after each scenario");
		//capture screenshot of failed scenarios
		
		if(sc.isFailed()==true) {
			
			String filePath="C:\\Users\\adina\\eclipse-workspace\\AdiMavenCucumberProject\\Screenshot\\failedScreenshot.png";
			
			//convert WebDriver object into TakeScreenshot
			
			TakesScreenshot scrShot=(TakesScreenshot)driver;
			
			//Call getScreenshotAs()
			File scrFile=scrShot.getScreenshotAs (OutputType.FILE);
			
			Thread.sleep(2000);
			File destFile=new File("filePath");
			
			FileUtils.copyFile(scrFile, destFile);
			Thread.sleep(2000);
			
			driver.quit();
		}
	}
}

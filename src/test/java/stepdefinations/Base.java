package stepdefinations;

import org.openqa.selenium.WebDriver;

import pageobjects.AddNewCustomerPage;
import pageobjects.AdminPage;
import utilities.ReadConfig;

public class Base {
	
	WebDriver driver;
	
	AdminPage admin;

	public ReadConfig readconfig;
	
	public AddNewCustomerPage addCust;
}

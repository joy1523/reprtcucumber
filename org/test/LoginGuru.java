package org.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginGuru {
	static WebDriver driver;
	@Given("^The user in Guru login page$")
	public void the_user_in_Guru_login_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ebenezer\\eclipse-workspace\\JoyEbenezer\\SeleniumCucumber\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.get("http://www.demo.guru99.com/v4/");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		    
	}

@Given("^The user login in as manager using username and password$")
public void the_user_login_in_as_manager_using_username_and_password(DataTable credential) {
	List<String> credentialList =credential.asList(String.class);
	driver.findElement(By.name("uid")).sendKeys(credentialList.get(0));
	driver.findElement(By.name("password")).sendKeys(credentialList.get(1));
	driver.findElement(By.name("btnLogin")).click();
	
}
	
	@Given("^The user navigates to add customer page$")
	public void the_user_navigates_to_add_customer_page() {
		//driver.findElement(By.name("btnLogin")).click();
		driver.findElement(By.xpath("//a[text()='New Customer']")).click();
	    
	}

	@When("^The user enters customer details  \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void the_user_enters_customer_details(String custname, String gender, String dob, String address, String city, String state, String pin, String mobile, String email, String password) {
		driver.findElement(By.name("name")).sendKeys(custname);
		driver.findElement(By.name("rad1")).sendKeys(gender);
		driver.findElement(By.id("dob")).sendKeys(dob);
		driver.findElement(By.name("addr")).sendKeys(address);
		driver.findElement(By.name("city")).sendKeys(city);
		driver.findElement(By.name("state")).sendKeys(state);
		driver.findElement(By.name("pinno")).sendKeys(pin);
		driver.findElement(By.name("telephoneno")).sendKeys(mobile);
		driver.findElement(By.name("emailid")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(password);

	    
	}

	@When("^The user clicks reset button$")
	public void the_user_clicks_reset_button() {
	    driver.findElement(By.name("res"));
	  
	}

	@Then("^the user should be in add new customer page$")
	public void the_user_should_be_in_add_new_customer_page() {
		System.out.println("User Reset successfully"); 	   
		
	}



}

package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SampleStepDefinition {
	
	WebDriver driver;
	
	@Given("^I have launched the browser$")
	public void i_have_launched_the_browser() throws Throwable {
		//WebDriver definition
		System.setProperty("webdriver.chrome.driver","C:/Users/Kumar/Desktop/chromedriver_win32 (3)/chromedriver.exe");
		driver = new ChromeDriver();
				
	}

	@Given("^I navigate to the url$")
	public void i_navigate_to_the_url() throws Throwable {
		//Navigate to the WebPage
		String url="http://horse-dev.azurewebsites.net/";
		driver.get(url);
		System.out.println("WebApplication launched successfully");
	}

	@When("^I enter username$")
	public void i_enter_username() throws Throwable {
		//Implicit Wait
				driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				
				//Identify the UserName textBox
				WebElement Username = driver.findElement(By.id("UserName"));
				Username.sendKeys("ray");
				
				
	}

	@When("^I enter password$")
	public void i_enter_password() throws Throwable {
		//Identify the password textBox
		WebElement Password = driver.findElement(By.id("Password"));
		//Send value to the password textBox
		Password.sendKeys("123123");
		System.out.println("Entered Password");
		
		
	}

	@When("^I click on the Login button$")
	public void i_click_on_the_Login_button() throws Throwable {
		//Identify Save Button
				WebElement Save = driver.findElement (By.xpath
				("//*[@id=\"loginForm\"]/form/div[3]/input[1]"));
				
				//Click on Save Button
				Save.click();
				System.out.println("Clicked on Save button");
	}

	@Then("^I should see the home page$")
	public void i_should_see_the_home_page() throws Throwable {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Then("^I validate with any of the button name on the home page$")
	public void i_validate_with_any_of_the_button_name_on_the_home_page() throws Throwable {
		//Verification
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		boolean verifyMsg = driver.findElement(By.id("addnewjob")).isDisplayed();
		
		if(verifyMsg == true)
		{
			System.out.println("Test Pass, login successful");
		}
		else
		{
			System.out.println("Test Fail, login failed");

		}
	}
}
package sampleProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//WebDriver definition
		System.setProperty("webdriver.chrome.driver","C:/Users/Kumar/Desktop/chromedriver_win32 (3)/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Navigate to the WebPage
		String url="http://horse-dev.azurewebsites.net/";
		driver.get(url);
		System.out.println("WebApplication launched successfully");
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		//Identify the UserName textBox
		WebElement Username = driver.findElement(By.id("UserName"));
		Username.sendKeys("ray");
		
		//Identify the password textBox
		WebElement Password = driver.findElement(By.id("Password"));
		//Send value to the password textBox
		Password.sendKeys("123123");
		System.out.println("Entered Password");
		
		//Identify Save Button
		WebElement Save = driver.findElement (By.xpath
		("//*[@id=\"loginForm\"]/form/div[3]/input[1]"));
		
		//Click on Save Button
		Save.click();
		System.out.println("Clicked on Save button");

	}

}

package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class NavigartionalMethods {

	public static void main(String[] args) throws Exception {
		
		//Create an Webdriver Object
		WebDriver driver;
		//Open Chrome browser
		driver  = new ChromeDriver();
		
		//FB URL
		driver.get("https://www.facebook.com/");
		//Click on ForgotPassword hyper link
		driver.findElement(By.linkText("Forgot password?")).click();
		Thread.sleep(5000);
		
		//Go back to Login page
		driver.navigate().back();
		Thread.sleep(5000);
		
		//Go to ForgotPassword page
		driver.navigate().forward();
		Thread.sleep(5000);
		
		//Type something on USER editbox,
		driver.findElement(By.id("identify_email")).sendKeys("Hello Keya u r missing sendkeys method");
		Thread.sleep(5000);
		//Then click on Refresh icon from top left corner of the page
		driver.navigate().refresh();
		
		
	}

}

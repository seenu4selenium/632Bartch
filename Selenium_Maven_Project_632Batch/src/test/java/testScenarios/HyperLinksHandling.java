package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HyperLinksHandling {

	public static void main(String[] args) {
		// Click on ForgotPassword hyperlink on FB app
		WebDriver driver;

		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Forgot password?")).click();
		//driver.findElement(By.partialLinkText("rgo")).click();
		
		//Gmail
		//Images
	
		//do click on im ages  link with partial link  locator with the help of 'ma' text
//
//		driver.get("https://www.google.com/");	
//		driver.findElement(By.partialLinkText("mag")).click();
	}

}

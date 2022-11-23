package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class OpenSourceDemo {

	public static void main(String[] args) throws Exception {
		// Create Webdriver object
		WebDriver driver;

		// write Chrome browser launch code
		driver = new ChromeDriver();

		// Type URL into Chrome browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//Wait statement
		Thread.sleep(9000);
		
		// Type USERNAME
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		// Click on Loginbutton
		driver.findElement(By.xpath(
			"//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

	}

}

package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class FB_CreateAccount {

	public static void main(String[] args) throws Exception {

		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//Create new account
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		//new Select(driver.findElement(By.id("month"))).selectByVisibleText("Mar");
		//new Select(driver.findElement(By.id("month"))).selectByIndex(5);
		new Select(driver.findElement(By.id("month"))).selectByValue("1");
	}

}

package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Assignment7_2_TestAutomationDropdowns {

	public static void main(String[] args) throws Exception {

		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(5000);

		// Maximize the window
		driver.manage().window().maximize();

		// Selecting Dropdown values
		new Select(driver.findElement(By.id("speed"))).selectByVisibleText("Fast");
		new Select(driver.findElement(By.name("files"))).selectByVisibleText("PDF file");
		new Select(driver.findElement(By.id("number"))).selectByVisibleText("4");
		new Select(driver.findElement(By.name("products"))).selectByVisibleText("Iphone");
		new Select(driver.findElement(By.id("animals"))).selectByVisibleText("Baby Cat");
	}

}

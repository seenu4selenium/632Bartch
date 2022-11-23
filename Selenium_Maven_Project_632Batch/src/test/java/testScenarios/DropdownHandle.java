package testScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropdownHandle {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		driver = new ChromeDriver();
		// Maximize the window
		driver.manage().window().maximize();
		driver.get("https://collegeweeklive.com/go-signup/");
		Thread.sleep(6000);

		// dropdown code
		new Select(driver.findElement(By.id("country"))).selectByVisibleText("EGYPT");
		
		//Get all dropdown optional values
		List<WebElement> xyz = new Select(driver.findElement(By.id("country"))).getOptions();
		//Get the country dropdown size
		System.out.println(xyz.size());
		
		//Print country dropdown optional values
		//will use Advance forloop/Enhanced forloop/Foreach loop
		for (WebElement webElement : xyz) {
			System.out.println(webElement.getText());
		}
	}

}

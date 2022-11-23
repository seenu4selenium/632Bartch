package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Assignment7_1_CollegeWeekDropdowns {

	public static void main(String[] args) throws Exception {

		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://collegeweeklive.com/go-signup");
		Thread.sleep(6000);
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Drop down values
		new Select(driver.findElement(By.id("country"))).selectByVisibleText("INDIA");
		new Select(driver.findElement(By.name("attendeeType"))).selectByVisibleText("Student Looking for Graduate Degree");
		
	}

}

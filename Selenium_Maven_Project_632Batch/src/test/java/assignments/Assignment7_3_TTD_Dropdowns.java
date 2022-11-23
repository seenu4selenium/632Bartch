package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Assignment7_3_TTD_Dropdowns {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://tirupatibalaji.ap.gov.in/#/registration");
		Thread.sleep(6000);
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Drop down values
		new Select(driver.findElement(By.name("countryS"))).selectByVisibleText("India");
		new Select(driver.findElement(By.name("stateS"))).selectByVisibleText("Telangana");
		Thread.sleep(5000);
		
		//Refresh the page
		driver.navigate().refresh();
		Thread.sleep(5000);
		
		//Selecting another options in Dropdowns
		new Select(driver.findElement(By.name("countryS"))).selectByVisibleText("United States");
		driver.findElement(By.name("statesS")).sendKeys("California");
		
	}

}


package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment6 {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		driver = new ChromeDriver();
		//Maximize the window
		driver.manage().window().maximize();
		
		//Open URL 	https://myaccount.greenmountain.com/en_US/register
		driver.get("https://myaccount.greenmountain.com/en_US/register");
		//Click on "Contact Us" link
		driver.findElement(By.xpath("//*[@id=\"frmRegister\"]/div[10]/div[2]/a")).click();
		//Close the currentwindow
		Thread.sleep(6000);
	    driver.close();
		//or Quit the all windows
	    Thread.sleep(6000);
		driver.quit();
		
		

	}

}

	
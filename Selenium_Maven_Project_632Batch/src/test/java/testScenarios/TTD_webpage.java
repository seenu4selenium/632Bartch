package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TTD_webpage {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://tirupatibalaji.ap.gov.in/#/login");
		//wait statements
		Thread.sleep(6000);
		// Click on IOS app download icon
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[11]/div[2]/div/div[1]/ul/li[1]/a/img")).click();
		Thread.sleep(6000);
		//Now i am able to see two tabs on browser, one is parent tab another one is child tab
		//Want to Close my browser
		//Close(): Close the current browser window(parent tab, here our system cursor pint is there)
		driver.close();
		//Quit(): Close the current browser window(parent tab) and its related child windows (child tab)also.
		//driver.quit();
		
	}

}

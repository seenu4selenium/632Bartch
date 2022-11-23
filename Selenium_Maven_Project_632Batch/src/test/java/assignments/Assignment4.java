package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://tirupatibalaji.ap.gov.in/#/login");
		Thread.sleep(3000);
		// Click on SignUp hyper link
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[11]/div[2]/div/div[1]/form/fieldset[5]/span/a"))
				.click();
		Thread.sleep(3000);
		// Click on Institution radio button
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[4]/div/div[1]/div/div[3]/ul/li[2]/label")).click();
		// Type any dummy name on Institution Name edit box
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[4]/div/div[1]/form/div[1]/div[2]/div[2]/input"))
				.sendKeys("abcdef");

	}

}

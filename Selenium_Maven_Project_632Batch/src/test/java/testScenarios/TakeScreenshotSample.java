package testScenarios;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class TakeScreenshotSample {
	public static void main(String[] args) throws Exception {
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");

		// Create new account
		// driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		driver.findElement(By.xpath("//*[@id=\"banner\"]/div[2]/a")).click();
		Thread.sleep(3000);

		// Without fill any data, do click on Login Button
		driver.findElement(By.id("Button2")).click();
		Thread.sleep(3000);
		
		//driver.switchTo().alert().accept();
	//	Thread.sleep(3000);

		

//		Robot rb = new Robot(); 
//		rb.keyPress(KeyEvent.VK_WINDOWS); 
//		rb.keyPress(KeyEvent.VK_PRINTSCREEN); 
//		rb.keyRelease(KeyEvent.VK_PRINTSCREEN); 
//		rb.keyRelease(KeyEvent.VK_WINDOWS);
		
		
		
//		//Ashot code for full page
//		Screenshot s=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
//        ImageIO.write(s.getImage(),"PNG",new File(".\\screenshots\\testalert.png"));
//       
		Date d = new Date();
		DateFormat df = new SimpleDateFormat("ddMMMyyyy_HHmmss");
		String timeStamp = df.format(d);
		
		
		//Take a screenshot of the page
		//Take the screenshot and store it into as a file (in your RAM location)
		File abc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//From the RAM location, want to move the screenshots to Specific folder
		FileHandler.copy(abc, new File(".\\screenshots\\testalert"+timeStamp+".png"));
	
		
		
	}
}

package seleniumProject;

import java.util.concurrent.TimeUnit; 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MouseMomentConcept  {
public static void main(String[] args) throws InterruptedException{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.get("http://spicejet.com/");
	
	Actions action = new Actions(driver);
	action.moveToElement(driver.findElement(By.linkText("ADD-ONS"))).build().perform();
	Thread.sleep(3000);
	
	driver.findElement(By.linkText("MyFlexiPlan")).click();
	}
}

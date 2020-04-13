package seleniumProject;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
public class Locators {
	public static void main (String args[]) {
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElement(By.name("firstname")).sendKeys("Devanshika");
	    driver.findElement(By.name("lastname")).sendKeys("Seth");
	    driver.findElement(By.name("reg_email__")).sendKeys("7987369522");
	    
	   
	    driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Mishru2805");
	    
	    driver.findElement(By.id("day")).sendKeys("28");
		driver.findElement(By.id("month")).sendKeys("Jan");
		driver.findElement(By.id("year")).sendKeys("1997");
		
		driver.findElement(By.xpath("//input[@name='sex']")).click();
		
	/*	driver.findElement(By.xpath("//button[@name='websubmit']")).click();*/
		
	}

}

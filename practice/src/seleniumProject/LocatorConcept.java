package seleniumProject;
 import java.util.concurrent.TimeUnit;
 import org.openqa.selenium.By;
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.chrome.ChromeDriver;
 import org.openqa.selenium.support.ui.Select;
public class LocatorConcept {
public static void main (String[] args) {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2943&ru=");//enterurl
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	

	

	driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys("Devanshika");
	driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys("Piparsania");
	driver.findElement(By.xpath("//*[@id='address1']")).sendKeys("#973 SVNS ladies Pg");
	driver.findElement(By.xpath("//*[@id='city']")).sendKeys("Bangalore");
	driver.findElement(By.xpath("//*[@id='state']")).sendKeys("california");
	driver.findElement(By.xpath("//*[@id='zip']")).sendKeys("560076");
	driver.findElement(By.xpath("//*[@id='dayphone1']")).sendKeys("798");
	driver.findElement(By.xpath("//*[@id='dayphone2']")).sendKeys("736");
	driver.findElement(By.xpath("//*[@id='dayphone3']")).sendKeys("9522");
	driver.findElement(By.xpath("//*[@id='email']")).sendKeys("devanshika97@gmail.com");
	driver.findElement(By.xpath("//*[@id='retype_email']")).sendKeys("devanshika97@gmail.com");
	driver.findElement(By.xpath("//*[@id='userid']")).sendKeys("Devanshika10");
	driver.findElement(By.xpath("//*[@id='PASSWORD']")).sendKeys("mishru2805");
	driver.findElement(By.xpath("//*[@id='rpass']")).sendKeys("mishru2805");
	driver.findElement(By.xpath("//*[@id='SECRET_QUESTION']")).sendKeys("What is your pet's name?");
	driver.findElement(By.xpath("//*[@id='SECRET_ANSWER']")).sendKeys("Chiku");
	driver.findElement(By.xpath("//*[@id='birthdate2']")).sendKeys("January");
	driver.findElement(By.xpath("//*[@id='birthdate1']")).sendKeys("28");
	driver.findElement(By.xpath("//*[@id='birthdate3']")).sendKeys("1997");
	driver.findElement(By.xpath("//*[@id='acceptq1']")).click();
	driver.findElement(By.xpath("//*[@class='btn']")).click();

	/*
	
	driver.findElement(By.xpath("//*[@name='']")).sendKeys("");
	driver.findElement(By.xpath("//*[@name='']")).click();
	
	driver.findElement(By.xpath("//*[@class='']")).sendKeys("");
	driver.findElement(By.xpath("//*[@class='']")).click();
	
	driver.findElement(By.xpath("//input[@id='']")).sendKeys("");
	driver.findElement(By.xpath("//input[@class='']")).sendKeys("");
	
	
	driver.findElement(By.xpath("//input[contain(@id,'')]")).sendKeys("");
	driver.findElement(By.xpath("//input[contain(@name,'')]")).sendKeys("");
	driver.findElement(By.xpath("//a[contain(text(),)]")).sendKeys("");
	driver.findElement(By.xpath("//input[start-with(@id,'')]")).sendKeys("");
	driver.findElement(By.xpath("//input[end-with(@id,'')]")).sendKeys("");
	
	driver.findElement(By.id("")).sendKeys("");
	
	driver.findElement(By.className("")).sendKeys("");
	
	driver.findElement(By.name("")).sendKeys("");
	
	driver.findElement(By.cssSelector("")).sendKeys("");
	
	driver.findElement(By.linkText("")).sendKeys("");
	
	driver.findElement(By.partialLinkText("")).sendKeys("");
	
	driver.findElement(By.tagName("")).sendKeys("");
	*/
	/*Select select = new Select(driver.findElement(By.xpath("//input[@name='state']")));
			select.selectByVisibleText("California");
			*/
	}
	
	
}

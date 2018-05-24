package nycivfanddonor;

import java.util.concurrent.TimeUnit;
import org.testng.SkipException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class amazon  {
 WebDriver driver;
	@BeforeMethod
  public void setup() {
		System.setProperty("webdriver.gecko.driver","/Users/muhammedrislam/selenium_jar_files/geckodriver");
		  driver = new FirefoxDriver();
		  driver.manage().window().fullscreen();
		  driver.manage().deleteAllCookies();
		  driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		  driver.get("http:www.amazon.com");
		 }		
	
@Test
public void gettilte() {
String tilte = driver.getTitle();
System.out.println("gettile");
	
	}
@Test
public void clicktap() {
driver.findElement(By.linkText("Departments")).click();
}
@Test
public void clicktop2() {
	driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div[2]/div/a[2]/span[1]")).click();
driver.findElement(By.xpath("//*[@id=\'ap_email\']")).sendKeys("7181318");
driver.findElement(By.xpath("//*[@id=\'continue\']")).click();
driver.findElement(By.xpath("//*[@id=\'createAccountSubmit\']")).click();
driver.findElement(By.xpath("//*[@id=\'ap_customer_name\']")).sendKeys("tony");
driver.findElement(By.xpath("//*[@id=\'ap_email\']")).sendKeys("mddd@email.com");
//driver.findElement(By.xpath("")).click();

}
@Test
public void FailTest() {
driver.findElement(By.linkText("department")).click();
}
@Test
public void SkipTest()
{
	System.out.println ("I am going to skip this test");
	throw new SkipException ("Skipping because this tc is no longer needed");

}









@AfterMethod
public void teardown() {
driver.quit();
}







}

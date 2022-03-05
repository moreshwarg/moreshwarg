package Package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestByAnnotation {
	private WebDriver  driver ;

	@BeforeTest
	 @Parameters("browser")
	 public void launchBroser(String browserName) {
			System.out.println("launch the browser1");
          if (browserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
			 driver= new ChromeDriver();
		 
			System.out.println("launch the browser1");
			if (browserName.equals("Firefox")) {

//			System.setProperty("webdriver.gecko.driver","E:\\Selenium\\geckodriver.exe");
//			 driver= new ChromeDriver();
				
			 System.setProperty("webdriver.gecko.driver","E:\\selenium\\geckodriver.exe");
				 driver= new FirefoxDriver();
			
			 
			} 
			  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			}
          }

	
	@BeforeClass
public void launchBrowser() {
	System.out.println("launch the broser");
	
}
	
@BeforeMethod
public void loginToTheApplication() {
	System.out.println("Login To The Application");
	
}
@Test(enabled = false)
public void TestA() {
	System.out.println("TestA");
}
@Test (enabled = false)
public void TestB() throws InterruptedException {
	System.out.println("TestB");
Thread.sleep(1000);
}
@Test
public void TestC() {
	System.out.println("TestC");
//Assert.fail(); //fail test
}
@Test
public void TestD() {
	System.out.println("TestD");
}

@AfterMethod
public void logOutTheApplication() {
	System.out.println("logOut The Application");
}
@AfterClass
public void closeTheBrowser() {
	System.out.println("Close The Browser");
}
@AfterTest
public void closeBowser1() {
	System.out.println("close the browser1");
	driver.quit();
	driver= null;
	System.gc();
}
}

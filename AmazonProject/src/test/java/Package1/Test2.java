package Package1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Base.Browser;
import PomAmazon.HeaderPage;

public class Test2 extends Browser{
	private HeaderPage headerPage ;
	private WebDriver  driver ;
	 @BeforeTest
	 @Parameters("browser")
	 public void launchBroser(String browserName) 
	 {
         
			if (browserName.equals("Chrome"))
			{
          driver = launchChromeBrowser();            
			}
			if (browserName.equals("Firefox"))
			{
             driver = launchFirefoxBrowser();			   } 
             }
          
	@BeforeClass
	public void launchBrowser() {
		System.out.println("launch the broser");
	      headerPage = new HeaderPage(driver);
	
	}
		
	@BeforeMethod
	public void loginToTheApplication() throws InterruptedException {
		System.out.println("Login To The Application");
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);	
	}
	@Test
	public void verifyTheUserTab() throws InterruptedException {
		System.out.println("verify The USer Tab");
		headerPage.bestSellerClick();
		Thread.sleep(2000);

		String url1= driver.getCurrentUrl();
		String title1=driver.getTitle();
		if(url1.equals("https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers")) {
			System.out.println("Pass");}
			else
			{
				System.out.println("Fail");
			}

	if(title1.equals("Amazon.in Bestsellers: The most popular items on Amazon")) {
	System.out.println("Pass");}
	else

	System.out.println("Fail");
		
		
	}
	@Test(enabled = false)
	public void verifyTheUserTab1() throws InterruptedException {
		System.out.println("verify The USer Tab");
	headerPage.mobileClick();
	Thread.sleep(2000);	
	String url1= driver.getCurrentUrl();
	String title1=driver.getTitle();
	if(url1.equals("https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles")) {
		System.out.println("Pass");}
		else
		{
			System.out.println("Fail");
		}

if(title1.equals("Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in")) {
System.out.println("Pass");}
else

System.out.println("Fail");

	}
	@Test(enabled = false)
	public void verifyTheUserTab3() throws InterruptedException {
		System.out.println("verify The USer Tab");
		headerPage.todaysDealClick();
		Thread.sleep(2000);
		String url1= driver.getCurrentUrl();
		String title1=driver.getTitle();
		if(url1.equals("https://www.amazon.in/deals?ref_=nav_cs_gb")) {
			System.out.println("Pass");}
			else
			{
				System.out.println("Fail");
			}

	if(title1.equals("Amazon.in - Today's Deals")) {
	System.out.println("Pass");}
	else
	System.out.println("Fail");
	}
	@Test(enabled = false)
	public void verifyTheUserTab4() throws InterruptedException {
		System.out.println("verify The USer Tab");
		headerPage.custmerServiceClick();
		Thread.sleep(2000);
		String url1= driver.getCurrentUrl();
		String title1=driver.getTitle();
		if(url1.equals("https://www.amazon.in/gp/help/customer/display.html?nodeId=200507590&ref_=nav_cs_help")) {
			System.out.println("Pass");}
			else
			{
				System.out.println("Fail");
			}

	if(title1.equals("Help - Amazon Customer Service")) {
	System.out.println("Pass");}
	else

	System.out.println("Fail");

	}
	@Test(enabled = false)
	public void verifyTheUserTab5() throws InterruptedException {
		System.out.println("verify The USer Tab");
		headerPage.electronicsClick();
		Thread.sleep(2000);
		String url1= driver.getCurrentUrl();
		String title1=driver.getTitle();
		if(url1.equals("https://www.amazon.in/electronics/b/?ie=UTF8&node=976419031&ref_=nav_cs_electronics")) {
			System.out.println("Pass");}
			else
			{
				System.out.println("Fail");
			}

	if(title1.equals("Electronics Store: Buy Electronics products Online at Best Prices in India at Amazon.in")) {
	System.out.println("Pass");}
	else

	System.out.println("Fail");

	}
	@AfterMethod
	public void logOutTheApplication() {
		System.out.println("logOut The Application");
	}
	@AfterClass
	public void closeTheBrowser() {
		System.out.println("Close The Browser");
		headerPage= null;
	
	}

	@AfterTest
	public void closeBowser1() {
		System.out.println("close the browser1");
		driver.quit();
		driver= null;
		System.gc();
	}
}

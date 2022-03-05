package Package1;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PomAmazon.AddToCartPage;
import PomAmazon.ChildWindowOfAmazon;
import PomAmazon.HeaderPage;
import PomAmazon.LoginPageAmazon;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		// HeaderPage
		HeaderPage headerPage = new HeaderPage(driver);
//		headerPage.allSearchClick();
		headerPage.bestSellerClick();
		Thread.sleep(2000);
		headerPage.mobileClick();
		Thread.sleep(2000);
		headerPage.todaysDealClick();
		Thread.sleep(2000);
		headerPage.custmerServiceClick();
		Thread.sleep(2000);
		headerPage.electronicsClick();
		Thread.sleep(2000);

		//loginpage
		LoginPageAmazon loginPageAmazon = new LoginPageAmazon(driver);
		loginPageAmazon.searchtextWindowOfAmazon();
		loginPageAmazon.clickOnsearchingButton();
		Thread.sleep(2000);

		// Child Window
		ChildWindowOfAmazon childWindowOfAmazon=new ChildWindowOfAmazon(driver);
		childWindowOfAmazon.selectFirstMObile();
		Thread.sleep(2000);
		
		// Add to cart page
		AddToCartPage AddToCartPage =new AddToCartPage(driver);
//		AddToCartPage.addToCartFirstMobile();
		ArrayList<String> addres = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addres.get(1));
        AddToCartPage.addToCartFirstMobile();
		Thread.sleep(2000);

        
        driver.close();        
        
        
        
        
  //      String url=obj.getCurrentUrl();
//		String title=obj.getTitle();
//		
//		if(url.equals("https://www.amazon.in")) {
//			System.out.println("Pass");
//		}
//		else
//			System.out.println("Fail");
//		
//		
//		
//		String url1=obj.getCurrentUrl();
//	    String title1=obj.getTitle();			
//	if(url1.equals("https://www.amazon.in/Samsung-Storage-Snapdragon-sAMOLED-Display/"
//			+ "dp/B09CV6FJ62/ref=sr_1_2_sspa?crid=23IOELW18ZGFN&keywords=mobile+phone&"
//			+ "qid=1644950387&sprefix=mobile+phone%2Caps%2C906&sr=8-2-spons&psc=1&spLa=ZW"
//			+ "5jcnlwdGVkUXVhbGlmaWVyPUEzQjlCUDk0TFJFMlpaJmVuY3J5cHRlZElkPUEwMTMzNDQyMTl"
//			+ "HSkk3VzMyWFFXVyZlbmNyeXB0ZWRBZElkPUEwODc0OTU3Mkd"
//			+ "IRTZGSTFGWFM3TiZ3aWRnZXROYW1lPXNwX2F0ZiZhY3Rpb249Y2xpY2tSZWRpcmVjdCZkb05vdExvZ0NsaWNrPXRydWU="));
//	
//	
	}

}

package PomAmazon;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {

	@FindBy (xpath = "//span[text()='Add to Cart']")
	private WebElement addtocart ;
	
	private WebDriver driver;
	
	public AddToCartPage (WebDriver driver)
	{
		PageFactory.initElements(driver,this);}
	
	public void addToCartFirstMobile()
	{JavascriptExecutor jse =(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView();",addtocart);
		addtocart.click();
		    
//		Actions act = new Actions(obj);
//			   
//		WebElement remove2 = drivers.findElement(By.xpath("//div[text()='Remove']"));
//		 act.moveToElement(remove2).click().build().perform();
//		
	}
	
	
}

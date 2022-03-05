package PomAmazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageAmazon {

	@FindBy (xpath = "//input[@id='twotabsearchtextbox']")
	private WebElement searchtextWindow ;
	
	@FindBy (xpath = "//input[@id='nav-search-submit-button']")
	private WebElement searchingButton ;
	
	public LoginPageAmazon(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void searchtextWindowOfAmazon() {
		searchtextWindow.sendKeys("oppo reno2 mobile");
	}
	public void clickOnsearchingButton() {
		searchingButton.click();
	}
	
	
	
	

}

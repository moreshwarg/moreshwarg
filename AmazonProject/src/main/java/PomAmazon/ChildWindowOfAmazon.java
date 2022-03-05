package PomAmazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChildWindowOfAmazon {
@FindBy ( xpath = "(//img[@class='s-image'])[2]")
private WebElement mobileSearch ;




public ChildWindowOfAmazon (WebDriver driver)
{
	PageFactory.initElements(driver,this);}

 
public void selectFirstMObile() {
	mobileSearch.click();
}

}

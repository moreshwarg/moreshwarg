package PomAmazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderPage {
	@FindBy ( xpath = "//a[@id='nav-hamburger-menu']")
	private WebElement allSearch ;

	@FindBy ( xpath = "//a[@data-csa-c-slot-id='nav_cs_0']")
	private WebElement bestSeller ;

	@FindBy ( xpath = "//a[@data-csa-c-content-id='nav_cs_mobiles']")
	private WebElement mobile ;

	@FindBy ( xpath = "//a[@data-csa-c-content-id='nav_cs_gb']")
	private WebElement todaysDeal ;

	@FindBy ( xpath = "//a[@data-csa-c-slot-id='nav_cs_3']")
	private WebElement custmerService ;

	@FindBy ( xpath = "//a[@data-csa-c-slot-id='nav_cs_4']")
	private WebElement electronics ;

    public HeaderPage (WebDriver driver)
	{
		PageFactory.initElements(driver,this);}

	 
	public void allSearchClick() {
		allSearch.click();
	}
	
	public void bestSellerClick() {
		bestSeller.click();
	}
	public void mobileClick() {
		mobile.click();
	}
	public void todaysDealClick() {
		todaysDeal.click();
	}
	public void custmerServiceClick() {
		custmerService.click();
	}
	public void electronicsClick() {
		electronics.click();
	}
	
}

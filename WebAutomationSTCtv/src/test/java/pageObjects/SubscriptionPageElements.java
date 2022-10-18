package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubscriptionPageElements {
	
	
	
	private WebDriver driver;

	public SubscriptionPageElements(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath="//a[@class='header-btns-country hide-mobile']")
	public WebElement ChangeCountry;
	
	@FindBy(id="kw")
	public WebElement SelectKuwait;
	
	@FindBy(id="bh")
	public WebElement SelectBahrain;
	
	@FindBy(xpath="//a[@id='changeLanguageButton']")
	public WebElement ChangeLang;
	
	@FindBy(xpath="//h1[contains(text(),'Premium')]")
	public WebElement TypePremium;
	
	@FindBy(xpath="//h1[contains(text(),'Classic')]")
	public WebElement TypeClassic;
	
	@FindBy(xpath="//h1[contains(text(),'Lite')]")
	public WebElement TypeLite;
	
	@FindBy(xpath="(//*[@class='currency'])[1]")
	public WebElement Currency;
	
	@FindBy(xpath="(//*[@class='amount'])[1]")
	public WebElement LiteTypeAmount;
	
	@FindBy(xpath="(//*[@class='amount'])[2]")
	public WebElement ClassicTypeAmount;
	
	@FindBy(xpath="(//*[@class='amount'])[3]")
	public WebElement PremiumTypeAmount;
	
	
	public void ChangeCOUNTRYKW() {
		ChangeCountry.click();
		SelectKuwait.click();
	}
	
	public void ChangeCOUNTRYBH() {
		ChangeCountry.click();
		SelectBahrain.click();
	}

}

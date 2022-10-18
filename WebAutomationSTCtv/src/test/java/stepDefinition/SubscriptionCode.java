package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.SubscriptionPageElements;


public class SubscriptionCode {
	
	
	
	private WebDriver driver;
	
	SubscriptionPageElements s1;
		
	
	@Before
	public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@After
	public void closeBrowser() {
		driver.quit();
	}
	
	
	
	@Given("^Navigate to STC TV Website$")
	public void NavigateToSTC() throws Exception
	{	
		s1 = new SubscriptionPageElements(driver);
		driver.get("https://subscribe.stctv.com");
		s1.ChangeLang.click();
		
				
	}
	
	@And("^Validate Premium Type, Price and Currency$")
	public void validatePremiumTypePriceCurrency() {
		s1=new SubscriptionPageElements(driver);
		
		Boolean PremiumType= s1.TypePremium.isDisplayed();
		System.out.println("Premium Type validated ="+PremiumType);
		
		Boolean CurrencyTypePrem= s1.Currency.isDisplayed();
		System.out.println("Premium Type Currency Validated ="+CurrencyTypePrem);
		
		System.out.println("Package Type :" +s1.TypePremium.getText()+ ", Currency and Amount is " +s1.Currency.getText()+"" +s1.PremiumTypeAmount.getText());
		
		
	}
	
	@And("^Validate Classic Type, Price and Currency$")
	public void validateClassicTypePriceCurrency() {
		s1=new SubscriptionPageElements(driver);
		
		Boolean ClassicType= s1.TypeClassic.isDisplayed();
		System.out.println("Classic Type validated ="+ClassicType);
		
		Boolean CurrencyTypeClass= s1.Currency.isDisplayed();
		System.out.println("Premium Type Currency Validated ="+CurrencyTypeClass);
		
		System.out.println("Package Type :" +s1.TypeClassic.getText()+ ", Currency and Amount is " +s1.Currency.getText()+"" +s1.ClassicTypeAmount.getText());
		
	}
	
	@And("^Validate Lite Type, Price and Currency$")
	public void validateLiteroomTypePriceCurrency() {
		s1=new SubscriptionPageElements(driver);
		
		Boolean LiteType= s1.TypeLite.isDisplayed();
		System.out.println("Lite Type validated ="+LiteType);
		
		Boolean CurrencyTypeLite= s1.Currency.isDisplayed();
		System.out.println("Premium Type Currency Validated ="+CurrencyTypeLite);
		
		System.out.println("Package Type :" +s1.TypeLite.getText()+ ", Currency and Amount is " +s1.Currency.getText()+"" +s1.LiteTypeAmount.getText());
		
	}
	
	@Then("^Change Country to Kuwait$")
	public void ChangeCountrytoKuwait() {
		s1=new SubscriptionPageElements(driver);
	s1.ChangeCOUNTRYKW();
	}
	
	@Then("^Change Country to Bahrain$")
	public void ChangeCountrytoBahrain() {
		s1=new SubscriptionPageElements(driver);
		s1.ChangeCOUNTRYBH();
	}
	
	
	
	
}

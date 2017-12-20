package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LaunchBasePageToChooseLogin {

	WebDriver driver;
	
	//@FindBy(xpath="/html/body/div[8]/div[1]/div/div[4]/a[1]")
	//private WebElement accept;
	
	@FindBy(xpath="//*[contains(@href,'http://store.demoqa.com/products-page/your-account/')]")
	private WebElement account;
	
//	@FindBy(xpath="//*[@id='expandablenavigation']/ul/li[2]/div/div/div/a/span[2]")
//	private WebElement loginLink;
	
	
	public LaunchBasePageToChooseLogin(WebDriver driver){
		System.out.println("In BasePage constructor");
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
/*	public void choosepopupInBasePage ()
	{
		System.out.println("In -choose pop-up in base- method");
		if(accept.isDisplayed())
		{
			System.out.println("login button displayed in base page");
			if(accept.isEnabled())
			{
		      accept.click();
		      System.out.println("accept button enabled, hence clicking on accept in base page");
			}
		}
	}*/
	
	
	
	public void chooseLoginButtonInBasePage ()
	{
		System.out.println("In -choose login button in base- method");
		if(account.isDisplayed())
		{
			System.out.println("login button displayed in base page");
			if(account.isEnabled())
			{
				account.click();
		      System.out.println("login button enabled, hence clicking for login in base page");
		 /*     if(loginLink.isDisplayed())
		    	  loginLink.click();
		      System.out.println("login link displayed,hence clicked - in base page"); */
		      }
		}
	}
}

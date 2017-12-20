package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
//	@FindBy(xpath="/html/body/div[8]/div[1]/div/div[4]/a[1]")
//	private WebElement accept;
	
	@FindBy(xpath="//*[contains(@href,'http://store.demoqa.com/wp-login.php?action=register')]")	
	private WebElement signUp;
	
	public LoginPage(WebDriver driver){
		System.out.println("\nin LoginPage constructor");
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void signUp(){
		System.out.println("In -signUp- method");
	
		//  accept.click();
		 if(signUp.isDisplayed()){
			System.out.println("signUp button displayed in login page");
			if(signUp.isEnabled()){
				System.out.println("signUp button enabled in login page");
				signUp.click();
				 System.out.println("signUp button displayed,hence clicked - in login page");
			}else
				System.out.println("signUp button disabled in login page");
		}
		 else
			 System.out.println("signUp button not displayed in login page");
	
	}
}

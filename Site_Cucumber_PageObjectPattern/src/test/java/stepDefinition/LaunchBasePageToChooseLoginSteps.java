package stepDefinition;

import pageClasses.LaunchBasePageToChooseLogin;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class LaunchBasePageToChooseLoginSteps extends DriverFactory {

	@Given("^user is in base page ([^\"]*)$")
	public void user_is_in_base_page(String URL)throws Throwable{
		driver.get(URL);
		if(URL.contentEquals(driver.getCurrentUrl()))
		System.out.println("Application launched successfully - in steps");
		
	}
	
	// a-call, a-close
	
/*	@And("^he click on pop up in base page$")
	public void he_click_on_popup_in_base_page()throws Throwable{
		new LaunchBasePageToChooseLogin(driver).choosepopupInBasePage();
		System.out.println("pop up in base page clicked successfully - in steps");
	}*/

	
	@And("^he click on login button in base page$")
	public void he_click_on_login_button_in_base_page()throws Throwable{
		new LaunchBasePageToChooseLogin(driver).chooseLoginButtonInBasePage();
		System.out.println("login button in base page clicked successfully - in steps");
	}
	
}

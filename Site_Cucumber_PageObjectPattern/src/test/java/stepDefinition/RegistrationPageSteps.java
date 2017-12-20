package stepDefinition;

import pageClasses.LoginPage;
import pageClasses.RegistrationPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrationPageSteps extends DriverFactory {
	
	    @When("^he choose register option to register in login page$")
	    public void he_register_to_register_in_login_page(){		
		   new LoginPage(driver).signUp();
		   System.out.println("signUp button in login page clicked successfully - in steps");
	 }
	
	     @And("^he enters user name as ([^\"]*)$")
	     public void he_enters_username_as(String username){
		 new RegistrationPage(driver).userNameFiled(username);
		 System.out.println("enter username function - in steps");	
	 }
		 
		 @And("^he enters email as ([^\"]*)$")
		 public void he_enters_email_as(String email){
			 new RegistrationPage(driver).userEmail(email);
			 System.out.println("enter he_enters_email_as function - in steps");
		 }
		 @And("^click on register button$")
		 public void click_on_start_free_trail_button(){
			 new RegistrationPage(driver).register();			
			 System.out.println("Clicked register_button - in steps");
		 }	
		 
			@Then("^he closes the driver$")
			public void driver_close() throws Throwable {
				driver.close();
				System.out.println("Browser session gets closed.");
			}	
			
			@Then("^Message displayed registered Successfully$")
			public void message_displayed_Login_Successfully() throws Throwable {
				System.out.println("Registration complete. Please check your email.");
			}
			 

	/* @When("^he choose try_for_free option to register in login page$")
	 public void he_choose_try_for_free_option_to_register_in_login_page(){
		
		 new LoginPage(driver).signUp();
		 System.out.println("signUp button in login page clicked successfully - in steps");
	 }
	 
	 @And("^he enters first name as ([^\"]*)$")
	 public void he_enters_firstname_as(String firstname){
		 new RegistrationPage(driver).firstNameFiled(firstname);
		 System.out.println("enter firstname function - in steps");
	 }
	 
	 @And("^he enters last name as ([^\"]*)$")
	 public void he_enters_lastname_as(String lastname){
		 new RegistrationPage(driver).lastNameFiled(lastname);
		 System.out.println("enter lastname function - in steps");
	 }
	 
	 @And("^he enters job title as ([^\"]*)$")
	 public void he_enters_jobtitle_as(String jobtitle){
		 new RegistrationPage(driver).userJobTitle(jobtitle);
		 System.out.println("enter userJobTitle function - in steps");
	 }
	 
	 @And("^he enters email as ([^\"]*)$")
	 public void he_enters_email_as(String email){
		 new RegistrationPage(driver).userEmail(email);
		 System.out.println("enter he_enters_email_as function - in steps");
	 }
	 
	 @And("^he enters phone no as ([^\"]*)$")
	 public void he_enters_phone_no_as(String phone){
		 new RegistrationPage(driver).userPhone(phone);
		 System.out.println("enter he_enters_phone_no_as function - in steps");
	 }
	 
	 @And("^he enters company as ([^\"]*)$")
	 public void he_enters_company_as(String company){
		 new RegistrationPage(driver).companyName(company);
		 System.out.println("enter he_enters_company_as function - in steps");
	 }
	 
	 @And("^he enters employees count as ([^\"]*)$")
	 public void he_enters_employees_count_as(String employeesCount){
		 new RegistrationPage(driver).companyEmployeesCountField(employeesCount);
		 System.out.println("enter he_enters_employees_count_as function - in steps");
	 }
	 
	 @And("^he enters country as ([^\"]*)$")
	 public void he_enters_country_as(String country){
		 new RegistrationPage(driver).companyCountryFiled(country);
		 System.out.println("enter he_enters_country_as function - in steps");
	 }
	 
	 @And("^he enters language as ([^\"]*)$")
	 public void he_enters_language_as(String language){
		 new RegistrationPage(driver).companyLanguageField(language);
		 System.out.println("enter he_enters_language_as function - in steps");
	 }
	 
	 @And("^he click on I agree check box$")
	 public void he_click_on_i_agree_check_box(){
		 new RegistrationPage(driver).acceptTermsCheckBox();
		 System.out.println("Accepted he_click_on_i_agree_check_box function - in steps");
	 }
	 
	 @And("^click on start free trail button$")
	 public void click_on_start_free_trail_button(){
		 new RegistrationPage(driver).freeTrailSignUP();
		 System.out.println("Clicked click_on_start_free_trail_button - in steps");
	 }*/
	
}

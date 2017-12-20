package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {

	WebDriver driver;
	
	 @FindBy(xpath="//*[@class='message register']")
	private WebElement registrationFormTitle;
	 
	@FindBy(xpath="//input[@id='user_login']")
    private WebElement userName;
	
	@FindBy(xpath="//input[@id='user_email']")	
	private WebElement userEmail;
	
	@FindBy(xpath="//input[@id='wp-submit']")	
	private WebElement register;
	
	public RegistrationPage(WebDriver driver){
		System.out.println("\nin Registration Page constructor");
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	//registrationFormTitle
	public void registrationFormTitle(String URL){
		System.out.println("in - registrationFormTitle - method");
		if(registrationFormTitle.isDisplayed()){
			System.out.println("registrationFormTitle is displayed");
		}else
			System.out.println("registrationFormTitle is not displayed");
	}
	
	//firstName 
	public void userNameFiled(String name){
		System.out.println("in - userNameFiled - method");
			if(userName.isDisplayed()){
					userName.clear();
					userName.sendKeys(name);
					System.out.println("userName entered successfully");
					
			}else 
				System.out.println("userName is not displayed");
	}
	
	//email
	public void userEmail(String email){
		System.out.println("in - userEmail - method");
			if(userEmail.isDisplayed()){
				userEmail.sendKeys(email);
					System.out.println("Email entered successfully");
		
			}else 
				System.out.println("Email is not displayed");
	}
	
	//register
	public void register(){
		System.out.println("in - register - method");
		if(register.isDisplayed()){
			register.click();
		System.out.println(" clicked register successfully");
		}else 
					
		System.out.println("register button not displayed");
			}	
	
	
/*	 @FindBy(id="form-title-1-1")
	private WebElement registrationFormTitle;
	
	@FindBy(id="UserFirstName")
	private WebElement userFirstName;
	
	@FindBy(id="UserLastName")
	private WebElement userLastName;
	
	@FindBy(xpath="//*[@id='form-container']/ul/li[10]/div/div[2]/a/span[1]")
	//@FindBy(id="UserTitle")
	//@FindBy(name="UserTitle")
	private WebElement userJobTitleField;
	
	@FindBy(xpath="/html/body/ul[1]/li[9]/a")
	private WebElement userJobTitle;
	
	@FindBy(id="UserEmail")
	private WebElement userEmail;
	
	@FindBy(id="UserPhone")
	private WebElement userPhone;
	
	@FindBy(id="CompanyName")
	private WebElement companyName;
	
	@FindBy(xpath="//*[@id='form-container']/ul/li[14]/div/div[2]/a/span[1]")
	private WebElement companyEmployeesCountField;
	
	@FindBy(xpath="/html/body/ul[2]/li[6]/a")
	private WebElement companyEmployeesCount;
	
	@FindBy(xpath="//*[@id='form-container']/ul/li[15]/div/div[2]/a/span[1]")
	private WebElement companyCountryFiled;

	@FindBy(xpath="/html/body/ul[3]/li[100]/a")
	private WebElement companyCountry;
	
	@FindBy(xpath="//*[@id='form-container']/ul/li[17]/div/div[2]/a/span[1]")
	private WebElement companyLanguageField;
	
	//@FindBy(xpath="//*[@id='form-container']/ul/li[17]")
	//@FindBy(xpath="/html/body/ul[3]/li[1]")
	@FindBy(xpath="/html/body/ul[3]/li[2]/a")
	private WebElement companyLanguage;
	
	@FindBy(id="SubscriptionAgreement")
	private WebElement acceptTermsCheckBox;
	
	@FindBy(xpath="//*[@id='form-container']/div[2]/a/span")
	private WebElement freeTrailSignUP;

	public RegistrationPage(WebDriver driver){
		System.out.println("\nin Registration Page constructor");
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//registrationFormTitle
	public void registrationFormTitle(String URL){
		System.out.println("in - registrationFormTitle - method");
		if(registrationFormTitle.isDisplayed()){
			System.out.println("registrationFormTitle is displayed");
		}else
			System.out.println("registrationFormTitle is not displayed");
	}
	
	//firstName 
	public void firstNameFiled(String firstName){
		System.out.println("in - firstNameFiled - method");
			if(userFirstName.isDisplayed()){
					userFirstName.clear();
					userFirstName.sendKeys(firstName);
					System.out.println("firstName entered successfully");
					
			}else 
				System.out.println("firstName is not displayed");
	}
	
	//lastName
	public void lastNameFiled(String lastName){
		System.out.println("in - lastNameFiled - method");
			if(userLastName.isDisplayed()){
					userLastName.sendKeys(lastName);
					System.out.println("lastName entered successfully");
		
			}else 
				System.out.println("lastName is not displayed");
	}
	
	//userJobTitle
	public void userJobTitle(String jobTitle){
			System.out.println("in - userJobTitle - method");
			if(userJobTitleField.isDisplayed()){
			userJobTitleField.click();
			System.out.println(" clicked job title successfully");}
			else
				System.out.println(" job title filed not displayed");
		if(userJobTitle.isDisplayed()){
			userJobTitle.click();
		System.out.println(" clicked Personal Interest job title successfully");}
		else
			System.out.println("Personal Interest job title not displayed");
		
		// Select selectjobTitle=new Select(userJobTitleField);
		// if(userJobTitleField.isDisplayed()){
		 //userJobTitleField.click();}
		// else
		//	 System.out.println("element not displayed");
		// System.out.println("before selecting job title");
		//selectjobTitle.selectByVisibleText(jobTitle);
		//System.out.println(jobTitle+ " selected successfully");
		}
	
	//email
	public void userEmail(String email){
		System.out.println("in - userEmail - method");
			if(userEmail.isDisplayed()){
				userEmail.sendKeys(email);
					System.out.println("Email entered successfully");
		
			}else 
				System.out.println("Email is not displayed");
	}
	
	//phone
	public void userPhone(String phone){
		System.out.println("in - userPhone - method");
			if(userPhone.isDisplayed()){
				userPhone.sendKeys(phone);
					System.out.println("Phone entered successfully");
		
			}else 
				System.out.println("Phone is not displayed");
	}
	
	 //companyName
	public void companyName(String company){
		System.out.println("in - companyName - method");
			if(companyName.isDisplayed()){
				companyName.sendKeys(company);
					System.out.println("companyName entered successfully");
		
			}else 
				System.out.println("Phone is not displayed");
	}
	
	//companyEmployeesCountField
     public void companyEmployeesCountField(String employeesCount){
	       System.out.println("in - companyEmployeesCountField - method");
	       if(companyEmployeesCountField.isDisplayed()){
			companyEmployeesCountField.click();
			System.out.println(" clicked companyEmployeesCountField successfully");}
			else 
				System.out.println("companyEmployeesCountField not displayed");
			companyEmployeesCount.click();
			System.out.println("employeesCount selected successfully");
     }	
			
	//companyCountryFiled
	public void companyCountryFiled(String country){
		System.out.println("in - companyCountryFiled - method");
		companyCountryFiled.click();
		System.out.println(" clicked companyCountryFiled successfully");
		companyCountry.click();
		System.out.println(country+ " selected successfully");
	}
		
	//companyLanguageField
	public void companyLanguageField(String language){
		System.out.println("in - companyLanguageField - method");
		companyLanguageField.click();
		System.out.println(" clicked companyLanguageField successfully");
	
		companyLanguage.click();
		System.out.println(language+ " selected successfully");
	}
	
	//acceptTermsCheckBox
		public void acceptTermsCheckBox(){
			System.out.println("in - acceptTermsCheckBox - method");
			if(acceptTermsCheckBox.isSelected()){
			System.out.println(" clicked acceptTermsCheckBox successfully");
			}else 
				acceptTermsCheckBox.click();
			System.out.println("Terms accepted.By Checking box successfully");
		}
		
	//freeTrailSignUP
		public void freeTrailSignUP(){
			System.out.println("in - freeTrailSignUP - method");
			if(freeTrailSignUP.isDisplayed()){
			freeTrailSignUP.click();
			System.out.println(" clicked freeTrailSignUP successfully");
			}else 
						
			System.out.println("freeTrailSignUP button not displayed");
				}	
	*/	
}

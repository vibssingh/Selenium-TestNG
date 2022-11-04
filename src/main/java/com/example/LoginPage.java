package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	
	 public LoginPage(WebDriver driver) {
		 super(driver);
		
    }
	
	@FindBy(name = "username")
    public WebElement userName;
 
    @FindBy(name = "password")
    public WebElement password;
 
    @FindBy(id = "logInPanelHeading")
    public WebElement titleText;
    
    @FindBy(xpath = "//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/span")
    public WebElement missingUsernameErrorMessage;
    
    @FindBy(xpath = "//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/span")
    public WebElement missingPasswordErrorMessage;
 
    @FindBy(xpath = "//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
    public WebElement login;
 
    @FindBy(xpath = "//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")
    public  WebElement errorMessage;
    
    @FindBy(xpath = "//*[@href='https://www.linkedin.com/company/orangehrm/mycompany/']")
    public  WebElement linkedInIcon;
    
    @FindBy(xpath = "//*[@href='https://www.facebook.com/OrangeHRM/mycompany']") //Invalid Xpath
    public  WebElement faceBookIcon;
    
    @FindBy(xpath = "//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[4]/p")
    public  WebElement ForgotYourPasswordLink;
    
    public void login(String strUserName, String strPassword) {
    	 
    	userName.sendKeys(strUserName);
    	password.sendKeys(strPassword);
    	login.click();
 
    }
  
    public String getMissingUsernameText() {
        return missingUsernameErrorMessage.getText();
    }
    
   
    public String getMissingPasswordText() {
        return missingPasswordErrorMessage.getText();
    }
    
    
   
    public String getErrorMessage() {
        return errorMessage.getText();
    }
    
     
   
    public void clickOnForgetYourPasswordLink() {
    	
    	ForgotYourPasswordLink.click();
    }
 
}

package com.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTests extends BaseTests{
	 

    @Test
    public void invalidCredentials() {
   
	    LoginPage objLoginPage = new LoginPage(driver);
    	objLoginPage.login("admin$$", "admin123");
    	 
    	// Verify Error Message
    	 Assert.assertEquals("Invalid credentials",objLoginPage.getErrorMessage());
    
    }
    

    @Test
    public void validLogin() {
   
	    LoginPage objLoginPage = new LoginPage(driver);
    	objLoginPage.login("Admin", "admin123");
    	 
    	HomePage objHomePage = new HomePage(driver);
    	
    	// Verify Home Page
    	Assert.assertEquals("Employee Information",objHomePage.getHomePageText());
    
    }
    

/*	
    @Ignore
    @Test 
    public void missingPassword() {
    	
   
	    LoginPage objLoginPage = new LoginPage(driver);
    	objLoginPage.login("admin", "");
    	    	
    	// Verify Error Message
    	Assert.assertEquals("Invalid credentials",objLoginPage.getMissingPasswordText());
    throw new SkipException("Skipping this exception");
    
    }  */  
   
}



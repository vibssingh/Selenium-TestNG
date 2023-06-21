package com.example;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTests {
	
	public static WebDriver driver;
	public final static int TIMEOUT = 10;    
 
    @BeforeMethod
    public void setup() {
    	    WebDriverManager.chromedriver().setup();
	    ChromeOptions options = new ChromeOptions();
	    options.addArguments("--remote-allow-origins=*");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("--headless");
	    driver = new ChromeDriver(options);
	    driver.manage().window().maximize();
	    driver.get("https://opensource-demo.orangehrmlive.com/");	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));

    }
   
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
    
}

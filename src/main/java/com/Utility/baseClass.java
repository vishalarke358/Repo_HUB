//baseClass:-
//          - It is basically used to Open and close the browser. 
//           -This class is overloaded by test class.

package com.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

        public class baseClass {

	         public static  WebDriver driver;	//The initialized variable (driver) will be used,
                                                // across the project in various re-usable functions and @test methods.
                @BeforeMethod
             public void setUp() throws InterruptedException {
             WebDriverManager.chromedriver().setup();
             driver=new ChromeDriver();
             driver.get("https://www.facebook.com/login/");
             driver.manage().window().maximize();
             Thread.sleep(3000);



        }

             @AfterMethod
            public void teadDown() {
             driver.quit();
    }

	
	
	
}

//loginPom:-
//   -here WebElement identify this element of login page.


package com.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginPom {

	 @FindBy(how=How.XPATH,using="//input[@id='email']")	
    	private WebElement txt_email;                      //private- for encapsulation 
	
	
     @FindBy(how=How.XPATH,using="//input[@id='pass']")	
	    private WebElement txt_pass;


	
     //encapsulation---> use getter method to modify the data
	
     public WebElement getTxt_email() {            //get method used to got webelement
    	 return txt_email;
     }
     
     public WebElement getText_pass() {
    	 return txt_pass;
     }
     
}

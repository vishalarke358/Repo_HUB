//POM =Page OBject Model
//      -It is basically used in Framework.

package com.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.Utility.baseClass;
import com.pageObject.loginPom;



    public class Test_01 extends baseClass{
	
	
	@Test
	public void Test_001() {
		loginPom login=PageFactory.initElements(driver,loginPom.class);
		login.getTxt_email().sendKeys("TestEmail_1");
		login.getText_pass().sendKeys("Pass@123");
	}
	
	
	@Test
	public void Test_002 (){
	loginPom login=PageFactory.initElements(driver,loginPom.class);
		login.getTxt_email().sendKeys("TestEmail_2");
		login.getText_pass().sendKeys("Pass@789");
	}
	
	
	@Test
	public void Test_003() {
	loginPom login=PageFactory.initElements(driver,loginPom.class);
	login.getTxt_email().sendKeys("TestEmail_3");
	login.getText_pass().sendKeys("Pass@456");
	}
	
	
	@Test
	public void Test_004() {
		loginPom login=PageFactory.initElements(driver, loginPom.class);
		login.getTxt_email().sendKeys("TestEmail_4");
		login.getText_pass().sendKeys("Pass@176");
	}
	
	
	@Test
	public void Test_005() {
	loginPom login=PageFactory.initElements(driver,loginPom.class);
		login.getTxt_email().sendKeys("TestEmail_5");
		login.getText_pass().sendKeys("Pass@621");
	}
	
	
	
	
	
	
	
	
	
}

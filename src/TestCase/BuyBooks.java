package TestCase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import CommonFunctions.CommonFunctions;
import pageObjects.Login_page_object;

public class BuyBooks extends CommonFunctions{
	
	@Test
	public void Order_Book_TC() {
		
		PageFactory.initElements(driver, Login_page_object.class);
		Login_page_object.navigateToLogin.click();
		Login_page_object.userName.sendKeys(prop.getProperty("username"));
		Login_page_object.PassWord.sendKeys(prop.getProperty("password"));
		Login_page_object.LoginButton.click();
		
	}
	
}

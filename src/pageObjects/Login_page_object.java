package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_page_object {
	
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
	public	static WebElement navigateToLogin;
	
	
	@FindBy(xpath = "//*[@id=\"Email\"]")
	public	static WebElement userName;
	
	@FindBy(xpath = "//*[@id=\"Password\"]")
	public	static WebElement PassWord;
	
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")
	public	static WebElement LoginButton;
}

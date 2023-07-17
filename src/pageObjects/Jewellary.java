package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Jewellary {
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[2]/ul[1]/li[6]/a")
	public static WebElement BuyJewelary;
}

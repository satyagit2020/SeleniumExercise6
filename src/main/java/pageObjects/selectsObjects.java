package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class selectsObjects {
	
	WebDriver driver;
	//created a constructor 
	public selectsObjects (WebDriver driver) 
	{
		this.driver=driver;
		//Initializing FindBy annotations
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//div[@class='tab-controller-m__tabButtons__3LfvE']/div[4]")
	WebElement selecttablink;
	
	@FindBy(xpath="//h2[contains(text(),'Select Widgets')]")
	WebElement pageheader;
	
	@FindBy(css="div.select-m__root__26Kq_:nth-child(1) > div:nth-child(2) > button:nth-child(1)")
	WebElement simplestringarray;
	
	
	@FindBy(css="div.select-m__root__26Kq_:nth-child(1) > div:nth-child(2) > div:nth-child(3) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1)")
	WebElement bazoption ;
	
	public WebElement selecttabLink()
	{
		return selecttablink;
	}
	public WebElement pageHeader()
	{
		return pageheader;
	}
	public WebElement arrayTextbox()
	{
		return simplestringarray;
	}
	
	public WebElement bazOption()
	{
		return bazoption;
	}
}

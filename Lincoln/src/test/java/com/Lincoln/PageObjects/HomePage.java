package com.Lincoln.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		driver=this.driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//button[normalize-space()='Get An Internet Price']") WebElement lnk_BNP;

	public void Click_BNP_Footer()
	{
		lnk_BNP.click();
		
	}
	

}

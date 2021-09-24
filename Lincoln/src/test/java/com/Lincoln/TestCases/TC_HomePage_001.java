package com.Lincoln.TestCases;

import org.testng.annotations.Test;
import com.Lincoln.PageObjects.HomePage;

public class TC_HomePage_001 extends BaseClass {
	
    @Test
	public void HomePage() throws InterruptedException
	{
		driver.get(BaseUrl);
		HomePage hp=new com.Lincoln.PageObjects.HomePage(driver);
		driver.manage().window().maximize();
        Thread.sleep(5000);
		hp.Click_BNP_Footer();
		System.out.println("footer");
	}
}

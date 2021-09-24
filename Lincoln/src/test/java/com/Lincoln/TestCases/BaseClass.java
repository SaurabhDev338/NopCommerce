package com.Lincoln.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public String BaseUrl="https://shop.lincoln.com/inventory/nautilus/details/2LMPJ8J95MBL00550?fromPopularBuild=false&zipcode=12345&year=2021&ownerPACode=10142&intcmp=show-s";
	public static WebDriver driver;
	
	@BeforeClass
	public void Setup()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	@AfterClass
	public void TearDown()
	{
		driver.quit();
	}

}

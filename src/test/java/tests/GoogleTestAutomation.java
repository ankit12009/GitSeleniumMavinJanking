package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.GoogleSearch;

public class GoogleTestAutomation {

	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		 driver=new ChromeDriver();
		 driver.get("https://www.google.com");
	}
	@Test
	public void testCase1() {
		Assert.assertEquals(driver.getTitle(), "Google");
		System.out.println(driver);
		 GoogleSearch enterkey=new GoogleSearch(driver);
		 enterkey.setSearchBox("Ankit");
	}
	
	@AfterMethod
	public void close() {
		driver.quit();
	}
	
}

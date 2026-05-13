package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import Pages.GoogleSearch;
import browserSetup.BrowserSetup;
import utils.ReadPropertiesfileExample;


public class GoogleTestAutomation {

	WebDriver driver;
	ReadPropertiesfileExample prop=new ReadPropertiesfileExample();
	
	@Parameters({ "Browser" })
	@BeforeMethod
	public void setUp(@Optional("Edge") String browser) throws IOException {
		
//		prop=new ReadPropertiesfileExample();
//		driver=new BrowserSetup() .setupBrowser(prop.Read(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties","Browser"));
		driver=new BrowserSetup().setupBrowser(browser);
		driver.get(prop.Read(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties","URL"));
	}
	@Test
	public void testCase1() {
		Assert.assertEquals(driver.getTitle(), "Google");
		 GoogleSearch enterkey=new GoogleSearch(driver);
		 enterkey.setSearchBox("Ankit");
	}
	
	@AfterMethod
	public void close() {
		driver.quit();
	}
	
}

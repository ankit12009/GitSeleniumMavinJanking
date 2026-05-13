package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import Pages.GoogleSearch;
import browserSetup.BrowserSetup;
import utils.ReadExcel;
import utils.ReadPropertiesfileExample;


public class GoogleTestAutomation {

	WebDriver driver;
	ReadPropertiesfileExample prop=new ReadPropertiesfileExample();
	
	@DataProvider(name="test1")
	public Object[][] createDate1() throws IOException{
		 ReadExcel read=new ReadExcel();
		 return read.readExcelData(System.getProperty("user.dir")+"\\src\\test\\resources\\TestData.xlsx", "Sheet1");
	}
	
	@Parameters({ "Browser" })
	@BeforeMethod
	public void setUp(@Optional("Edge") String browser) throws IOException {
		
//		prop=new ReadPropertiesfileExample();
//		driver=new BrowserSetup() .setupBrowser(prop.Read(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties","Browser"));
		driver=new BrowserSetup().setupBrowser(browser);
		driver.get(prop.Read(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties","URL"));
	}
	@Test(dataProvider = "test1")
	public void testCase1(String keyword) {
		Assert.assertEquals(driver.getTitle(), "Google");
		 GoogleSearch enterkey=new GoogleSearch(driver);
		
		 enterkey.setSearchBox(keyword);
	}
	
	@AfterMethod
	public void close() {
		driver.quit();
	}
	
}

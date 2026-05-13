package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleSearch {
//  
//	static {
//		this(dirver);
//	}
//   
	
	private By searxhBox=By.name("q");
	
	private static WebDriver driver;
//	@FindBy(name="q")
//	private WebElement searxhBox2;
	public GoogleSearch(WebDriver driver) {
		this.driver=driver;
	   }
	
	public void setSearchBox(String search) {
		
//		System.out.println(searxhBox2);
//		System.out.println(driver);
//		searxhBox2.sendKeys(search);
//		searxhBox2.sendKeys(Keys.ENTER);
		
		driver.findElement(searxhBox).sendKeys(search);
		driver.findElement(searxhBox).sendKeys(Keys.ENTER);
		
	}
	
}

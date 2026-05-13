package automation;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchAutomation {

	
	 public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.google.com");
		 driver.findElement(By.name("q")).sendKeys("testing");
		 driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		 
	}
}

package Test;

	import Pages.GoogleHomePage;
	import java.util.List;
	import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class Test_GoogleHomePage {
		
		private static WebDriver driver = null;
		
		public static void main(String args[]){
			
			String projectpath = System.getProperty("user.dir");
				
			System.setProperty("webdriver.chrome.driver", projectpath+"//Drivers/Chrome_Driver/chromedriver.exe");
			
			//Verifying in Chrome Browser
			driver = new ChromeDriver();
					
			driver.get("http://google.com/");
			
			GoogleHomePage.textbox_search(driver).sendKeys("Automation");
			
			GoogleHomePage.freespace(driver).click();
			
			//GoogleHomePage.button_search(driver).click();
			GoogleHomePage.button_search(driver).sendKeys(Keys.RETURN);
			
			
			List<WebElement> listoflinks = driver.findElements(By.tagName("a"));
			
			int numberoflinks = listoflinks.size();
			
			System.out.println(numberoflinks);
			driver.close();
			

		}

	}


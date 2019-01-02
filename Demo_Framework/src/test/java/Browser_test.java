

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser_test {
	
	public static void main(String args[]){
		
		String projectpath = System.getProperty("user.dir");
		
		System.out.println(projectpath);
		
		System.setProperty("webdriver.gecko.driver", projectpath+"//Drivers/Gecko_Driver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", projectpath+"//Drivers/Chrome_Driver/chromedriver.exe");
		
		//Verifying in Chrome Browser
		WebDriver driver = new ChromeDriver();
				
		driver.get("http://seleniumhq.org/");
		
		WebElement searchbox = driver.findElement(By.xpath("//*[@id=\"q\"]"));
		WebElement searchbutton = driver.findElement(By.id("submit"));
		
		searchbox.sendKeys("Chrome");
		searchbutton.click();
		
		List<WebElement> listoflinks = driver.findElements(By.tagName("a"));
		
		int numberoflinks = listoflinks.size();
		
		System.out.println(numberoflinks);
		//driver.close();
		
		

	}

}

package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleHomePage {
	
	private static WebElement searchbox = null;
	private static WebElement searchbutton = null;
	private static WebElement freespace = null;
	
	
	public static WebElement textbox_search(WebDriver driver) {
		
		searchbox = driver.findElement(By.name("q"));
		return searchbox;
		
	}
	
	public static WebElement button_search(WebDriver driver) {
		
		searchbutton = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]"));
		return searchbutton;
	}
	
	public static WebElement freespace(WebDriver driver) {
				
		freespace = driver.findElement(By.xpath("//*[@id=\"lga\"]"));
		return freespace;
		
	}

}

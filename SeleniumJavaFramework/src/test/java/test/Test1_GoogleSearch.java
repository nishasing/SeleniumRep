package test;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test1_GoogleSearch {
	public static void main(String[] args) {
		//public static void googleSearch() {
			
			//set the browser
			String projectpath= System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", projectpath+"/drivers/chromedriver/chromedriver.exe" );
			WebDriver driver= new ChromeDriver();
			
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("excludeSwitches",
			    Arrays.asList("disable-popup-blocking"));
			
			
			
			//go to google.com
			driver.get("http://www.google.com/");
			
			
			
			//enter text in search box
			driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
			
			//click on search button
			driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
			
			//close browser
			driver.close();
			
			System.out.println("Test completed successfully");
		}
//	}

}

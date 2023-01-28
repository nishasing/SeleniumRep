package demo;

import static org.junit.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com/ncr");
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				  .withTimeout(Duration.ofSeconds(30))
				  .pollingEvery(Duration.ofSeconds(5))
				  .ignoring(NoSuchElementException.class);

				WebElement foo = wait.until(driver -> {
				  return driver.findElement(By.id("foo"));
				});
		//driver.get("https://google.com/ncr");
		
		/*driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://makemytrip.com");
		WebElement myDynamicElement = driver.findElement(By.id("myDynamicElement"));*/
		  
		/*WebElement foo = new WebDriverWait(driver, Duration.ofSeconds(3))
		          .until(driver -> driver.findElement(By.name("q")));
		assertEquals(foo.getText(), "Hello from JavaScript!");*/
		  
		//driver.findElement(By.name("q")).sendKeys("cheese" + Keys.ENTER);
		// Initialize and wait till element(link) became clickable - timeout in 10 seconds
		//WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
		  //      .until(ExpectedConditions.elementToBeClickable(By.xpath("//a/h3")));
		// Print the first result
		//System.out.println(firstResult.getText());
	}
}

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Browsertest {
	public static void main(String[] args) {
		String projectpath= System.getProperty("user.dir");
		System.out.println(projectpath);
		System.setProperty("webdriver.chrome.driver", projectpath+"/drivers/chromedriver/chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.seleniumhq.org/");
		//Thread.sleep(3000);
		//driver.close();
		//driver.window.maximize();
	}

}

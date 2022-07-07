package StepDefLoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestChrome {
	@Test
	public void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\OperativeAutomation\\CucumberAutomation\\MobileAutomation\\lib\\chromedriver.exe");
		// Instantiate a ChromeDriver class.
		WebDriver driver = new ChromeDriver();
		// Launch Website
		driver.navigate().to("http://www.javatpoint.com/");
		// Maximize the browser
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
	}
}

package StepDefLoginPage;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class AndroidTest_1 {
	AndroidDriver<AndroidElement> driver;

	@Given("^lunch emulator and install apk file$")
	public void lunch_emulator_and_install_apk_file() throws Throwable {
		File file = new File(System.getProperty("user.dir") + "/lib", "ApiDemos-debug.apk");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.APP, file.getAbsolutePath());
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		cap.setCapability(MobileCapabilityType.NO_RESET, false);
		cap.setCapability(MobileCapabilityType.NO_RESET, false);
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@When("^we selected selected preferences tab Set wifi Password$")
	public void we_selected_selected_preferences_tab() throws InterruptedException {
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();		
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();	
		driver.findElementById("android:id/checkbox").click();
		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		driver.findElementByClassName("android.widget.EditText").sendKeys("Pavan@1226");
		driver.findElementsByClassName("android.widget.Button").get(1).click();
	}
	
	@Then("^close the driver$")
	public void close_the_driver(){
		driver.quit();
	}
}

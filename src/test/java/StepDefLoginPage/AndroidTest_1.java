package StepDefLoginPage;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;
import static java.time.Duration.ofSeconds;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class AndroidTest_1 {
	AndroidDriver<AndroidElement> driver;

	@Given("^lunch emulator and install apk file$")
	public void lunch_emulator_and_install_apk_file() throws Throwable {
		File file = new File(System.getProperty("user.dir") + "/lib", "ApiDemos-debug.apk");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.APP, file.getAbsolutePath());
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
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

	@SuppressWarnings("rawtypes")
	@When("^work with Mobile Gestures$")
	public void work_with_Mobile_Gestures() throws InterruptedException {
		WebElement views = driver.findElementByXPath("//android.widget.TextView[@text='Views']");
		views.click();
		WebElement expandList = driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
		tapByElement(expandList);
		WebElement customAdapter = driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']");
		tapByElement(customAdapter);
		new TouchAction(driver)
				.longPress(longPressOptions().withElement(
						element(driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']")))))
				.release().perform();
	}

	@SuppressWarnings("rawtypes")
	@When("^work with Mobile Swipping$")
	public void work_with_Mobile_Swipping() {
		WebElement views = driver.findElementByXPath("//android.widget.TextView[@text='Views']");
		views.click();
		tapByElement(driver.findElementByAndroidUIAutomator("text(\"Date Widgets\")"));
		tapByElement(driver.findElementByAndroidUIAutomator("text(\"1. Dialog\")"));
		tapByElement(driver.findElementByAndroidUIAutomator("text(\"CHANGE THE TIME\")"));
		tapByElement(driver.findElementByXPath("//*[@content-desc='9']"));
		tapByElement(driver.findElementByXPath("//*[@content-desc='20']"));
		WebElement first = driver.findElementByXPath("//*[@content-desc='15']");
		WebElement second = driver.findElementByXPath("//*[@content-desc='45']");
		new TouchAction(driver).longPress(longPressOptions().withElement(element(first)).withDuration(ofSeconds(10)))
				.moveTo(element(second)).release().perform();
	}

	@SuppressWarnings("rawtypes")
	@When("^work with Mobile DragAndDrop$")
	public void work_with_Mobile_DragAndDrop() {
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']").click();
		WebElement from = driver.findElementsByClassName("android.view.View").get(0);
		WebElement to = driver.findElementsByClassName("android.view.View").get(2);
		new TouchAction(driver).longPress(longPressOptions().withElement(element(from)).withDuration(ofSeconds(10)))
				.moveTo(element(to)).release().perform();
	}

	@When("^work with Mobile ScrollDown$")
	public void work_with_Mobile_ScrollDown() {
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));");
	}

	@Then("^close the driver$")
	public void close_the_driver() {
		driver.quit();
	}

	@Then("^Print the message as browser closed$")
	public void print_the_message_as_browser_closed() {
		System.out.println("Print the message as browser closed");
	}

	@SuppressWarnings("rawtypes")
	public void tapByElement(WebElement androidElement) {
		new TouchAction(driver).tap(tapOptions().withElement(element(androidElement)))
				.waitAction(waitOptions(ofMillis(250))).perform();
	}

}

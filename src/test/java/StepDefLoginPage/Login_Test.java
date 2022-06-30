package StepDefLoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_Test {

	@Given("^when we open the application through url$")
	public void when_we_open_the_application_through_url() throws Throwable {
		System.out.println("when we open the application through url");
	}

	@Then("^application should through chrome browser$")
	public void application_should_through_chrome_browser() throws Throwable {
		System.out.println("application should through chrome browser");
	}

	@Given("^User is on homePage$")
	public void user_is_on_homePage() throws Throwable {
		System.out.println("User is on homePage");
	}

	@When("^User navigate to login page$")
	public void user_navigate_to_login_page() throws Throwable {
		System.out.println("User navigate to login page");
	}

	@When("^User entered UserName and Password$")
	public void user_entered_UserName_and_Password() throws Throwable {
		System.out.println("User entered UserName and Password");
	}

	@Then("^User should login to the Application$")
	public void user_should_login_to_the_Application() throws Throwable {
		System.out.println("User should login to the Application");
	}

	@Then("^User should very Page title$")
	public void user_should_very_Page_title() throws Throwable {
		System.out.println("User should very Page title");
	}

	@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() throws Throwable {
		System.out.println("User LogOut from the Application");
	}

	@Then("^Message displayed LogOut Successfully$")
	public void message_displayed_LogOut_Successfully() throws Throwable {
		System.out.println("Message displayed LogOut Successfully");
	}

	@When("^User not able to login to apllication due to invalid credentials$")
	public void user_not_able_to_login_to_apllication_due_to_invalid_credentials() throws Throwable {
		System.out.println("User not able to login to apllication due to invalid credentials");
	}

	@Then("^Invalid credentials should show$")
	public void invalid_credentials_should_show() throws Throwable {
		System.out.println("Invalid credentials should show");
	}

}

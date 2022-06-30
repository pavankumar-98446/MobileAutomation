package StepDefLoginPage;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.When;

public class LoginFileWithExampleas {

	@When("^User entered \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_entered_and(String arg1, String arg2) {
		System.out.println("User entered" + arg1 + " and " + arg2);
	}

	@When("^User entered UserName and Password using Tables$")
	public void user_entered_UserName_and_Password_using_Tables(DataTable table) {
		List<List<String>> data = table.raw();
		System.out.println("User entered" + data.get(0).get(0) + " and " + data.get(0).get(1));
		System.out.println("User entered" + data.get(1).get(0) + " and " + data.get(1).get(1));

	}

	@When("^User entered UserName and Password using Maps$")
	public void user_entered_UserName_and_Password_using_Maps(DataTable table) {
		for (Map<String, String> data : table.asMaps(String.class, String.class)) {
			System.out.println("User entered" + data.get("UserName") + " and " + data.get("Password"));
		}
	}

}

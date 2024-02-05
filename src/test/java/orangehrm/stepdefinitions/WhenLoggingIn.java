package orangehrm.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import orangehrm.navigation.Navigations;
import orangehrm.pages.LoginPage;

public class WhenLoggingIn {
	
	@Steps
	Navigations navigate;
	
	@Steps
	LoginPage loginpage;
	
	@Given("landed at orangehrm login page")
	public void landed_at_orangehrm_login_page() {
	    // 
		System.out.println("loginpage");
		navigate.openLoginPage();
	}

	@When("passing valid credentials {string} and {string}")
	public void passing_valid_credentials_and(String username, String password) {
	    // 
		System.out.println("credentials"+username+password);
		loginpage.USERNAME_FIELD
	}

	@Then("verify dashboard is displayed")
	public void verify_dashboard_is_displayed() {
	    // 
		System.out.println("dashboard");
	}

	@When("passing bad credentials {string} and {string}")
	public void passing_bad_credentials(String username, String password) {
	    // 
		System.out.println("invalid creds"+ username + password);
	}

	@Then("verify proper error status {string}")
	public void verify_proper_error_status(String errormessage) {
	    // 
		System.out.println(errormessage);
	}

}

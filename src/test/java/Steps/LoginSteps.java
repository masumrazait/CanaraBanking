package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("user navigates to the facebook website")
	public void user_navigates_to_the_facebook_website() {
		System.out.println("@Given---user navigates to the facebook website");
	}

	@When("user validate the homepage title")
	public void user_validate_the_homepage_title() {
		System.out.println("@When---user navigates to the facebook website");
	}

	@Then("user enter the {string} userid")
	public void user_enter_the_userid(String userid) {
		System.out.println("@Then---user enter the" + userid + " userid");
	}

	@And("user enter the {string} password")
	public void user_enter_the_password(String password) {
		System.out.println("@And---user enter the " + password + " password");
	}

	@And("user click on login button")
	public void user_click_on_login_button() {
		System.out.println("@And---user click on login button");

	}

}

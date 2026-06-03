package stepdefinitionss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	WebDriver driver;

	@Given("user launches browser")
	public void user_launches_browser() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@Given("user opens login page")
	public void user_opens_login_page() {

		driver.get("https://en.wikipedia.org/wiki/Mariana_Trench");
		System.out.println("Login page displayed ");

	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String username, String password) {

		System.out.println("username" + username);
		System.out.println("password" + password);
	}

	@When("clicks login button")
	public void clicks_login_button() {

		System.out.println("Click login ");

	}

	@Then("user should see dashboard {string}")
	public void user_should_see_dashboard(String result) {

		System.out.println("Dashboard is showing with results " + result);

		driver.quit();

	}

}

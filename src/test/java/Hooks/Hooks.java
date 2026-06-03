package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;

public class Hooks {

	@Before
	public void setup() {

		System.out.println("Before Test");

	}

	@After
	public void teardown() {

		System.out.println("After Test");

	}

//	@BeforeStep
	public void openapplication() {

		System.out.println("Before Step");

	}

//	@AfterStep
	public void logoutapplication() {

		System.out.println("After Step");
	}

	@BeforeAll
	public static void startserver() {

		System.out.println("Before All");
	}

	@AfterAll
	public static void closeserver() {

		System.out.println("After All");

	}

}

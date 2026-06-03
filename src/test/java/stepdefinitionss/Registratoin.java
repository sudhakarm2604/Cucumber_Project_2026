package stepdefinitionss;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;

public class Registratoin {

	@When("user enters following details")
	public void user_enters_following_details(DataTable table) {

		List<List<String>> data = table.asLists();

		System.out.println(data.get(0).get(0)); // John
		System.out.println(data.get(0).get(1)); // Doe
		System.out.println(data.get(0).get(2)); // 9999999999
	}
}

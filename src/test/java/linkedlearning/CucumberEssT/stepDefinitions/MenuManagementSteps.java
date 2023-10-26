package linkedlearning.CucumberEssT.stepDefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import linkedlearning.CucumberEssT.Menu;
import linkedlearning.CucumberEssT.MenuItem;

public class MenuManagementSteps {
	MenuItem item;
	Menu menu = new Menu();
	String errorMsg;
	
	
	public MenuManagementSteps() {
		System.out.println("Step definition is instantiated.");
	}

	@Given("^I have a menu item with name \"([^\"]+)\" and price ([$]*)(\\d+)")
	public void i_have_a_menu_item_with_name_and_price(String itemName, String currency, Integer price) {
	    item = new MenuItem(itemName, price);
	    System.out.println("Step 1");
	}

	@When("I add the item into the menu")
	public void i_add_the_item_into_the_menu() {
		try {			
			menu.addItem(item);	    
		} catch (IllegalArgumentException e) {
			errorMsg = e.getMessage();
			System.err.println(errorMsg);
		}
		System.out.println("Step 2");
	}

	@Then("The menu should include the item {string}")
	public void the_menu_should_include_the_item(String itemName) {
		assertTrue(menu.doesItemExist(itemName));	    
		System.out.println("Step 3");
	}
	
	@Then("I should see an error message with value {string}")
	public void i_should_see_an_error_message_with_value(String expectedMsg) {
    assertEquals(expectedMsg, errorMsg);
	}
	
}

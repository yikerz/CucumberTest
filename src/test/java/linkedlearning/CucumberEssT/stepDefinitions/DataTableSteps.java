package linkedlearning.CucumberEssT.stepDefinitions;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTableSteps {
	
	
	@Given("I placed an order for the following items as list")
	public void i_placed_an_order_for_the_following_items_as_list(io.cucumber.datatable.DataTable dataTable) {
	    List<List<String>> items = dataTable.asLists(String.class);
	    
	    for (List<String> item : items) {
				for (String attr : item) {
					System.out.println(attr);
				}
			}
	}

	@Given("I placed an order for the following items as map")
	public void i_placed_an_order_for_the_following_items_as_map(io.cucumber.datatable.DataTable dataTable) {
	    List<Map<String, String>> dataMap = dataTable.asMaps(String.class, String.class);
	    
	    for (Map<String, String> mapItem : dataMap) {
				for (Entry<String, String> entryCell : mapItem.entrySet()) {
					System.out.println("Key: " + entryCell.getKey());	
					System.out.println("Value: " + entryCell.getValue());	
				}
			}
	}


	@When("I generate the bill")
	public void i_generate_the_bill() {

	}

	@Then("A bill for ${int} should be generated")
	public void a_bill_for_$_should_be_generated(Integer int1) {
	
	}
}

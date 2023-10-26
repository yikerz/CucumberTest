package linkedlearning.CucumberEssT.stepDefinitions;


import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import linkedlearning.CucumberEssT.TaxCalculator;

public class ScenarioOutlineSteps {
	private double initialBillAmount;
	private double taxRate;
	
	@Given("I have a Customer")
	public void i_have_a_customer() {
	
	}

	@Given("User enters initial bill amount as {int}")
	public void user_enters_initial_bill_amount_as(Integer initialBillAmount) {
	    this.initialBillAmount = initialBillAmount;
	}

	@Given("Sales Tax Rate is {double} Percent")
	public void sales_tax_rate_is_percent(double taxRate) {
	    this.taxRate = taxRate;
	}

	@Then("Final bill amount calculated is {double}")
	public void final_bill_amount_calculated_is(double expectedTotal) {
		double actualTotal = TaxCalculator.calculateTotalBill(initialBillAmount, taxRate);
		assertEquals(expectedTotal, actualTotal, 0.0001);
	}
}

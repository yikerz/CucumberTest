package linkedlearning.CucumberEssT;

public class TaxCalculator {

	public static double calculateTotalBill(double initialBillAmount, double taxRate) {
		return initialBillAmount + (initialBillAmount * taxRate / 100);
	}

}

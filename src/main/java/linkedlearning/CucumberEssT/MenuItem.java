package linkedlearning.CucumberEssT;

public class MenuItem {
	private String itemName;
	private int price;
	
	public MenuItem(String itemName, int price) {
		super();
		this.itemName = itemName;
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getItemName() {
		return itemName;
	}

	@Override
	public String toString() {
		return "MenuItem [itemName=" + itemName + ", price=" + price + "]";
	}
		
}

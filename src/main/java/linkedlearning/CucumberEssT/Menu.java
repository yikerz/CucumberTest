package linkedlearning.CucumberEssT;

import java.util.ArrayList;
import java.util.List;

public class Menu {
	List<MenuItem> itemList = new ArrayList<>();

	public Menu() {
		super();
	}
	
	public List<MenuItem> getItemList() {
		return itemList;
	}


	public void addItem(MenuItem item) {
		if (doesItemExist(item.getItemName())) {
			throw new IllegalArgumentException("Duplicate Item");
		}
		itemList.add(item);
	}

	public Boolean doesItemExist(String itemName) {
		
		for (MenuItem item : itemList) {
			if (item.getItemName().equals(itemName)) {
				return true;
			}
		}
		return false;
	}

}

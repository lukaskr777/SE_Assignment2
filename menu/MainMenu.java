
package menu;
import java.util.ArrayList;


import java.util.ArrayList;


public class MainMenu {


	private ArrayList<String> categoryList;
	private ArrayList<Item> itemList;
	private ArrayList<String> discounts;
	
	public MainMenu(PriceStrategy price_strategy) {
		categoryList = new ArrayList<>();
		itemList = new ArrayList<>();
		discounts = new ArrayList<>();

	}
	
	
	public ArrayList<String> getCategories(){
		return categoryList;
	}
	
	public void addCategory(String newCategory) {
		categoryList.add(newCategory);
	}

	public void addDiscount(String discount){
		discounts.add(discount);
	}

	public void removeDiscount(String discount){
		discounts.remove(discount);
	}
	
	public ArrayList<Item> getItems(){
		return itemList;
	}
	
	public void addItem(Item newItem) {
		itemList.add(newItem);
	}
	
	public String display() {
		String result = "------------ Menu ------------\n\n";
		for(String category: categoryList) {
			result += "----- Category: " + category + " -----\n\n";
			for(Item item : itemList) {
				if(item.getCategory().equals(category)) {
					result += item.toString() + "\n" + item.getPrice() + "\n";
				}
			}
		}
		result += "DISCOUNTS\n";
		for(String discount){
			result += discount + ", \n";
		}
		return result;
	}
}

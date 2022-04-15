
package menu;
import java.util.ArrayList;

import pricing.PriceStrategy;

import java.util.ArrayList;

// Main Menu of Restaurant
public class MainMenu {

	private ArrayList<String> categoryList;
	private ArrayList<Item> itemList;
	private ArrayList<String> discounts;
	
	// constructor for a new restaurant menu
	public MainMenu(PriceStrategy price_strategy) {
		categoryList = new ArrayList<>();
		itemList = new ArrayList<>();
		discounts = new ArrayList<>();

	}
	
	// get categories from the menu
	public ArrayList<String> getCategories(){
		return categoryList;
	}
	
	// add a new category to the menu
	public void addCategory(String newCategory) {
		categoryList.add(newCategory);
	}
	
	// add discount to menu
	public void addDiscount(String discount){
		discounts.add(discount);
	}
	
	// remove discount from a menu
	public void removeDiscount(String discount){
		discounts.remove(discount);
	}
	
	// get all the items from the menu
	public ArrayList<Item> getItems(){
		return itemList;
	}
	
	// add a new item to the menu
	public void addItem(Item newItem) {
		itemList.add(newItem);
	}
	
	// displays the menu
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

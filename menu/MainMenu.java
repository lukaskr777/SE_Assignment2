
package menu;
import java.util.ArrayList;


import java.util.ArrayList;


public class MainMenu {
	
		
	private ArrayList<String> categoryList;
	private ArrayList<Item> itemList;
	
	public MainMenu() {
		categoryList = new ArrayList<>();
		itemList = new ArrayList<>();
	}
	
	public ArrayList<String> getCategories(){
		return categoryList;
	}
	
	public void addCategory(String newCategory) {
		categoryList.add(newCategory);
	}
	
	public ArrayList<Item> getItems(){
		return itemList;
	}
	
	public void addItem(Item newItem) {
		itemList.add(newItem);
	}
	
	public String toString() {
		String result = "------------ Menu ------------\n\n";
		for(String category: categoryList) {
			result += "----- Category: " + category + " -----\n\n";
			for(Item item : itemList) {
				if(item.getCategory().equals(category)) {
					result += item.toString() + "\n";
				}
			}
		}
		return result;
	}
}

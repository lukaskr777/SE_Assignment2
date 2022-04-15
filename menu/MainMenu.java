
package menu;
import java.util.ArrayList;


import java.util.ArrayList;


public class MainMenu {

	private ArrayList<PriceStrategy> priceStrategyList;
	private ArrayList<String> categoryList;
	private ArrayList<Item> itemList;
	
	public MainMenu() {
		categoryList = new ArrayList<>();
		itemList = new ArrayList<>();
		priceStrategyList = new ArrayList<>();
	}
	
	public void addPriceStrategy(PriceStrategy priceStrategy) {
		priceStrategyList.add(priceStrategy);
	}
	
	public void removePriceStrategy(PriceStrategy priceStrategy) {
		priceStrategyList.remove(priceStrategy);
	}
	
	public double getPrice() {
		double price = 0;
		
		for(Item item : itemList) {
			price += item.getPrice();
		}
		
		for(PriceStrategy priceStrategy	: priceStrategyList) {
			if(priceStrategy.checkIfApply()) {
				price = priceStrategy.calculatePrice(price);
			}
		}
		
		return price;
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
					result += item.toString() + "\n" + item.getPrice() + "\n";
				}
			}
		}
		return result;
	}
}

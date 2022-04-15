package menu;
import java.util.ArrayList;

public class Item implements Orderable{
	
	private String category;
	private String name;
	private ArrayList<Ingredient> incredintsList;
	
	// Item is an edible item in  menu
	public Item(String name, String category) {
		this.name = name;
		incredintsList = new ArrayList<>();
		this.category = category;
	}
	
	// set name of item
	public void setName(String newName) {
		name = newName;
	}
	

	// get name of item
	public String getName() {
		return name;
	}
	
	// set items category (for example main dish)
	public void setCategory(String newCategory) {
		category = newCategory;
	}
	

	// return items category
	public String getCategory() {
		return category;
	}
	

	// add ingrdient to the item (we can for example add black pepper)
	public void addIncredient(Ingredient incredient) {
		incredintsList.add(incredient);
	}
	

	// remove unwanted ingredient
	public void deleteIncredient(Ingredient incredient) {
		for(Ingredient i : incredintsList) {
			if(i.equals(incredient)) {
				incredintsList.remove(i);
			}
		}
	}
	
	// calculate the default price of item
	@Override
	public double getPrice() {
		double sum = 0;
		for(Ingredient i : incredintsList) {
			sum += i.getPrice();
		}
		return sum;
	}
	
	// return all ingredients
	public ArrayList<Ingredient> getIngredientsList() {
		return incredintsList;
	}

	@Override
	public void setPrice(Ingredient ingredient, double newPrice) {
		for(Ingredient currentIngredient : incredintsList) {
			if(currentIngredient.equals(ingredient)) {
				currentIngredient.setPrice(newPrice);
			}
		}
	}
	
}

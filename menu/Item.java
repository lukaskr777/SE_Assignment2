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
	
<<<<<<< HEAD
	// calculate the default price of item
=======
	public ArrayList<Ingredient> getIngredientsList() {
		return incredintsList;
	}
	
>>>>>>> a40e5bfa26fe7740effbb492247b501da408de82
	@Override
	public double getPrice() {
		double sum = 0;
		for(Ingredient i : incredintsList) {
			sum += i.getPrice();
		}
		return sum;
	}
	
<<<<<<< HEAD
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
=======
	@Override
	public void setPrice(Ingredient ingredient, double newPrice) {
		for(Ingredient currentIngredient : incredintsList) {
			if(currentIngredient.equals(ingredient)) {
				currentIngredient.setPrice(newPrice);
			}
		}
	}
	
	private String getIngredients() {
		String ingredients = "";
		for(Ingredient i : incredintsList) {
			ingredients+= "Ingredient: " + i.getName() + ", price: " + i.getPrice() + "\n";
		}
		return ingredients;
	}
	
	public String getDescription() {
		String result = "Name: " + name + "\n\n" + getIngredients();		
		return result;
>>>>>>> a40e5bfa26fe7740effbb492247b501da408de82
	}
	
}

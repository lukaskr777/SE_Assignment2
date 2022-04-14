package main.menu.items;
import java.util.ArrayList;

public class Item implements Orderable{
	
	private String category;
	private String name;
	private ArrayList<Ingredient> incredintsList;
	
	public Item(String name, String category) {
		this.name = name;
		incredintsList = new ArrayList<>();
		this.category = category;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public String getName() {
		return name;
	}
	
	public void setCategory(String newCategory) {
		category = newCategory;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void addIncredient(Ingredient incredient) {
		incredintsList.add(incredient);
	}
	
	public void deleteIncredient(Ingredient incredient) {
		for(Ingredient i : incredintsList) {
			if(i.equals(incredient)) {
				incredintsList.remove(i);
			}
		}
	}
	
	@Override
	public double getPrice() {
		double sum = 0;
		for(Ingredient i : incredintsList) {
			sum += i.getPrice();
		}
		return sum;
	}
	
	public ArrayList<Ingredient> getIngredientsList() {
		return incredintsList;
	}
	
	private String getIngredients() {
		String ingredients = "";
		for(Ingredient i : incredintsList) {
			ingredients+= "Ingredient: " + i.getName() + ", price: " + i.getPrice() + "\n";
		}
		return ingredients;
	}
	
	public String toString() {
		String result = "Name: " + name + "\n\n" + getIngredients();		
		return result;
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

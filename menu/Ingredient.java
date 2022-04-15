package menu;

public class Ingredient {
	
	private String name; 
	private double price;
	

	// Ingredient can be for example tomatoes
	public Ingredient(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	// set the price of ingredient
	public void setPrice(double newPrice) {
		price = newPrice;
	}
	
	// return price
	public double getPrice() {
		return price;
	}
	
	
	public boolean equals(Object o) {
		if(o instanceof Ingredient) {
			return ((Ingredient) o).name.equals(name);
		}
		return false;
	}
	
	// return name of ingredient
	public String getName() {
		return name;
	}
	
}

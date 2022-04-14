<<<<<<< HEAD:main/menu/Ingredient.java
package menu;
=======
package main.menu.items;
>>>>>>> 9988973579e8bb04ca709cb7ca50f37b1b0f3248:menu/items/Ingredient.java

public class Ingredient {
	
	private String name; 
	private double price;
	
	public Ingredient(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public void setPrice(double newPrice) {
		price = newPrice;
	}
	
	public double getPrice() {
		return price;
	}
	
	public boolean equals(Object o) {
		if(o instanceof Ingredient) {
			return ((Ingredient) o).name.equals(name);
		}
		return false;
	}
	
	public String getName() {
		return name;
	}
	
}

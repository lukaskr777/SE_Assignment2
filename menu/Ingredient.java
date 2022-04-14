package menu;

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

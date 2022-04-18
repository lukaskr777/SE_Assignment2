package menu;

// Interface for the things that can be ordered
public interface Orderable {
	
	// get the price of an Orderable thing
	public double getPrice();
	// set the price of an Orderable thing
	public void setPrice(Ingredient ingredient, double newPrice);
	// set the name of an Orderable thing
	public void setName(String newName);
	// get the name of an Orderable thing
	public String getName();

}

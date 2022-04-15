package menu;

public interface Orderable {
	public double getPrice();
	public void setPrice(Ingredient ingredient, double newPrice);

	public void setName(String newName);
	public String getName();

}

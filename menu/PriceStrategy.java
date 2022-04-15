package menu;

public interface PriceStrategy {

	
	public void setPriceMode(MainMenu.PRICE_MODE);

	public double calculatePrice(double price);
	
}

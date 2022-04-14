package menu;

public interface PriceStrategy {

	
	public void setStrategy(MainMenu.PRICE_MODE);

	public double calculatePrice(double price);
	
}

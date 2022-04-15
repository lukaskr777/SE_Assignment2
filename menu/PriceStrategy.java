package menu;

public interface PriceStrategy {
	
	public void setStrategy();
	public boolean checkIfApply();
	public double calculatePrice(double price);
	
}

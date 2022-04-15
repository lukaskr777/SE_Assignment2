package pricing;

import menu.Orderable;

// interface for all specific pricing strategies
public interface PriceStrategy {

	public String display();
	
	// the strategy will calculate discount based on the items we want to order
	public double calculateDiscount(ArrayList<Orderable> items);
	
}

package pricing;

public class DiscountStrategy implements PriceStrategy {

    public String diplay(){
        return "5 Euro discount";
    }

    public double calculateDiscount(ArrayList<Orderable> items){
        return 5;
    }
    
}

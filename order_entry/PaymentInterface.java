package order_entry;


// interface for paying, There can be many classes that have different payment methods
public class PaymentInterface {
    
    // execute the payment
    public void pay(double amount);
}

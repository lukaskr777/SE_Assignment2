package OrderEntry;

public interface PayInterface {


    public String[] getPaymentOptions();

    public String[] getOrderOptions();

    public void payAndOrder(String payment_option, String order_option, String[] data);
    
}

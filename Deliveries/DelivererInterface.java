package Deliveries;

public interface DelivererInterface {
    

    public void requestDelivery(int order_id, String address);

    public int activeDeliveries();
}

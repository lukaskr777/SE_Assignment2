package Deliveries;

public interface Deliverer {
    

    public void requestDelivery(int order_id, String address);

    public int activeDeliveries();
}

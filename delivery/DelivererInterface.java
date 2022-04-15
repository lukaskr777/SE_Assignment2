package delivery;

import java.util.HashMap;

public interface DelivererInterface {
	
    public void sendOrderToDeliverer(int order_id, String address);
    public int getNumberOfActiveOrders();
    public HashMap<Integer,String> getOrdersToDeliver();
    
}

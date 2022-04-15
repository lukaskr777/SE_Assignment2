package delivery;

import java.util.HashMap;


// Interface of each deliverer
public interface DelivererInterface {
	
    // Each deliverer has to implement these methods to be able to deliver orders
    public void sendOrderToDeliverer(int order_id, String address);
    public int getNumberOfActiveOrders();
    public HashMap<Integer,String> getOrdersToDeliver();
    public String getContact();
    
}

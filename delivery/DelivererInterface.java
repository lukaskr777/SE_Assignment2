package delivery;

import java.util.HashMap;

public interface DelivererInterface {
	
    public void sendOrderToDeliverer(int order_id, String address);
    public int getNumberOfActiveDeliveries();
    public HashMap<Integer,String> getOrdersToDeliver();
    
}

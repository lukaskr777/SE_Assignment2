
import java.util.HashMap;

public class Deliverer implements DelivererInterface {

    private HashMap<Integer,String> to_deliver;

    public Deliverer(){
        to_deliver = new HashMap<>();
    }

    public void sendOrderToDeliverer(int order_id, String address){

        to_deliver.put(order_id, address);
        if(Math.random() > 0.9) to_deliver.clear(); // simulate that deliveries are being made

    }

    public int getNumberOfActiveOrders(){
        return to_deliver.size();
    }


	public HashMap<Integer, String> getOrdersToDeliver() {
		return to_deliver;
	}
    
}

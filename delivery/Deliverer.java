package delivery;


import java.util.HashMap;


// Deliverer is for example a car that can do deliveries
public class Deliverer implements DelivererInterface {

    private HashMap<Integer,String> to_deliver;

    public Deliverer(){
        to_deliver = new HashMap<>();
    }

    // deliverer remebers an order it needs to deliver
    public void sendOrderToDeliverer(int order_id, String address){

        to_deliver.put(order_id, address);
        if(Math.random() > 0.9) to_deliver.clear(); // simulate that deliveries are being made

    }

    // returns how many active deliveries does a Deliverer have
    public int getNumberOfActiveOrders(){
        return to_deliver.size();
    }

    // returns what Active deliveries does the deliverer hace
	public HashMap<Integer, String> getOrdersToDeliver() {
		return to_deliver;
	}

    // each deliverer has to have a contact, this contact is used in kitchen when the order is ready to be delivered
    public String getContact(){
        return "delivereer1";
    }
    
}

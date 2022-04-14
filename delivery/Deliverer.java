package delivery;

import java.util.HashMap;

public class Deliverer implements DelivererInterface {

    public HashMap<Integer,String> to_deliver;

    public Deliverer(){
        to_deliver = new HashMap<>();
    }

    

    public void requestDelivery(int order_id, String address){

        to_deliver.put(order_id, address);
        
        
        if(Math.random() > 0.9) to_deliver.clear(); // simulate that deliveries are being made

    }

    public int activeDeliveries(){
        return to_deliver.size();
    }
    
}

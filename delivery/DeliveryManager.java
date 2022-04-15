package delivery;

import java.util.ArrayList;

public class DeliveryManager {


    private ArrayList<DelivererInterface> deliverers;


    public DeliveryManager(){
        deliverers = new ArrayList<>();
    }

    public void addDeliverer(DelivererInterface d){
        deliverers.add(d);
    }
    
    public void deleteDeliverer(DelivererInterface d){
        deliverers.remove(d);
    }
    
    public boolean addDeliveryOrder(int order_id, String address){

        DelivererInterface d = findFreeDeliverer();
        
        if(d!=null) {
        	d.sendOrderToDeliverer(order_id, address);
        	return true;
        }
        return false;

    }

    private DelivererInterface findFreeDeliverer(){
        DelivererInterface best = deliverers.get(0);
        int min = best.getNumberOfActiveOrders();

        for(DelivererInterface d : deliverers){
            if(d.getNumberOfActiveOrders() < min){
                min= d.getNumberOfActiveOrders();
                best= d;
            }
        }
        return best;
    }
    
}

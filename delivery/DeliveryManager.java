package delivery;

import java.util.ArrayList;


// Delivery manager manages delivery requests
public class DeliveryManager {


    private ArrayList<DelivererInterface> deliverers;


    public DeliveryManager(){
        deliverers = new ArrayList<>();
    }


    // We can add new deliverer (for example the restaurant has a new car with a driver)
    public void addDeliverer(DelivererInterface d){
        deliverers.add(d);
    }
    
    // deliverer is no longer active
    public void deleteDeliverer(DelivererInterface d){
        deliverers.remove(d);
    }
    
    // this method determines the best deliverer and adds an order to it
    // it return the deliverers contact, so it can be binded with the order and when the order is finished(in kitchen),we can contact the deliverer directly
    public String addDeliveryOrder(int order_id, String address){

        DelivererInterface d = findFreeDeliverer();
        
        d.sendOrderToDeliverer(order_id, address);
        return d.getContact();


    }

    // finds the most suitable deliverer
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

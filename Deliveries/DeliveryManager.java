package Deliveries;

import java.util.ArrayList;

public class DeliveryManager {


    ArrayList<DelivererInterface> deliverers;


    public DeliveryManager(){
        deliverers = new ArrayList<>(3);
    }

    public void addDeliverer(DelivererInterface d){
        deliverers.add(d);
    }
    
    public void addDelivery(int order_id, String address){

        DelivererInterface d = findFreeDeliverer();
        d.requestDelivery(order_id, address);

    }

    public DelivererInterface findFreeDeliverer(){
        DelivererInterface best = deliverers.get(0);
        int min = best.activeDeliveries();

        for(DelivererInterface d : deliverers){
            if(d.activeDeliveries() < min){
                min= d.activeDeliveries();
                best= d;
            }
        }
        return best;
    }
    
}

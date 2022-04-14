
<<<<<<< HEAD:order_entry/OrderAPI.java
package order_entry;
=======
package order.entry;
>>>>>>> 9988973579e8bb04ca709cb7ca50f37b1b0f3248:order/entry/OrderAPI.java

import java.util.ArrayList;
import menu.Orderable;
import delivery.DeliveryManager;

public class OrderAPI{
    Kitchen kitchen;
    DeliveryManager manager;

    public OrderAPI(Kitchen kitchen){
        this.kitchen = kitchen;
    }

    public void inRestaurantOrder(ArrayList<Orderable> items, int table){
        Order o = new RestaurantOrder(table);
        o.addItems(items);

        kitchen.enqueOrder(o);
    }

    public void homeDeliveryOrder(ArrayList<Orderable> items, String address){
        Order o = new DeliveryOrder(address);
        manager.addDelivery(o.getId(), address);
        
        o.addItems(items);

        kitchen.enqueOrder(o);
    }

    public void externalOrder(ArrayList<Orderable> items, String orderer){
        Order o = new ExternalOrder(orderer);
        o.addItems(items);

        kitchen.enqueOrder(o);

    }


}
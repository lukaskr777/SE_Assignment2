
package OrderEntry;

import java.util.ArrayList;

public class OrderAPI{
    Kitchen kitchen;

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
        o.addItems(items);

        kitchen.enqueOrder(o);
    }

    public void externalOrder(ArrayList<Orderable> items, String orderer){
        Order o = new ExternalOrder(orderer);
        o.addItems(items);

        kitchen.enqueOrder(o);

    }


}
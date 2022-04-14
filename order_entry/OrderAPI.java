
package order_entry;

import java.util.ArrayList;

import menu.MainMenu;
import menu.Orderable;
import delivery.DeliveryManager;

public class OrderAPI{
    Kitchen kitchen;
    DeliveryManager manager;
    MainMenu menu;

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

    public MainMenu getDeliveryMenu(){
        menu.setPriceMode(MainMenu.PRICE_MODE.DELIVERY);
        return menu;
    }

    public MainMenu getInRestaurantMenu(){
        menu.setPriceMode(MainMenu.PRICE_MODE.IN_RESTAURANT);
        return menu;
    }


}
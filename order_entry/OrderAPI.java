
package order_entry;

import java.util.ArrayList;

import menu.MainMenu;
import menu.Orderable;
import pricing.PriceManager;
import delivery.DeliveryManager;

public class OrderAPI{
    private Kitchen kitchen;
    private PriceManager price_manager;
    private DeliveryManager delivery_manger;
    private MainMenu menu;

    // Order API manages all request from different parties (for example: uber eats, restauratn webpage, waiters)
    public OrderAPI(Kitchen kitchen, MainMenu menu, PriceManager price_manager, DeliveryManager delivery_manager){
        this.kitchen = kitchen;
        this.price_manager = price_manager;
        this.menu = menu;
        this.delivery_manger = delivery_manager;
    }

    // ordering in restaurant
    public void inRestaurantOrder(ArrayList<Orderable> items, int table, PaymentInterface payment){
        RestaurantOrder o = new RestaurantOrder(table);
        o.addItems(items);
        o.setPrice(price_manager.getInRestaurantPrice(items));
        payment.pay(o.getPrice());

        kitchen.enqueOrder(o);
    }

    // ordering for home delivery
    public void homeDeliveryOrder(ArrayList<Orderable> items, String address,PaymentInterface payment){
        DeliveryOrder o = new DeliveryOrder(address);   
        o.addItems(items);
        o.setPrice(price_manager.getDeliveryPrice(items));
        payment.pay(o.getPrice());
        String contact = delivery_manger.addDeliveryOrder(o.getId(), address);
        o.setContact(contact);

        kitchen.enqueOrder(o);
    }

    // external company order (Uber eats)
    public void externalOrder(ArrayList<Orderable> items, String orderer,PaymentInterface payment){
        ExternalOrder o = new ExternalOrder(orderer);
        o.addItems(items);
        o.setPrice(price_manager.getDeliveryPrice(items));
        payment.pay(o.getPrice());
        
        kitchen.enqueOrder(o);

    }

    // return menu (so it can be displayed in frontend)
    public MainMenu getMenu(){
        return menu;
    }

    // return price manager (so in the front ent the prices can be recalculated appropriately)
    public PriceManager getPriceManager(){
        return price_manager;
    }



}
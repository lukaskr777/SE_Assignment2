package order_entry;

import java.util.HashMap;

// Kitchen manages all the orders that have to be physically cooked
public class Kitchen {

    private HashMap<Integer,Order> orders_to_finish;
    private HashMap<Integer,Order> finished_orders;


    public Kitchen(){
        orders_to_finish = new HashMap<>();
        finished_orders = new HashMap<>();
    }
   
    // add order to be cooked
    public void enqueOrder(Order order){
        orders_to_finish.put(order.getId(),order);

    }   

    // display orders that are being cooked
    public HashMap<Integer,Order> displayOrdersToFinish(){
        return this.orders_to_finish;
    }

    // order is cooked
    public void finishOrder(String order_id){
        Order o = orders_to_finish.remove(order_id);
        o.notifyOrderer();
        finished_orders.put(o.getId(),o);
    }

    // return the orders that are finished but are still in the kitchen
    public HashMap<Integer,Order> displayFinishedOrders(){
        return finished_orders;
    }

    // take the order out of kitchen (for example waitress will take the order to a customer)
    public void takeoutOrder(String id){
        finished_orders.remove(id);
    }
    
}

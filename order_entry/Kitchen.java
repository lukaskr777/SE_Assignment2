package order_entry;

import java.util.HashMap;


public class Kitchen {

    private HashMap<Integer,Order> orders_to_finish;
    private HashMap<Integer,Order> finished_orders;


    public Kitchen(){
        orders_to_finish = new HashMap<>();
        finished_orders = new HashMap<>();
    }
   

    public void enqueOrder(Order order){
        orders_to_finish.put(order.getId(),order);

    }

    public HashMap<Integer,Order> displayOrdersToFinish(){
        return this.orders_to_finish;
    }

    public void finishOrder(String order_id){
        Order o = orders_to_finish.remove(order_id);
        finished_orders.put(o.getId(),o);
    }

    public HashMap<Integer,Order> displayFinishedOrders(){
        return finished_orders;
    }

    public void takeoutOrder(String id){
        finished_orders.remove(id);
    }
    
}

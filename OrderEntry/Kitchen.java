package OrderEntry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Queue;

public class Kitchen {

    Queue<Order> orders_to_finish;
    HashMap<String, Order> finished_orders;


    public Kitchen(){
        orders_to_finish = new Queue<>();
        finished_orders = new HashMap<>();
    }
   

    public void enqueOrder(Order order){
        orders.add(order);

    }

    public Queue<Order> displayOrdersToFinish(){
        return this.orders;
    }

    public void finishOrder(){
        Order o = orders_to_finish.poll();
        finished_orders.add(o.getId(),o);
    }

    public HashMap<String,Order> displayFinishedOrders(){
        return finished_orders;
    }

    public void takeoutOrder(String id){
        finished_orders.remove(id);
    }
    
}

package OrderEntry;

import java.util.ArrayList;
import java.util.Queue;

public class Kitchen {

    Queue<Order> orders;
   

    public void enqueOrder(Order order){
        orders.add(order);

    }

    public Queue<Order> displayOrders(){
        return this.orders;
    }

    public void dequeOrder(){
        orders.poll();
    }
    
}

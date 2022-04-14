<<<<<<< HEAD:order_entry/DeliveryOrder.java
package order_entry;
=======
package order.entry;
>>>>>>> 9988973579e8bb04ca709cb7ca50f37b1b0f3248:order/entry/DeliveryOrder.java

public class DeliveryOrder extends Order {
    
    String address;

    public DeliveryOrder(String address){
        this.address =address;
    }

    public String display(){
        return "delivery order; address: " + address;
    }
}

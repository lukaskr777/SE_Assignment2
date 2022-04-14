<<<<<<< HEAD:order_entry/ExternalOrder.java
package order_entry;
=======
package order.entry;
>>>>>>> 9988973579e8bb04ca709cb7ca50f37b1b0f3248:order/entry/ExternalOrder.java

public class ExternalOrder extends Order {


    String orderer;

    public ExternalOrder(String orderer){
        this.orderer = orderer;
    }


    public String display(){
        return "external order; orderer: " + orderer;
    }
    
}

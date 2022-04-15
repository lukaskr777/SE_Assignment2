package order_entry;

public class InternalDeliveryOrder extends Order {
    
    private String address;

    public InternalDeliveryOrder(String address){
        this.address =address;
    }

    public String display(){
        return "delivery order; address: " + address;
    }
}

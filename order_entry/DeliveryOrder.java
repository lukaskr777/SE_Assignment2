package order_entry;

public class DeliveryOrder extends Order {
    
    private String address;

    public DeliveryOrder(String address){
        this.address =address;
    }

    public String display(){
        return "delivery order; address: " + address;
    }
}

package order_entry;

// Order that has to be delivered by the restaurent to home
public class DeliveryOrder extends Order {
    
    private String address, deliverer_contact;

    public DeliveryOrder(String address){
        this.address =address;
    }

    // return a string that describes the order
    public String display(){
        return "delivery order; address: " + address;
    }


    // notify the deliverer that ordered the order
    public void notifyOrderer(){

    }

}

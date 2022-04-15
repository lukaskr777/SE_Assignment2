package order_entry;

public class ExternalDeliveryOrder extends Order {


    private String orderer;

    public ExternalDeliveryOrder(String orderer){
        this.orderer = orderer;
    }


    public String display(){
        return "external order; orderer: " + orderer;
    }
    
}

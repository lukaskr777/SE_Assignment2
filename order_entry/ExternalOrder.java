package order_entry;

public class ExternalOrder extends Order {


    String orderer;

    public ExternalOrder(String orderer){
        this.orderer = orderer;
    }


    public String display(){
        return "external order; orderer: " + orderer;
    }
    
}

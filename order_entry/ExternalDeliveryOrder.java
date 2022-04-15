package order_entry;

// Order that is for external company (Uber eats)
public class ExternalOrder extends Order {


    private String orderer;

    public ExternalOrder(String orderer){
        this.orderer = orderer;
    }

    // return a string that describes the order
    public String display(){
        return "external order; orderer: " + orderer;
    }

    // notify External compaty (Uber eats) that the order is finished
    public void notifyOrderer(){

    }
    
}

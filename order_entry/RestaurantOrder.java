package order_entry;

public class RestaurantOrder extends Order{

    public RestaurantOrder(int table){
        this.table = table;
    }

    // return a string that describes the order
    public String display(){
        return "restaurant order; table: " + table;
    }

    // notifies the waiter
    public void notifyOrderer(){

    }

    // which table ordered this order
    private int table;
}

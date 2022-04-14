package OrderEntry;

public class RestaurantOrder extends Order{

    public RestaurantOrder(int table){
        this.table = table;
    }

    public String display(){
        return "restaurant order; table: " + table;
    }

    int table;

    
}

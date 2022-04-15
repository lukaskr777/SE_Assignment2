package order_entry;

import java.util.ArrayList;
import menu.Orderable;

// Class that represents all orders
public abstract class Order {

    private static int id = 0;

    protected int order_id;

    private ArrayList<Orderable> items;
    private double final_price;

    public Order(){
        order_id = id++;
    }

    // Order will be set a price
    public void setPrice(double price){
        this.final_price = price;
    }

    // return price
    public double getPrice(){
        return this.final_price;
    }

    // add items to Order
    public void addItems(ArrayList<Orderable> items){
        this.items = items; 
    }

    // return items
    public ArrayList<Orderable> getItems(){
        return this.items;
    }

    // return unique id of Order
    public int getId(){
        return this.order_id;
    }

    // will notify the orderer
    public abstract void notifyOrderer(); 

    // return String that describes the order
    public abstract String display();
    
}

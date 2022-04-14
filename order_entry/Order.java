package order_entry;

import java.util.ArrayList;
import menu.Orderable;

public abstract class Order {

    private static int id = 0;

    protected int order_id;

    ArrayList<Orderable> items;

    public Order(){
        order_id = id++;
    }

    public void addItems(ArrayList<Orderable> items){
        this.items = items; 
    }

    public ArrayList<Orderable> getItems(){
        return this.items;
    }

    public int getId(){
        return this.order_id;
    }

    public abstract String display();
    
}

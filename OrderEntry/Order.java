package OrderEntry;

import java.util.ArrayList;

public class Order {

    ArrayList<Orderable> items;

    public Order(){
        items = new ArrayList<>();
    }

    public void addItem(Orderable o){
        items.add(o);
    }

    public ArrayList<Orderable> getItems(){
        return this.items;
    }
    
}

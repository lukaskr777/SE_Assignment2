package pricing;

import java.util.ArrayList;

import menu.Orderable;

// Manages all the strategies that a restaurant has
public class PriceManager {

    // there are different strategies for in restaurant orders and delivery orders
    private ArrayList<PriceStrategy> in_restaurant_strategies;
    private ArrayList<PriceStrategy> delivery_strategies;

    public PriceManager(){
        in_restaurant_strategies = new ArrayList<PriceStrategy>();
        delivery_strategies = new ArrayList<PriceStrategy>();
    }

    // add strategy to in restaurant strategies
    public void addInRestaurantStrategy(PriceStrategy strategy){
        in_restaurant_strategies.add(strategy);
    }

    // add strategy to delivery strategies
    public void addDeliveryStrategy(PriceStrategy strategy){
        delivery_strategies.add(strategy);
    }

    //remove strategy from in restaurant strategies
    public void removeInRestaurantStrategy(int index){
        in_restaurant_strategies.remove(index);
    }

    //remove strategy from delivery strategies
    public void removeDeliveryStrategy(int index){
        delivery_strategies.remove(index);
    }
    // calculate the default price of an order
    private double getTotal(ArrayList<Orderable> items){
        double total = 0;
        for(Orderable o : items){
            total += o.getPrice();
        }
        return total;
    }

    // add price markups based on in restaurant strategies
    public double getInRestaurantPrice(ArrayList<Orderable> items){
        double total = getTotal(items);
        for(PriceStrategy s :in_restaurant_strategies){
            double discount = s.calculateDiscount(items);
            total -= discount;
        }
        return total;
    }

    // add price markups based on delivery strategies
    public double getDeliveryPrice(ArrayList<Orderable> items){
        double total = getTotal(items);

        for(PriceStrategy s :delivery_strategies){
            double discount = s.calculateDiscount(items);
            total -= discount;
        }
        return total;
    }

    // return String that describes the pricing strategies
    public String display(){
        String s = "Active In restaurant Strategies: \n";
        for(int i = 0; i != in_restaurant_strategies.size(); ++i){
            s += in_restaurant_strategies.get(i).display() + ", index: " + i;
            s += "\n";
        }

        s += "\nActive Delivery Strategies: \n";
        for(int i = 0; i != delivery_strategies.size(); ++i){
            s += delivery_strategies.get(i).display() + ", index: " + i;
            s += "\n";
        }
        return s;
    }
    
}

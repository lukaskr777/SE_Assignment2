import java.sql.Time;

public class Examples {


    public static void main(String[] args){

        // ----------------------- Delivery package
        DeliveryManager delivery_manager = new DeliveryManager();
        DelivererInterface uber_eats = new Deliverer();
        delivery_manager.addDeliverer(uber_eats);

        // ---------- menu package
        MainMenu menu = new MainMenu();
        Ingredient tomatoes = new Ingredient("tomatoes",1.99);
        Ingeredient rice = new Ingredient("rice", 2.99);
        Item rice_with_tomatoes = new Item("rice_with_tomatoes","main_dish");
        rice_with_tomatoes.addIngredient(rice);
        rice_with_tomatoes.addIngredient(tomatoes);
        menu.addItem(rice_with_tomatoes);


        // -------------------- Price manager package
        PriceManager price_manager = new PriceManager();
        PriceStrategy discount = new DiscountStrategy();
        price_manager.addDeliveryStrategy(discount);


        // --------------------- Order Entry package
        Kitchen kitchen = new Kitchen();
        Order delivery_order = new InternalDeliveryOrder(); // in reality, the order is created in order API
        kitchen.enqueOrder(delivery_order);
        OrderAPI order_api = new OrderAPI(kitchen, menu,price_manager,delivery_manager);

    }
    
}

public class TestOrders {
    public static void main(String[] args) {
    
    CoffeeKiosk appTest = new CoffeeKiosk();
    //Building and displaying the menu
    Item item1 = new Item(0, "mocha", 3.00);
    Item item2 = new Item(1, "latte", 3.50);
    Item item3 = new Item(2, "drip coffee", 4.00);
    Item item4 = new Item(3, "capuccino", 4.00);

    appTest.addMenuItem(item1);
    appTest.addMenuItem(item2);
    appTest.addMenuItem(item3);
    appTest.addMenuItem(item4);

    appTest.displayMenu();
    
    //Testing the new Order function.
    appTest.newOrder();


    }
}

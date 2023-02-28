import java.util.ArrayList;

public class CoffeeKiosk {
    private ArrayList<Item> menu;
    private ArrayList<Order> orders;


    public CoffeeKiosk(){
        this.menu = new ArrayList<Item>();
        this.orders = new ArrayList<Order>();
        }

    public void addMenuItem(Item item){
        menu.add(item);
    }

    public void displayMenu(){
        for(Item item : menu){
            item.displayItem();
        }
    }

    public void newOrder() {
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();
        displayMenu();
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();
        Order order1 = new Order();

        // Write a while loop to collect all user's order items
        while(!itemNumber.equals("q")) {

            //Orders Item 0
            if (itemNumber.equals("0")){
                Item item0 = new Item(0, "mocha", 3.00);
                order1.addItem(item0);
                
            }

            //Orders Item 1
            if (itemNumber.equals("1")){
                Item item1 = new Item(1, "latte", 3.50);
                order1.addItem(item1);
            }

            //Orders Item 2
            if (itemNumber.equals("2")){
                Item item2 = new Item(2, "drip coffee", 4.00);
                order1.addItem(item2);
            }

            //Orders Item 3
            if (itemNumber.equals("3")){
                Item item3 = new Item(3, "capuccino", 4.00);
                order1.addItem(item3);
            }
            //After the logic for one of those conditions is performed, repeat the process.
            System.out.println("Please enter a menu item index or q to quit:");
            itemNumber = System.console().readLine();
        }
        System.out.println(order1.getItems().size());
        System.out.println("Thank you," + name + ". Here are your order details:");
        order1.display(name);
    }












}



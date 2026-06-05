package rvt.onlineshop;

import java.util.Scanner;

public class store {

    private warehouse warehouse;
    private Scanner scanner;

    public store(warehouse warehouse, Scanner scanner) {
        this.warehouse = warehouse;
        this.scanner = scanner;
    }

    public void shop(String customer) {
        ShoppingCart cart = new ShoppingCart();
        System.out.println("Welcome to the store " + customer);
        System.out.println("our selection:");

        for (String product : this.warehouse.products()) {
            System.out.println(product);
        }

        while (true) {
            System.out.print("What to put in the cart (press enter to go to the register): ");
            String product = scanner.nextLine();
            if (product.isEmpty()) {
                break;
            }
            
            if(warehouse.take(product)){
             cart.add(product, warehouse.price(product));
            }

        }

        System.out.println("your shoppingcart contents:");
        cart.print();
        System.out.println("total: " + cart.price());
        for (String product : this.warehouse.products()) {
            System.out.println(warehouse.stock(product));
        }
    }

    public static void main(String[] args) {
        warehouse warehouse = new warehouse();
        warehouse.addProduct("coffee", 5, 10);
        warehouse.addProduct("milk", 3, 20);
        warehouse.addProduct("cream", 2, 55);
        warehouse.addProduct("bread", 7, 8);

        Scanner scanner = new Scanner(System.in);

        store store = new store(warehouse, scanner);
        store.shop("John");
    }
}
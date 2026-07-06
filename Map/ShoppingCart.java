package Collections.Lists.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ShoppingCart {
   static void main(String[] args) {
        HashMap<String, Integer> cart =  new HashMap<>();
        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.println("---Shopping Cart Menu---");
            System.out.println("1. Add Item to Cart");
            System.out.println("2. View Cart Items Only(Names Only");
            System.out.println("3. View final bill / Summary (Items & Quantity)");
            System.out.println("4. Exit");

            System.out.println("Enter your choice: (1-4) = ");

            String choice = input.nextLine();

            switch (choice){
                case "1":
                    System.out.println("Enter Item Name : ");
                    String itemName = input.nextLine();
                   // String updatedQuantity = input.nextLine();

                    if (cart.containsKey(itemName)){
                        cart.put(itemName, cart.get(itemName) + 1);
                        // cart.put(itemName, cart.get(itemName));
                    }
                    else {
                        cart.put(itemName, 1);
                    }
                    System.out.println(itemName + " Added Successfully");
                    break;
                    case "2":
                        if (cart.isEmpty()) {
                            System.out.println("Cart is Empty");
                        }
                        else {
                            for (String item : cart.keySet()){
                                System.out.println(item);
                            }
                        }


                        break;

                case "3":
                    if (cart.isEmpty()) {
                        System.out.println("Cart is Empty");
                    }
                    else {
                        for(Map.Entry<String, Integer> entry : cart.entrySet()){
                            System.out.println(entry.getKey() + " : " + entry.getValue());
                        }
                    }

                    break;
                    case "4":
                        System.out.println("Existing Application. Bye!");
                        System.exit(0);
                default:
                    System.out.println("Invalid Choice. Please try again.");
            }






        }
    }
}

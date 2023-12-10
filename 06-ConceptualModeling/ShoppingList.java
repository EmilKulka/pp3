import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {
    static ArrayList<String> list = new ArrayList<>();

    public static void numOfProducts() {
        System.out.println(String.format("Number of products: %d",list.size()));
    }

    public static void listOfProducts() {
        if(list.size() == 0) {
            System.out.println("List is empty.");
        }
        else {
            for(String product : list) {
                System.out.print(product + ", ");
            }
            System.out.println();
        }
    }

    public static void addProduct(String product) {
        list.add(product);
    }

    public static void addProductFromKeybord() {
        Scanner product = new Scanner(System.in);
        System.out.println("Enter product that you want to add to your list.");
        list.add(product.nextLine());
        product.close();
    }
    public static void main(String[] args) {
        ShoppingList.numOfProducts();
        ShoppingList.listOfProducts();
        ShoppingList.addProduct("butter");
        ShoppingList.addProduct("bread");
        ShoppingList.addProduct("ham");
        ShoppingList.listOfProducts();
        ShoppingList.numOfProducts();
        ShoppingList.addProductFromKeybord();
        ShoppingList.listOfProducts();
        ShoppingList.numOfProducts();
    }
}

package Project;

import java.util.ArrayList;

public class GroceryList extends GroceryBody {

    ArrayList<String> cart= new ArrayList<>();
    void addItemToCart (String itemName ){
        cart.add(itemName);
    }
    void printCartItem (){
        System.out.println("items inside of the cart ");
        for(String  item: cart){
            System.out.println( item + " ");
        }
    }
    double totalPrice () {
        return 0;
    }
}

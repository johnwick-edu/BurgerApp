 
package Models;

import java.util.ArrayList;
import java.util.Arrays;

 
public class Burger {
    
    private ArrayList<String> toppings;   // List to store burger toppings
    
    private static final int MAX_TOPPINGS = 5; // Max number of toppings
    
    private static final double BURGER_PRICE = 20.0; // Base price of a burger
    
    private static final double TOPPING_PRICE = 2.0; // Price of each toppping
    
    public Burger(){
        // Initializing the toppings list
        toppings = new ArrayList<>();
    }
    
    public void addTopping(String topping) throws Exception{
        if(toppings.size()<MAX_TOPPINGS){
            toppings.add(topping);
        }else{
            throw new Exception("Maximum number of toppings reached!");
        }
    }

    public double calculatePrice(){
        return BURGER_PRICE + (TOPPING_PRICE * toppings.size());
    }
    
    @Override
    public String toString() {
        return "Burger with toppings: "+toppings +"\nTotal Price: R "+calculatePrice();
    }
    
    
    public ArrayList<String> getToppings(){
        return this.toppings;
    }
    
}

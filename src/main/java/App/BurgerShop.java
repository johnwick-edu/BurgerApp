 
package App;
 
import Models.Burger;
import Models.DeliveryBurger;
import java.util.Scanner; 
public class BurgerShop {
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Burger burger = new Burger();
        
        pl("Welcome to the Burger Shop!");
        pl("Each burger costs R20, and each topping costs R2.");
        pl("You can add up to 5 toppings.");
        
        
        // collecting toppings from the user
        while(true){
            p("Enter a topping (or type 'done' to finish): ");
            
            String topping = scanner.nextLine();
            
            if(topping.equalsIgnoreCase("done")){
                break;
            }
            
            try {
                burger.addTopping(topping);
            } catch (Exception ex) {
               pl(ex.getMessage());
               break;
            }
        }
        
        // ask the user for delivery
        p("Do you want delivery? (yes/no)");
        String deliveryChoice = scanner.nextLine();
        
        if(deliveryChoice.equalsIgnoreCase("yes")){
            p("Enter your delivery address: ");
            String address =  scanner.nextLine();
            
            DeliveryBurger deliveryBurger = new DeliveryBurger(address, burger.calculatePrice());
            System.out.println(deliveryBurger);
            
        }else{
            System.out.println(burger);
        }
     
        scanner.close();
    }
    
    
    private static void p(String input){
        System.out.print(input);
    }
    
    private static void pl(String input){
        System.out.println(input);
    }
}

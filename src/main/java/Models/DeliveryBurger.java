 
package Models;
 
public class DeliveryBurger extends Burger {
    
    // Delivery fee if total price > R80
    private static final double DELIVERY_FEE_LOW = 30.0; 
    
    // Delivery fee if total price <= R80
    private static final double DELIVERY_FEE_HIGH = 50.0; 
    
    private double deliveryFee;
    private String deliveryAddress;
    
    
    public DeliveryBurger(String address, double burgerPrice){
       this.deliveryAddress = address;
       this.deliveryFee = (burgerPrice > 80) ? DELIVERY_FEE_LOW : DELIVERY_FEE_HIGH;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDelivery Address: "+deliveryAddress
                +"\nDelivery Fee: R"+deliveryFee
                +"\nFinal Total: R"+calculatePrice();
    }

    @Override
    public double calculatePrice() {
        return super.calculatePrice() + deliveryFee;
    }
    
    
    
}

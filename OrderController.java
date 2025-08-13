public class OrderController {
    public void processOrder(Order order) {
        // Polymorphic call to calculate total
        double total = order.calculateTotal();
        
        // Process payment
        // Update inventory
        // Notify restaurant and delivery
    }
}

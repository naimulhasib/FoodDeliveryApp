public class Customer extends User {
    private String address;
    private List<Order> orderHistory;

    public Customer(String username, String password, String name, String address) {
        super(username, password, name);
        this.address = address;
        this.orderHistory = new ArrayList<>();
    }

    @Override
    public String getRole() {
        return "Customer";
    }

    // Customer-specific methods
    public void placeOrder(Order order) {
        orderHistory.add(order);
    }
}

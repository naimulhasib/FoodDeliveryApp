public class MainFrame extends JFrame {
    private CardLayout cardLayout;
    private JPanel cardPanel;
    
    private LoginPanel loginPanel;
    private CustomerPanel customerPanel;
    private RestaurantPanel restaurantPanel;
    private DeliveryPanel deliveryPanel;
    
    public MainFrame() {
        setTitle("Food Delivery App");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);
        
        // Initialize panels
        loginPanel = new LoginPanel(this);
        customerPanel = new CustomerPanel(this);
        restaurantPanel = new RestaurantPanel(this);
        deliveryPanel = new DeliveryPanel(this);
        
        // Add panels to card layout
        cardPanel.add(loginPanel, "LOGIN");
        cardPanel.add(customerPanel, "CUSTOMER");
        cardPanel.add(restaurantPanel, "RESTAURANT");
        cardPanel.add(deliveryPanel, "DELIVERY");
        
        add(cardPanel);
        showLoginPanel();
    }
    
    public void showLoginPanel() {
        cardLayout.show(cardPanel, "LOGIN");
    }
    
    public void showCustomerPanel(Customer customer) {
        customerPanel.setCustomer(customer);
        cardLayout.show(cardPanel, "CUSTOMER");
    }
    
    // Other navigation methods...
}

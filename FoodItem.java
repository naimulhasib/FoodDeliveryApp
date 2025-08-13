public abstract class FoodItem {
    private String name;
    private double price;
    private String description;

    public FoodItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    // Abstract method for item preparation time
    public abstract int getPreparationTime();

    // Getters
    public String getName() { return name; }
    public double getPrice() { return price; }
    public String getDescription() { return description; }
}

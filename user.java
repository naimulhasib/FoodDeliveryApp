public abstract class User {
    private String username;
    private String password;
    private String name;

    public User(String username, String password, String name) {
        this.username = username;
        this.password = password;
        this.name = name;
    }

    // Getters and setters
    public String getUsername() { return username; }
    public String getName() { return name; }

    public boolean authenticate(String password) {
        return this.password.equals(password);
    }

    // Abstract method demonstrating abstraction
    public abstract String getRole();
}

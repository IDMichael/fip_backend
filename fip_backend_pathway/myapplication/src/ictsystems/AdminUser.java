package ictsystems;

public class AdminUser extends AbstractUser implements UserManagement {
    private String role;

    public AdminUser(String username, String email, String role) {
        super(username, email);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public void displayUser() {
        System.out.println("Admin User: " + username + " (" + role + ")");
    }

    @Override
    public void addUser() {
        System.out.println(username + " is adding a user...");
    }

    @Override
    public void removeUser() {
        System.out.println(username + " is removing a user...");
    }

    @Override
    public void updateUser() {
        System.out.println(username + " is updating a user...");
    }
}

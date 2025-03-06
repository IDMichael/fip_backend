package ictsystems;

/**
 * Abstract class representing a user in the ICT system.
 */
public abstract class AbstractUser {
    protected String username;
    protected String email;

    public AbstractUser(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public abstract void displayUser();

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

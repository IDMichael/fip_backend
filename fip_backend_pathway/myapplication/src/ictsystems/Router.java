package ictsystems;

public class Router extends AbstractNetwork implements NetworkOperations {
    private String ipAddress;

    public Router(String networkName, int speed, String ipAddress) {
        super(networkName, speed);
        this.ipAddress = ipAddress;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    @Override
    public void connect() {
        System.out.println("Router " + networkName + " is connecting...");
    }

    @Override
    public void connectToInternet() {
        System.out.println("Router is connecting to the internet...");
    }

    @Override
    public void disconnect() {
        System.out.println("Router is disconnecting from the internet...");
    }

    @Override
    public void checkStatus() {
        System.out.println("Checking router status...");
    }
}

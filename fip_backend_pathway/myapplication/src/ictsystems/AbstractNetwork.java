package ictsystems;

/**
 * Abstract class representing a network entity.
 */
public abstract class AbstractNetwork {
    protected String networkName;
    protected int speed;

    public AbstractNetwork(String networkName, int speed) {
        this.networkName = networkName;
        this.speed = speed;
    }

    public abstract void connect();

    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}

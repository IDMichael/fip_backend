package ictsystems;

/**
 * Abstract class representing a device with basic details.
 */
public abstract class AbstractDevice {
    protected String name;
    protected String model;

    public AbstractDevice(String name, String model) {
        this.name = name;
        this.model = model;
    }

    public abstract void showDetails();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

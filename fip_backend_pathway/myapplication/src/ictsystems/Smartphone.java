package ictsystems;

public class Smartphone extends AbstractDevice implements DeviceOperations, SoftwareOperations {
    private String osVersion;

    public Smartphone(String name, String model, String osVersion) {
        super(name, model);
        this.osVersion = osVersion;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    @Override
    public void showDetails() {
        System.out.println("Smartphone: " + name + ", Model: " + model + ", OS: " + osVersion);
    }

    @Override
    public void powerOn() {
        System.out.println(name + " is powering on...");
    }

    @Override
    public void powerOff() {
        System.out.println(name + " is shutting down...");
    }

    @Override
    public void reset() {
        System.out.println(name + " is resetting...");
    }

    @Override
    public void installSoftware() {
        System.out.println("Installing software on " + name);
    }

    @Override
    public void uninstallSoftware() {
        System.out.println("Uninstalling software from " + name);
    }

    @Override
    public void updateSoftware() {
        System.out.println("Updating software on " + name);
    }
}

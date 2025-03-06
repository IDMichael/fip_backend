package ictsystems;

public class Computer extends AbstractDevice implements DeviceOperations {
    private String operatingSystem;

    public Computer(String name, String model, String operatingSystem) {
        super(name, model);
        this.operatingSystem = operatingSystem;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    @Override
    public void showDetails() {
        System.out.println("Computer: " + name + ", Model: " + model + ", OS: " + operatingSystem);
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
}

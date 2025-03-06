package ictsystems;

/**
 * Class to run and test the package.
 */
public class RunICTSystems {
    public static void main(String[] args) {
        // Computer instance
        Computer myComputer = new Computer("Dell", "Inspirom", "Windows 11");
        myComputer.showDetails();
        myComputer.powerOn();
        myComputer.reset();

        // Router instance
        Router myRouter = new Router("MyWiFi", 100, "192.168.1.1");
        myRouter.connect();
        myRouter.connectToInternet();
        myRouter.checkStatus();

        // Admin User instance
        AdminUser admin = new AdminUser("Michael", "admin@ict.com", "SuperAdmin");
        admin.displayUser();
        admin.addUser();

        // Smartphone instance
        Smartphone myPhone = new Smartphone("Infinix", "Hot 50i", "Android 14");
        myPhone.showDetails();
        myPhone.powerOn();
        myPhone.updateSoftware();

        // CyberSecurity instance
        CyberSecurity security = new CyberSecurity("AES-256");
        security.encryptData();
        security.authenticateUser();
    }
}

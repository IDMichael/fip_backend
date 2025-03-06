package ictsystems;

public class CyberSecurity implements SecurityOperations {
    private String encryptionType;

    public CyberSecurity(String encryptionType) {
        this.encryptionType = encryptionType;
    }

    public String getEncryptionType() {
        return encryptionType;
    }

    public void setEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
    }

    @Override
    public void encryptData() {
        System.out.println("Data encrypted using " + encryptionType);
    }

    @Override
    public void decryptData() {
        System.out.println("Data decrypted using " + encryptionType);
    }

    @Override
    public void authenticateUser() {
        System.out.println("User authentication in progress...");
    }
}

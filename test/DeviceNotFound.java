package test;

public class DeviceNotFound extends  Exception

{
    private String  message;

    public DeviceNotFound(String message) {
        this.message = message;
    }

    public DeviceNotFound(String message, String message1) {
        super(message);
        this.message = message1;
    }
}

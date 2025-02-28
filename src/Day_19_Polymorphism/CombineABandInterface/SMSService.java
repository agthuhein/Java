package src.Day_19_Polymorphism.CombineABandInterface;

public class SMSService extends BaseMessageService {

    @Override
    public void sendMessage(String message, String recipient) {
        logMessage(message);
        System.out.println("Sending SMS to " + recipient + " with message: " + message);
    }
}

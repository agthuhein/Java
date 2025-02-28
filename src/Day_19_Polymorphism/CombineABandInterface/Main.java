package src.Day_19_Polymorphism.CombineABandInterface;

public class Main {
    public static void main(String[] args) {
        IMessageService emailService = new EmailService();
        IMessageService smsService = new SMSService();

        emailService.sendMessage("Hello", "alice@gmail.com");
        smsService.sendMessage("I love you", "+65 98804670");
    }
}

package src.Day_19_Polymorphism.CombineABandInterface;

public abstract class BaseMessageService implements IMessageService {
    void logMessage(String message) {
        System.out.println("Logging message: " + message);
    }
}

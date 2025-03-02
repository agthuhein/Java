package src.Spring.SetterDI.More_ExampleofSetterDI;

public class Main {
    public static void main(String[] args) {
        GreetingServiceImpl greetingService = new GreetingServiceImpl();
        MessageService messageService = new MessageService();

        //Setter Dependency Injection
        greetingService.setMessageService(messageService);
        greetingService.sendGreeting();
    }
}

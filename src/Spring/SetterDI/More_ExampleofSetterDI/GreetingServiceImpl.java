package src.Spring.SetterDI.More_ExampleofSetterDI;

public class GreetingServiceImpl implements IGreetingService {
    private MessageService messageService;

    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    @Override
    public void sendGreeting() {
        if(messageService != null){
            System.out.println("MessageService is initialized");
            System.out.println(messageService.getMessage());
        }
        else {
            System.out.println("MessageService is not initialized");
        }
    }
}

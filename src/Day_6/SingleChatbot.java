package Day_6;

import java.util.Scanner;

public class SingleChatbot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter something: ");
        String input = scanner.nextLine();

        if(input.equalsIgnoreCase("hello") || input.equalsIgnoreCase("hi")) {
            System.out.println("Chatbot: Hello! How can I help you today?");
        }
        if(input.equalsIgnoreCase("how are you") || input.equalsIgnoreCase("how's it going")) {
            System.out.println("Chatbot: I am a chat bot. I am here to help you today.");
        }
        if(input.equalsIgnoreCase("what's the weather like") || input.equalsIgnoreCase("weather")) {
            System.out.println("Chatbot: I don't have the real-time weather today. But it always sunny in the digital world!");
        }
        if(input.equalsIgnoreCase("bye") || input.equalsIgnoreCase("goodbye")) {
            System.out.println("Chatbot: Goodbye! Have a great day!");
        }

        if(!input.equalsIgnoreCase("hello") && !input.equalsIgnoreCase("hi") &&
        !input.equalsIgnoreCase("how are you") && !input.equalsIgnoreCase("how's it going") &&
        !input.equalsIgnoreCase("what's the weather like") && !input.equalsIgnoreCase("weather") &&
                !input.equalsIgnoreCase("bye") && !input.equalsIgnoreCase("goodbye")) {
            System.out.println("Chatbot: I'm sorry. I don't understand that");
        }

        scanner.close();
    }
}

package src.Day_15_Todo_App;

import java.util.ArrayList;
import java.util.Scanner;

public class todoApp {
    private static final ArrayList<String> tasks = new ArrayList<>();
    private static final ArrayList<Boolean> isCompleted = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while(running) {
            printMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 1:
                    addTask(scanner);
                    break;
                case 2:
                    viewTask(scanner);
                    break;
                case 3:
                    markTask(scanner);
                    break;
                case 4:
                    removeTask(scanner);
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
    public static void printMenu() {
        System.out.println("\n To-Do List Application");
        System.out.println("1. Add your task");
        System.out.println("2. View your tasks");
        System.out.println("3. Mark a test as completed");
        System.out.println("4. Remove your task");
        System.out.println("5. Exit");
        System.out.print("Choose an option: ");
    }
    public static void addTask(Scanner scanner) {
        System.out.print("Enter your task: ");
        String task = scanner.nextLine();
        tasks.add(task);
        isCompleted.add(false);
        System.out.println("Task Added");
    }
    public static void viewTask(Scanner scanner) {
        for(int i = 0; i < tasks.size(); i++) {
            String status = isCompleted.get(i) ? "Completed" : "Pending";
            System.out.println((i+1) + "." + tasks.get(i) + ": Status is: " + status);
        }
    }
    public static void markTask(Scanner scanner) {
        System.out.print("Enter your task number to mark as completed: ");
        int taskNumber = scanner.nextInt();
        scanner.nextLine();

        if(taskNumber > 0 && taskNumber <= tasks.size()) {
            isCompleted.set(taskNumber - 1, true);
            System.out.println("Task marked as completed");
        }
        else {
            System.out.println("Invalid task number");
        }
    }
    public static void removeTask(Scanner scanner) {
        System.out.print("Enter your task number to remove as completed: ");
        int taskNumber = scanner.nextInt();
        scanner.nextLine();
        if(taskNumber > 0 && taskNumber <= tasks.size()) {
            tasks.remove(taskNumber - 1);
            isCompleted.remove(taskNumber - 1);
            System.out.println("Task removed");
        }
        else {
            System.out.println("Invalid task number");
        }
    }
}

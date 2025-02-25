package Day_10;

import java.util.Scanner;

public class spaceTravelSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] astronautNames = new String[10];
        int[] astronautAge = new int[10];
        String[] missionStatus = new String[10];

        int numAstronauts = 0;
        boolean flag = true;
        while (flag){
            System.out.println("Choose an option:");
            System.out.println("1. Add astronaut to mission");
            System.out.println("2. Update astronaut's mission status");
            System.out.println("3. Display all astronauts");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 1:
                    System.out.println("Enter astronaut name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter astronaut age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter astronaut mission status: (On mission / Available:): ");
                    String status = scanner.nextLine();

                    astronautNames[numAstronauts] = name;
                    astronautAge[numAstronauts] = age;
                    missionStatus[numAstronauts] = status;
                    numAstronauts++;

                    break;
                case 2:
                    System.out.println("Enter astronaut name to update status: ");
                    String astronautName = scanner.nextLine();

                    boolean found = false;

                    for (int i = 0; i < numAstronauts; i++) {
                        if(astronautNames[i].equalsIgnoreCase(astronautName)){
                            System.out.println("Enter new mission status(On mission / Available:): ");
                            String newStatus = scanner.nextLine();
                            missionStatus[i] = newStatus;
                            System.out.println("Mission status updated for: " + astronautName);

                            found = true;
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("Astronaut does not exist");
                    }
                    break;
                case 3:
                    System.out.println("All astronauts:");
                    if(numAstronauts == 0){
                        System.out.println("No astronauts added to the mission yet.");
                    }
                    else {
                        for (int i = 0; i < numAstronauts; i++) {
                            System.out.println("Name: " + astronautNames[i] + ", Age: " + astronautAge[i] + ", Status: " + missionStatus[i]);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Exiting program. Goodbye!");
                    scanner.close();
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid option from 1 to 4.");
            }
            System.out.println();
            //scanner.close();
        }
    }
}

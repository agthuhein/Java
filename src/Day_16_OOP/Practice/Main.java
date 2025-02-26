package src.Day_16_OOP.Practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many students you want to enter? ");
        int numStudents = sc.nextInt();

        Student[] students = new Student[numStudents];
        for (int i = 0; i < numStudents; i++) {
            sc.nextLine();

            System.out.println("Enter detail for the student " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Age: ");
            int age = sc.nextInt();

            System.out.print("Roll Number: ");
            int rollNumber = sc.nextInt();

            System.out.print("Height: ");
            double height = sc.nextDouble();

            students[i] = new Student(name, age, rollNumber, height);
        }
        calculateAndDisplay(students);
    }
    public static void calculateAndDisplay(Student[] students) {
        int totalAge = 0;
        double totalHeight = 0.0;
        int oldestAge = students[0].age;
        double tallestHeight = students[0].height;
        String oldestStudent = students[0].name;
        String tallestStudent = students[0].name;

        for (Student student : students) {
            totalAge += student.age;
            totalHeight += student.height;

            if (student.age > oldestAge) {
                oldestAge = student.age;
                oldestStudent = student.name;
            }
            if (student.height > tallestHeight) {
                tallestHeight = student.height;
                tallestStudent = student.name;
            }
        }
        double averageAge = (double) totalAge / students.length;
        double averageHeight = totalHeight / students.length;

        System.out.println("\\n --- Statistics ---");
        System.out.println("Average Age: " + averageAge + " years");
        System.out.println("Average Height: " + averageHeight + " cm");
        System.out.println("Oldest Student: " + oldestStudent + " (Age) " + oldestAge + " years");
        System.out.println("Tallest Student: " + tallestStudent + " (Height) " + tallestHeight + " cm");
    }
}

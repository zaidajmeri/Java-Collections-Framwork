package Collections.Lists.Map;

import java.io.BufferedReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentClass {
    public static void main(String[] args) {
        HashMap<String, Integer> Student = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            //menu
            System.out.println("\n === Student Grade System ===");
            System.out.println("1. Add/Update Student Grade");
            System.out.println("2. Search Student Grade");
            System.out.println("3. Check for Perfect Scores");
            System.out.println("4. Display Class Roaster");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: (1- 5)");

            String choice = sc.next(); //taking variable from user

            switch (choice) {
                case "1":
                    System.out.println("Enter Student Name: ");
                    String name = sc.next();
                    System.out.println("Enter Student Grades");
                    int grades = sc.nextInt();
                    Student.put(name, grades);
                    System.out.println("Student Added Successfully");
                    break;

                case "2":
                    System.out.println(" Enter Student Name to Search Grades");
                    String search = sc.next();
                    if (Student.containsKey(search)) {
                        System.out.println("Student Name: " + search + ", Grades: " + Student.get(search));
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case "3":
                    if (Student.containsValue(100)) {
                        System.out.println("Great news! At least one student achieved a perfect score of 100!");
                    } else {
                        System.out.println("No Student has perfect score of 100!");
                    }
                    break;

                case "4":
                    if (Student.isEmpty()) {
                        System.out.println("No students in the class roster.");
                    } else {
                        System.out.println("---Class Roaster---");
                        for (Map.Entry<String, Integer> entry : Student.entrySet()) {
                            System.out.println(entry.getKey() + ": " + entry.getValue());
                        }

                    }
                    break;

                case "5":
                    System.out.println("Existing system. Bye");
                    System.exit(0);

                default:{
                    System.out.println("Invalid choice. Please try again.");
                }
            }
        }

    }
}


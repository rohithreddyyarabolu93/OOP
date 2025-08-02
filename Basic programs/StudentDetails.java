package mypackage;

import java.util.Scanner;
public class StudentDetails {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter roll number: ");
        int rollNumber = scanner.nextInt();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.print("Enter gender (M/F): ");
        char gender = scanner.next().charAt(0);

        System.out.print("Enter percentage: ");
        double percentage = scanner.nextDouble();
        System.out.println("Student Details\n");
        System.out.printf("Name       : %s%n", name);
        System.out.printf("Roll No    : %d%n", rollNumber);
        System.out.printf("Age        : %d years%n", age);
        System.out.printf("Gender     : %c%n", gender);
        System.out.printf("Percentage : %.2f%%%n", percentage);
        scanner.close();
    }
}
package mypackage;
import java.util.Scanner;
public class TheAreaOfCircle 
{
 public static void main(String[] args) 
 {
     final double PI = 3.14159;
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter radius: ");
     double r = sc.nextDouble();
     System.out.println("Area: " + (PI * r * r));
     System.out.println("Circumference: " + (2 * PI * r));
 }
}
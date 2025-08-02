package mypackage;

import java.util.Scanner;
public class AverageOfThreeNumbers {
public static void main(String[] args)
{
	Scanner number= new Scanner(System.in);
	int a=number.nextInt();
	int b=number.nextInt();
	int c=number.nextInt();
	int d=(a+b+c)/3;
	System.out.println("The Average Of Three Numbers");
	System.out.println(d);
}
}
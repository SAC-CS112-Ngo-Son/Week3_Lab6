//Son Ngo

import java.util.Scanner;

public class Week3_Lab6
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		double num1, num2;
		
		System.out.print("Please enter the first number: ");
		num1 = input.nextDouble();
		System.out.print("Please enter the second number: ");
		num2 = input.nextDouble();
		System.out.printf("%f + %f = %f\n", num1, num2, num1 + num2);
		System.out.printf("%f - %f = %f\n", num1, num2, num1 - num2);
		System.out.printf("%f x %f = %f\n", num1, num2, num1 * num2);
		System.out.printf("%f / %f = %f\n", num1, num2, num1 / num2);
	}

}

//Program to calculate the product of three integers

import java.util.Scanner;

public class TwoPointFive{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	
	int x;

	int y;

	int z;

	int result;

	System.out.println("Enter the first integer:");
	x = input.nextInt();

	System.out.println("Enter the second integer:");
	y = input.nextInt();

	System.out.println("Enter the third integer:");
	z = input.nextInt();

	result = x * y * z;

	System.out.printf("Product is %d%n", result);

}
}
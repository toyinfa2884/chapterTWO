import java.util.Scanner;
public class TwoPointFifteen{

	public static void main(String[] args){

	Scanner fetch = new Scanner(System.in);

	int numb1;
	int numb2;

	int sum;
	int product;
	int difference;
	int quotient;

	System.out.print("Enter the first integer:");
	numb1 = fetch.nextInt();

	System.out.print("Enter the second integer:");
	numb2 = fetch.nextInt();

	sum= numb1 + numb2;
	product = numb1 * numb2;
	difference = numb1 - numb2;
	quotient = numb1 / numb2;
	
	System.out.printf("The sum of %d and %d is %d%n", numb1, numb2, numb1 + numb2);
	System.out.printf("The product of %d and %d is %d%n", numb1, numb2, numb1 * numb2);
	System.out.printf("The differnce between %d and %d is %d%n", numb1, numb2, numb1 - numb2);
	System.out.printf("The quotient of %d and %d is %d%n", numb1, numb2, numb1/numb2);
}
}
import java.util.Scanner;
	public class TwoPointTwentyFour{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	int num1;
	int num2;
	int num3;
	int num4;
	int num5;
	int largest;
	int smallest;

	System.out.println(" Enter the first integer:");
	num1 = input.nextInt();

	System.out.println("Enter the second integer:");
	num2 = input.nextInt();

	System.out.println("Enter the third integer:");
	num3 = input.nextInt();

	System.out.println("Enter the fourth integer:");
	num4 = input.nextInt();

	System.out.println("Enter the fifth integer:");
	num5 = input.nextInt();

	largest = num1;
	if(num2 > largest){
	largest = num2;
}
	if(num3 > largest){
	largest = num3;
}

	if(num4 > largest){
	largest = num4;
}
	if(num5 > largest){
	largest = num5;
}	
	smallest = num1;
	if(num2 < smallest){
	smallest = num2;
}
	if(num3 < smallest){
	smallest = num3;
}
	if(num4 < smallest){
	smallest = num4;
}
	if(num5 < smallest){
	smallest = num5;
}
	System.out.printf("Largest is %d\n", largest);
	System.out.printf("Smallest is %d\n", smallest);
}
}
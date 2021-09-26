import java.util.Scanner;
public class TwoPointSixteen{

	public static void main(String[] args){
	
	Scanner picker = new Scanner(System.in);
	
	int numberOne;
	int numberTwo;

	System.out.print("Enter first integer:");
	numberOne = picker.nextInt();

	System.out.print("Enter second integer:");
	numberTwo = picker.nextInt();

	if(numberOne > numberTwo){
	System.out.printf("%d is large than %d\n", numberOne, numberTwo);
}
	if(numberOne == numberTwo){
	System.out.println("These numbers are equal");

}
}
}
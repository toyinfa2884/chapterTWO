import java.util.Scanner;
	public class TwoPointTwentyFive{
	public static void main(String[] args){

	Scanner collector = new Scanner(System.in);

	int number;

	System.out.print("Enter a number:");
	number = collector.nextInt();

	if (number % 2 == 0){
	System.out.printf("%d is an even number", number);
}
	if(number %2 != 0){
	System.out.printf("%d is an odd number", number);
}
}
}
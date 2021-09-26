import java.util.Scanner;
	public class TwoPointSeventeen{

	public static void main(String[] args){

	Scanner fetcher = new Scanner(System.in);

	int firstNumb;
	int secondNumb;
	int thirdNumb;

	int sum;
	int average;
	int product;
	int smallestNumber;
	int largestNumber;

	System.out.print("Please enter your first integer:");
	firstNumb = fetcher.nextInt();

	System.out.print("Please enter your second integer:");
	secondNumb = fetcher.nextInt();

	System.out.print("Please enter your third integer:");
	thirdNumb = fetcher.nextInt();

	sum = firstNumb + secondNumb + thirdNumb;
	average = (firstNumb + secondNumb + thirdNumb) / 3;
	product = firstNumb * secondNumb * thirdNumb;
	
	smallestNumber = firstNumb;
	if(secondNumb < smallestNumber){
	smallestNumber = secondNumb;
}
	if(thirdNumb < smallestNumber){
	smallestNumber = thirdNumb;
}
	largestNumber = firstNumb;
	if(secondNumb > largestNumber){
	largestNumber = secondNumb;
}	
	if (thirdNumb > largestNumber){
	largestNumber = thirdNumb;
}
	System.out.printf("Sum is %d\n", sum);
	System.out.printf("Average is %d\n", average);
	System.out.printf("Product is %d\n", product);
	System.out.printf("SmallestNumber is %d\n", smallestNumber );
	System.out.printf("LargestNumber is %d\n", largestNumber);	
}
}
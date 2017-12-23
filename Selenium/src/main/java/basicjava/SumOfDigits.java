package basicjava;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Get input from user and store it in a variable using scanner.nextInt()

		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int inputNumber = scan.nextInt();
		int quotient,remainder,sumOfDigits =0;

		//Store the number in a temporary variable; inputNumber = originalNumber

		if(inputNumber < 0){
			inputNumber = inputNumber*(-1);
		}

		while(inputNumber > 0){
			quotient = inputNumber / 10;
			remainder = inputNumber % 10;
			sumOfDigits = sumOfDigits + remainder;
			inputNumber = quotient;
		} 

		System.out.println("The sum of digits is "+sumOfDigits);
		scan.close();

	}


}



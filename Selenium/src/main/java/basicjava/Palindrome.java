package basicjava;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		//Program to find whether the given input(number) is a palindrome or not

		//Get input from user and store it in a variable using scanner.nextInt()

		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int inputNumber = scan.nextInt();
		int quotient,remainder,originalNumber,reverseNumber=0;

		//Store the number in a temporary variable; inputNumber = originalNumber

		originalNumber = inputNumber;

		if(inputNumber < 0){
			inputNumber = inputNumber*(-1);
		}

		while(inputNumber > 0){
			quotient = inputNumber / 10;
			remainder = inputNumber % 10;
			reverseNumber = reverseNumber * 10 + remainder;
			inputNumber = quotient;
		} 

		//Compare the reverse number and original number and print the result

		if(reverseNumber == originalNumber){
			System.out.println("The given number "+originalNumber+" is a palindrome");
		}else{
			System.out.println("Given number is "+originalNumber+" not a palindrome");
		}

	
		System.out.print("Please enter a number: ");
		double inputNumber1 = scan.nextDouble();
		int quotient1,remainder1,originalNumber1,reverseNumber1=0;

		//Store the number in a temporary variable; inputNumber = originalNumber

		originalNumber1 = (int)inputNumber1;

		if(inputNumber1 < 0){
			inputNumber1 = inputNumber1*(-1);
		}

		while(inputNumber1 > 0){
			quotient1 = (int)inputNumber1 / 10;
			remainder1 = (int)inputNumber1 % 10;
			reverseNumber1 = reverseNumber1 * 10 + remainder1;
			inputNumber1 = quotient1;
		} 

		//Compare the reverse number and original number and print the result

		if(reverseNumber1 == originalNumber1){
			System.out.println("The given number "+originalNumber1+" is a palindrome");
		}else{
			System.out.println("Given number is "+originalNumber1+" not a palindrome");
		}
		
		scan.close();
        
		String input = "10 tea 20 coffee 30 cookies";
		Scanner scan1 = new Scanner(input).useDelimiter("//s");
		System.out.println(scan1.nextInt());
		scan1.close();
		
	}

}

package basicjava;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int inputNumber = scan.nextInt();
		int i;
		
		for(i=0;i<=10;i++) {
			
			System.out.println(i+" * "+inputNumber+" = "+(i*inputNumber));
			
		}
		
		scan.close();
		

	}

}

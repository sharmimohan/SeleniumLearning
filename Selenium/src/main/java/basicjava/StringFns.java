package basicjava;

import java.util.Scanner;

/** Pseudocode: String comparison
 * =============================		 
 *1. Declare four String objects
 *2. Write a method to compare string objects using == or String.equals() method
 *3. Print the results in console
 */

public class StringFns {


	public static void main(String[] args) {

		String str1="Testleaf Java";
		String str2="Testleaf Java";
		String str3 = new String("Testleaf Java");
		String str4= new String("testLeaf java");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter something........");
        String str5= scan.nextLine();
		StringFns.compareTwoStrings(str1,str2,str3,str4,str5);


	}

	public static void compareTwoStrings(String str1, String str2, String str3, String str4, String str5) {

		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println(str3==str5);
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str1.equalsIgnoreCase(str3));
		System.out.println(str1.equalsIgnoreCase(str4));
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareTo(str3));
		System.out.println(str1.compareTo(str4));
		System.out.println(str4.replace('t', 'T'));
		System.out.println(str1.charAt(2));
		System.out.println(str2.substring(0, 3));
		System.out.println(str3.length());
		System.out.println(str4.trim());
		System.out.println(str5.toUpperCase());
		System.out.println(str1.valueOf(1));

	}

}

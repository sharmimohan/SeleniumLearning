package basicjava;

public class RepeatingChars {

	public static void main(String[] args) {

		String input = "ABBAXXXSAASXABBAA";
		int length = input.length();
		char ch;
		int indexNo = 0,j=0, count =0;
		int[] indexes;

		/*for(int i=0;i<length;i++) {
			ch= input.charAt(i);
			if(ch=='A') {
				count++;
			}
			if(count == 3) {
				indexNo = i;
				break;
			}
		}*/

		for(int i=0;i<length;i++) {
			ch= input.charAt(i);
			if(ch=='A') {
				count++;


			}
		}
		System.out.println("No of A's in given string: "+count);
		indexes = new int[count];

		for(int i=0;i<length;i++) {
			ch= input.charAt(i);
			if(ch=='A') {
				indexes[j]=i;
				j++;
			}

		}
		int size = indexes.length;
		System.out.println(indexes[2]);

		/*if(size%2==0) {
			System.out.println(indexes[(size/2)-1]);
		}else {
			System.out.println(indexes[size/2]);
		}*/


			//System.out.println("Index of 3rd A in given string :"+indexNo);


		}

	}

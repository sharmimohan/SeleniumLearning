package basicjava;

public class ReverseString {

	public static void main(String[] args) {
		
		String input = "Leaf";
		int length = input.length();
		for(int i =length-1;i>=0;i--) {
			System.out.print(input.charAt(i));
		}
		
		System.out.println();
		char[] ch = input.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			System.out.print(ch[i]);
		}
		
		System.out.println();
		String revStr = "";
		for(int i=length-1;i>=0;i--) {
			revStr = revStr + input.charAt(i);
		}

		System.out.println(revStr);
		
		StringBuffer sb = new StringBuffer(input);
		System.out.println(sb.reverse());
	}

}

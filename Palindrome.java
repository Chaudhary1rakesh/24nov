
import java.util.Scanner;

public class Palindrome {
	
	public static String ReverseString(String str) {
		String result = "";
		char[] ch = str.toCharArray();
		for(int i = 0;i<ch.length;i++) {
			result = ch[i] + result;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = userinput.nextLine();
		
		String reverseString = ReverseString(str);
		
		if(str.equalsIgnoreCase(reverseString)) {
			System.out.println(" Palindrome");
		}
		else {
			System.out.println(" Not palindrome");
		}
		userinput.close();

	}

}
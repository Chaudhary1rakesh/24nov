import java.util.Scanner;

public class Reverse {
	
	public static String ReverseString(String str) {
		String result = "";
		char[] ch = str.toCharArray();
		for(int i = 0;i<ch.length;i++) {
			result = ch[i] + result;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = S.nextLine();
		
		System.out.println("After reverse String is : " + ReverseString(str));
		

	}

}
    


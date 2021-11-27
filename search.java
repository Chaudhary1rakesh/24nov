  
import java.util.Scanner;

public class search {

	public static void main(String[] args) {
		Scanner A = new Scanner(System.in);
		
		System.out.print("Enter the String : ");
		String str = A.nextLine();
		System.out.print("Enter the word you can find inside the string : ");
		String word = A.nextLine();
		boolean contains = str.contains(word);
		int index;
		if(contains) {
			index = str.indexOf(word);
			System.out.println("your entered word inside string and start index of " + index);
			
		}
		else {
			System.out.println("Not present");
		}

	}

}
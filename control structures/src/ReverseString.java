import java.util.InputMismatchException;
import java.util.Scanner;


public class ReverseString {

	public static void main(String[] args) {

		System.out.println("Enter the word to reverse!");
		Scanner input = new Scanner(System.in) ;
		String word = null ;
		try{
			word = input.nextLine() ;
		}catch (InputMismatchException e){
			System.out.println("Input expected is a string");
		}
		reverseAString(word) ;

	}

	public static void reverseAString( String word){
		int front = 0 ;
		int end = word.length() -1 ;
		int counter = front ;
		char temp  ;
		char temp1, temp2;
		while( front <= end){
			temp = word.charAt(front) ;
			temp1= word.charAt(end) ;
			temp2 = temp;
			front++;
			end--;
		}
		
	}
}

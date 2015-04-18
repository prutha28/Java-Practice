import java.util.InputMismatchException;
import java.util.Scanner;


public class ReverseNumber {

	public static void main(String[] args) {

		int number = 0 ;
		int numberOfDigits = 0 ;
		try{
			System.out.println("How many digit number!");
			Scanner input = new Scanner(System.in) ;
			numberOfDigits = input.nextInt() ;

			System.out.println("Enter the number to reverse!");
			input = new Scanner(System.in) ;
			number = input.nextInt() ;
			
		}catch (InputMismatchException e){
			System.out.println("Input expected is an integer");
		}
		reverseANumber(number) ;
	}

	private static void reverseANumber(int number) {


	}

}

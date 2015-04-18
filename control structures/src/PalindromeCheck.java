import java.util.Scanner;


public class PalindromeCheck {

	public static void main(String[] args){
		
		System.out.println("Enter a word to check!");
		Scanner input = new Scanner( System.in) ;
		if(isPalindrome(input.nextLine())){
			System.out.println("The word is a palindrome!");
		}else{
			System.out.println("The word is not a palindrome!");
		}
		
	}
	
	public static boolean isPalindrome( String word){
		
		boolean success = true ;
		int length = word.length() ;
		int front = 0 ; 
		int end = length -1 ;
		int counter = front ;
		
		while(front <= end && success){
			if(word.charAt(front)== word.charAt(end)){
				front++ ;
				end--;
				success = true ;
			}else{
				success = false;
			}
		}
		
		
		return success ;
	}
	
}

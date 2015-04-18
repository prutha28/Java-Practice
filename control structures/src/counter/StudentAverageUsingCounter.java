package counter;

import java.util.Scanner;

public class StudentAverageUsingCounter {

	private String courseName ;

	public StudentAverageUsingCounter(){
		super() ;
	}

	public StudentAverageUsingCounter( String courseName){
		this.courseName = courseName ;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public void displayMessage(String courseName){
		System.out.println("Welcome to " + courseName);
	}

	public void determineClassAverage(){
		int total ;
		int gradeValue ;
		float average ; 
		int gradeCounter ;
		Scanner input = new Scanner( System.in) ;

		total = 0;
		gradeCounter = 0 ;

		while( gradeCounter < 5 ){
			System.out.print("Enter grade : ");
			gradeValue = input.nextInt() ;
			total = total + gradeValue ;
			gradeCounter++;
		}

		if( gradeCounter != 0){
			average = ( float)total / gradeCounter ;
			System.out.println("The Average is %.2f " + average);
		}else{
			System.out.println("No grades were being input!");
		}
	}
}

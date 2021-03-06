package sentinel;

import java.util.Scanner;

public class StudentAverageUsingSentinelControl {

	private String courseName ;

	public StudentAverageUsingSentinelControl() {
		super();
	}
	
	public StudentAverageUsingSentinelControl(String courseName) {
		super();
		this.courseName = courseName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public void displayMessage( String courseName ){
		System.out.println("Welcome to " + courseName);
	}
	
	public void determineClassAverage(){
		
		int total ; // sum of all grades scored by students for a particular course.
		int gradeCounter ; // keeps a count of how many grades have been entered.
		int gradeValue ; // grade / marks scored by students for a particular course
		float average = 0 ;
		
		// Initializing the local variables.
		total = 0 ;
		gradeCounter = 0  ;
				
		System.out.println("Please Enter a grade , or -1 to stop :");
		Scanner input = new Scanner( System.in) ;
		gradeValue = input.nextInt() ;
		
		while( gradeValue != -1){
			total = total + gradeValue ;
			gradeCounter++ ;
			System.out.println("Please Enter a grade , or -1 to stop :");	
			gradeValue = input.nextInt() ;
		}
		
		if( gradeCounter != 0 ){
			System.out.println("No grades have been input! ");
		}else{
			average = (float)total /gradeCounter ;
			System.out.printf("The total of all the grades is %d\n and the average is %.2f", total, average);
		}
		 
	}
	
}

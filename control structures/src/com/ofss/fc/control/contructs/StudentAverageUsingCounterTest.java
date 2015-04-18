package com.ofss.fc.control.contructs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentAverageUsingCounterTest {

	public static void main( String[] args){


		System.out.println("Enter the Name of the Course for which you want to calculate average");
		Scanner input = new Scanner(System.in) ;
		try{
			System.out.println("Welcome to " + input.nextLine());
		}catch ( InputMismatchException e){
			System.out.println("Please Enter Valid Input, String Expected!");
		}finally{
			input.close() ;
		}

		determineAverageForCourse() ;
	}


	private static double determineAverageForCourse(){
		float averageOfGradesForCourse ;
		float totalOfGradesForCourse = 0 ;
		// Number of Grades entered for a subject == number of students in that course.
		int numberOfGrades ;
		int gradeCounter;

		// Initializing local variables. 
		averageOfGradesForCourse = 0 ;
		gradeCounter = 1 ;
		numberOfGrades = 10 ;
		totalOfGradesForCourse =  0 ;		

		System.out.printf("Enter the Grades scored for %d students: ", numberOfGrades );
		Scanner input = null ;
		try{
			input = new Scanner(System.in) ;
			float grade = 0 ;
			while ( gradeCounter <= numberOfGrades){
				System.out.println("Grade " + gradeCounter + ":");
				grade = input.nextFloat() ;
				totalOfGradesForCourse = totalOfGradesForCourse + grade ;
				gradeCounter++ ;
			}

		}catch ( InputMismatchException e){
			System.out.println("Please Enter Valid Input, Float Expected!");
		}
		averageOfGradesForCourse = totalOfGradesForCourse / numberOfGrades ; 

		return averageOfGradesForCourse ;
	}

}

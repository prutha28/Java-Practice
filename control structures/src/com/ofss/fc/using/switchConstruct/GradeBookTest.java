package com.ofss.fc.using.switchConstruct;

public class GradeBookTest {

	public static void main(String[] args) {

		GradeBook gradeBook = new GradeBook("CSC 001 Intro To Java Programming! ") ;
		gradeBook.displayWelcomeMessage() ;
		gradeBook.determineClassAverageForCourse() ;
		gradeBook.generateGradeReport() ;
	}

}

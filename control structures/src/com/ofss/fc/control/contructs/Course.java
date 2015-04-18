package com.ofss.fc.control.contructs;

public class Course {

	private String courseName ;
	private int courseNumber ;
	
	
	public Course( String courseName , int courseNumber){
		this.courseName = courseName ;
		this.courseNumber = courseNumber ;
	}
	
	
	
	private String getCourseName(){
		return courseName ;
	}
	

	public int getCourseNumber() {
		return courseNumber;
	}

	public void setCourseNumber(int courseNumber) {
		this.courseNumber = courseNumber;
	}
	
	private void setCourseName(String courseName){
		this.courseName = courseName ;
	}
}

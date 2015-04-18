package com.ofss.fc.control.contructs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Student {

	private String studentName ;
	private int studentId ;
	private Map<Course, Grade> scoreCard ;
	
	
	public Student( String studentName , int studentId, Map<Course, Grade> scoreCard){
		this.studentName = studentName ;
		this.studentId = studentId ;
		this.scoreCard = scoreCard ;
	}
	
	public Student(String studentName , int studentId) {
		this.studentName = studentName ;
		this.studentId = studentId ;
	}

	public String getStudentName(){
		return studentName ;
	}
	
	public Map<Course, Grade> getScoreCard() {
		return scoreCard;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public void setStudentName(String studentName){
		this.studentName = studentName ;
	}
	
	public void setScoreCard(Map<Course, Grade> scoreCard) {
		this.scoreCard = scoreCard;
	}

}

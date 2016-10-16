package com.cisc181.core;

import java.util.UUID;
import com.cisc181.eNums.eMajor;

public class Course {
	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	private eMajor Major;
	
public Course(String CourseName, eMajor Major) {
	this.CourseID = UUID.randomUUID();
	this.CourseName = CourseName;
	this.Major = Major;
}	
public UUID getCourseID() {
	return CourseID;
		
}






}

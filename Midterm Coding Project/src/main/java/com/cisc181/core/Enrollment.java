package com.cisc181.core;
import java.util.UUID;


public class Enrollment {
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	
	private Enrollment() {
	}

	public Enrollment(UUID SectionID, UUID StudentID) {
		this.EnrollmentID = UUID.randomUUID();
		this.SectionID = SectionID;
		this.StudentID = StudentID;

}

	public void setGrade(double Grade) {
		this.Grade = Grade;
}

	public double getGrade() {
		return Grade;
}

	public void setStudentID(UUID StudentID) {
		this.StudentID = StudentID;
	
}
	public UUID getStudentID() {
		return StudentID;
}

	public UUID getSectionID() {
		return SectionID;
}

	public void setSectionID(UUID SectionID) {
		this.SectionID = SectionID;
}

public UUID getEnrollmentID() {
	return EnrollmentID;
}

public void setEnrollmentID(UUID EnrollID) {
	this.EnrollmentID = EnrollID;
}

}

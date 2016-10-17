package com.cisc181.core;
import java.util.UUID;


public class Section {
	private UUID CourseID;
	private UUID SemesterID;
	private UUID SectionID;
	private int RoomID;
	
	public Section(){
	}
	
	public Section(UUID CourseID, UUID SemesterID, int RoomID){
		this.CourseID = CourseID;
		this.SemesterID = SemesterID;
		this.RoomID = RoomID;
		
	}
	public UUID getCourseID() {
		return CourseID;
	}
	
	public void setCourseID(UUID ID_Course) {
		this.CourseID = ID_Course;
	}
	
	public UUID getSemesterID() {
		return SemesterID;
		
	}
	
	public void setSemesterID(UUID ID_Semester) {
		SemesterID = ID_Semester;
	}
	
	public int getRoomID() {
		return RoomID;
	}
	
	public void setRoomID(int roomID) {
		RoomID = roomID;
	}
	
	}


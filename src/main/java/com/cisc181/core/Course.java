package com.cisc181.core;

import java.util.UUID;

import com.cisc181.eNums.eMajor;



public class Course extends Section{

	
	public String CourseName;
	public int GradePoint;
	
	
	public Course(UUID CourseID, UUID SemesterID, UUID SectionID, int RoomID, String CourseName, int GradePoint) {
		super(CourseID, SemesterID, SectionID, RoomID);
		this.CourseName = CourseName;
		this.GradePoint = GradePoint;

	}
	public UUID getCourseID() {
		return CourseID;
	}
	public void setCoureseID(UUID courseID) {
		CourseID = courseID;
	}
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	public int getGradePoint() {
		return GradePoint;
	}
	public void setGradePoint(int gradePoint) {
		GradePoint = gradePoint;
	}
	

	

}

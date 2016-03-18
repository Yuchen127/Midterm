package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

public class Semester extends Section{

	public Date StartDate;
	public Date EndDate;
	
	
	
	public Semester(UUID CourseID, UUID SemesterID, UUID SectionID, int RoomID, Date StartDate, Date EndDate) {
		super(CourseID, SemesterID, SectionID, RoomID);
		this.StartDate = StartDate;
		this.EndDate = EndDate;
	}
	
	public UUID getSemesterID() {
		return SemesterID;
	}
	public void setSemesterID(UUID semesterID) {
		SemesterID = semesterID;
	}
	public Date getStartDate() {
		return StartDate;
	}
	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}
	public Date getEndDate() {
		return EndDate;
	}
	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}




}

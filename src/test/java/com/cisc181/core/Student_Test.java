package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {

	@BeforeClass
	public static void setup() {
		ArrayList<Course> CourseRecord = new ArrayList<Course>();
		CourseRecord.add(new Course(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), 0, "MATH", 3));
		CourseRecord.add(new Course(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), 1, "ENGL", 3));
		CourseRecord.add(new Course(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), 2,"CISC", 3));
		
		ArrayList<Semester> SemesterRecord = new ArrayList<Semester>();
		SemesterRecord.add(new Semester(UUID.randomUUID(), Date(2016-09-02), Date(2016-12-18)));
		SemesterRecord.add(new Semester(UUID.randomUUID(), Date(2017-02-08), Date(2017-05-18)));
		
		ArrayList<Section> SectionRecord = new ArrayList<Section>();
		SectionRecord.add(new Section(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(),1));
		SectionRecord.add(new Section(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(),2));
		SectionRecord.add(new Section(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(),3));
		SectionRecord.add(new Section(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(),4));
		SectionRecord.add(new Section(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(),5));
		SectionRecord.add(new Section(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(),6));
		
		ArrayList<Student> StudentRecord = new ArrayList<Student>();
		StudentRecord.add(new Student("Aike", "A", "Ace", Date(1995-1-2), eMajor.BUSINESS,UUID.randomUUID(),
				"KOB 41 RD, Newark, DE", "(123)-456-7890", "Ace@udel.edu"));
		StudentRecord.add(new Student("bike", "A", "Ace", Date(1995-2-2), eMajor.PHYSICS,UUID.randomUUID(),
				"KOB 42 RD, Newark, DE", "(123)-456-7890", "Bce@udel.edu"));
		StudentRecord.add(new Student("Cike", "A", "Ace", Date(1995-3-2), eMajor.CHEM,UUID.randomUUID(),
				"KOB 43 RD, Newark, DE", "(123)-456-7890", "Cce@udel.edu"));
		StudentRecord.add(new Student("Dike", "A", "Ace", Date(1995-4-2), eMajor.NURSING,UUID.randomUUID(),
				"KOB 44 RD, Newark, DE", "(123)-456-7890", "Dce@udel.edu"));
		StudentRecord.add(new Student("Eike", "A", "Ace", Date(1995-5-2), eMajor.COMPSI,UUID.randomUUID(),
				"KOB 45 RD, Newark, DE", "(123)-456-7890", "Ece@udel.edu"));
		StudentRecord.add(new Student("Fike", "A", "Ace", Date(1995-6-2), eMajor.BUSINESS,UUID.randomUUID(),
				"KOB 46 RD, Newark, DE", "(123)-456-7890", "Fce@udel.edu"));
		StudentRecord.add(new Student("Gike", "A", "Ace", Date(1995-7-2), eMajor.CHEM,UUID.randomUUID(),
				"KOB 47 RD, Newark, DE", "(123)-456-7890", "Gce@udel.edu"));
		StudentRecord.add(new Student("Hike", "A", "Ace", Date(1995-8-2), eMajor.PHYSICS,UUID.randomUUID(),
				"KOB 48 RD, Newark, DE", "(123)-456-7890", "Hce@udel.edu"));
		StudentRecord.add(new Student("Iike", "A", "Ace", Date(1995-9-2), eMajor.COMPSI,UUID.randomUUID(),
				"KOB 49 RD, Newark, DE", "(123)-456-7890", "Ice@udel.edu"));
		StudentRecord.add(new Student("Jike", "A", "Ace", Date(1995-10-2), eMajor.NURSING,UUID.randomUUID(),
				"KOB 410 RD, Newark, DE", "(123)-456-7890", "Jce@udel.edu"));
		
		
	}

	@Test
	public void test() {
		assertEquals(1, 1);
	}
}
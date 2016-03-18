package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;
import java.util.Date;

import com.cisc181.eNums.eTitle;

import com.cisc181.core.Staff;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}
	
	@Test
	public void TestStaff() {
		ArrayList<Staff> StaffMember = new ArrayList<Staff>();
		StaffMember.add(new Staff("Aike", "A", "Ace", Date(1971-1-2), "KOB 44 RD, Newark, DE", 
				"(123)-456-7890", "Ace@udel.edu", "Monday 1p.m-2p.m", 4, 100000.00,
				Date.(2000-1-2), eTitle.MR ));
		StaffMember.add(new Staff("Bike", "B", "Bce", Date.(1971-1-2), "KOB 44 RD, Newark, DE", 
				"(123)-456-7891", "Bce@udel.edu", "Tueday 2p.m-3p.m", 4, 200000.00,
				Date.(2000-1-2), eTitle.MRS ));
		StaffMember.add(new Staff("Cike", "C", "Cce", Date.(1971-1-2), "KOB 44 RD, Newark, DE", 
				"(123890", "Cce@udel.edu", "Wednesday 3p.m-4p.m", 4, 300000.00,
				Date.(2000-1-2), eTitle.MS ));
		StaffMember.add(new Staff("Dike", "D", "Dce", Date.(1971-1-2), "KOB 44 RD, Newark, DE", 
				"(123)-456-789", "Dce@udel.edu", "Thurthyday 4p.m-5p.m", 4, 400000.00,
				Date.(2000-1-2), eTitle.MR ));
		StaffMember.add(new Staff("Eike", "E", "Ece", Date.(1971-1-2), "KOB 44 RD, Newark, DE", 
				"(3)-456-7890", "Ece@udel.edu", "Friday 5p.m-6p.m", 4, 500000.00,
				Date.(2000-1-2), eTitle.MRS ));
		
		double AvergaeSalary = (100000.00+200000.00+300000.00+400000.00+500000.00)/5;
		
		assertEquals(AvergaeSalary,300000.00);
	}	
	
	

}

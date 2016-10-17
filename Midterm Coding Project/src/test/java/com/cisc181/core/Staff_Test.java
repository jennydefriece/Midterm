package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.sql.Date;
import java.text.ParseException;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	static ArrayList<Staff> staff = new ArrayList<Staff>();

	public static Date date(int year, int month, int day) {
		Calendar calender = Calendar.getInstance();
		calender.set(year, month, day);
		return (Date) calender.getTime();
	}

	@BeforeClass
	public static void setup() throws ParseException {


		staff.add(new Staff("Jenny", "Joan", "Peters", date(1989, 4, 6), "Country Street", "(145)-584-9283",
				"Jenny@comcast.net", "9-11 TH", 3, 65000, date(2012, 2, 3), eTitle.MRS));

		staff.add(new Staff("Michael", "Pete", "Robinson", date(1966, 3, 12), "Dunkin Street", "(472)-392-7383",
				"MichaelP@yahoo.com", "2-4 F", 4, 28000, date(2014, 3, 18), eTitle.MR));

		staff.add(new Staff("Kirsten", "Hailey", "Smithe", date(1977, 9, 6), "Corner Road", "(483)-273-2933",
				"Kirsten@gmail.com", "1-2 W", 3, 52200, date(1969, 10, 10), eTitle.MRS));

		staff.add(new Staff("Sarah", "Ann", "Walker", date(1988, 1, 3), "Flower Street", "(382)-233-1222",
				"Sarah@yahoo.com", "6-7 M", 1, 45500, date(2012, 2, 4), eTitle.MRS));

		staff.add(new Staff("Matt", "Michael", "Short", date(1970, 9, 2), "White Street", "(394)-222-9333",
				"Matt@yahoo.com", "4-5 W", 3, 89000, date(2007, 1, 10), eTitle.MR));
	}

	@Test
	public void testStaffSalary() throws ParseException {
		double sum_Salary = 0;
		int count=0;
		for (Staff staff1 : staff) {
			sum_Salary += staff1.getSalary();
		}
		
		assertEquals(sum_Salary/count, 55940, .01);
	}

	@Test(expected = PersonException.class)
	public void testDOBException() throws PersonException {

		new Staff("Taylor", "Sara", "Coder", date(1905, 9, 29), "Renden Street", "(432)-636-6436",
				"goode@hotmail.com", "T 8:25-10:50am", 4, 49300, date(2004, 1, 12), eTitle.MRS);
	}

	@Test(expected = PersonException.class)
	public void testPhoneNumException() throws PersonException {
		new Staff("Reese", "Tane", "McDoland", date(1976, 7, 25), "Rankin Street", "412-356-5389",
				"wief@hotmail.com", "M 4:00-5:00pm", 3, 38000, date(2013, 5, 21), eTitle.MR);
	}
}
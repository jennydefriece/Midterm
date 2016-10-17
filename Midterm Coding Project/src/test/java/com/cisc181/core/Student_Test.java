package com.cisc181.core;

import static org.junit.Assert.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;
import com.cisc181.eNums.eTitle;
import java.text.ParseException;

public class Student_Test {

	public static Date Date(int year, int month, int day) {
		Calendar date = Calendar.getInstance();
		date.set(year, month - 1, day);
		return (java.sql.Date) date.getTime();
	}
	//ArrayLists
		static ArrayList<Student> list1 = new ArrayList<Student>();
		static ArrayList<Course> list2 = new ArrayList<Course>();
		static ArrayList<Semester> list3 = new ArrayList<Semester>();
		static ArrayList<Section> list4 = new ArrayList<Section>();

	
		public static void setup() throws PersonException {
	
		//adds 3 courses	
			Course HIST = new Course("History", eMajor.CHEM);
			Course ENGL = new Course("English", eMajor.NURSING);
			Course ART = new Course("Art", eMajor.PHYSICS);

			list2.add(HIST);
			list2.add(ENGL);
			list2.add(ART);
		
		}	
		
	
			}
		//Add students
		list1.add(new Staff("Jenny", "Joan", "Peters", date(1989, 4, 6), "Country Street", "(145)-584-9283",
				"Jenny@comcast.net", "9-11 TH", 3, 65000, date(2012, 2, 3), eTitle.MRS));

		list1.add(new Staff("Michael", "Pete", "Robinson", date(1966, 3, 12), "Dunkin Street", "(472)-392-7383",
				"MichaelP@yahoo.com", "2-4 F", 4, 28000, date(2014, 3, 18), eTitle.MR));

		list1.add(new Staff("Kirsten", "Hailey", "Smithe", date(1977, 9, 6), "Corner Road", "(483)-273-2933",
				"Kirsten@gmail.com", "1-2 W", 3, 52200, date(1969, 10, 10), eTitle.MRS));

		list1.add(new Staff("Sarah", "Ann", "Walker", date(1988, 1, 3), "Flower Street", "(382)-233-1222",
				"Sarah@yahoo.com", "6-7 M", 1, 45500, date(2012, 2, 4), eTitle.MRS));

		list1.add(new Staff("Matt", "Michael", "Short", date(1970, 9, 2), "White Street", "(394)-222-9333",
				"Matt@yahoo.com", "4-5 W", 3, 89000, date(2007, 1, 10), eTitle.MR));
		
}	
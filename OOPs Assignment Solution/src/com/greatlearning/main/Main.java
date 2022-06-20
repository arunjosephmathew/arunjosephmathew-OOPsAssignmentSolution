package com.greatlearning.main;

import com.greatlearning.service.AdminDepartment;
import com.greatlearning.service.HrDepartment;
import com.greatlearning.service.TechDepartment;

//The Main class which creates objects for AdminDepartment, HrDepartment,TechDepartment

public class Main {

	public static void main(String[] args) {
		
		AdminDepartment admindepartment = new AdminDepartment(null, null, null, null);
		admindepartment.departmentName();
		admindepartment.getTodaysWork();
		admindepartment.getWorkDeadline();
		admindepartment.isTodayAHoliday();
		
		System.out.println(" ");
		System.out.println(" ");
		
	    HrDepartment hrdepartment = new HrDepartment(null, null, null, null, null);
	    hrdepartment.departmentName();
	    hrdepartment.doActivity();
	    hrdepartment.getTodaysWork();
	    hrdepartment.getWorkDeadline();
	    hrdepartment.isTodayAHoliday();
		

		System.out.println(" ");
		System.out.println(" ");
		
		TechDepartment techdepartment = new TechDepartment(null, null, null, null, null);
		techdepartment.departmentName();
		techdepartment.getTodaysWork();
		techdepartment.getWorkDeadline();
		techdepartment.getTechStackInformation();
		techdepartment.isTodayAHoliday();
		
		
		

	}

}
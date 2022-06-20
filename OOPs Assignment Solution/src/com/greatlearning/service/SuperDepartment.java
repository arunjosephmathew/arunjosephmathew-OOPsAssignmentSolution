package com.greatlearning.service;

// Super Department Class will be Super Class to other departments and others must extend it.

public class SuperDepartment{
	
	public String departmentName ;
	public String getTodaysWork ;
	public String getWorkDeadline ;
	public String isTodayAHoliday ;
	
	public SuperDepartment(String a,String b,String c, String d){
		departmentName =a;
		getTodaysWork = b;
		getWorkDeadline = c;
		isTodayAHoliday = d;
	}
	
	public String departmentName() {
		System.out.println("Super Department");
		return  departmentName;
	}
	
	public String getTodaysWork() {
		System.out.println("No work as of now");
		return getTodaysWork;
	}
	
	public String getWorkDeadline() {
		System.out.println("Nil");
		return getWorkDeadline;
	}
	
	public String isTodayAHoliday() {
		System.out.println("Today is not a Holiday");
		return isTodayAHoliday;
	}
}

package com.greatlearning.service;

// Technical Department extending the Human Resource Department.

public class TechDepartment extends HrDepartment{
	
	public String getTechStackInformation;
	
	public TechDepartment(String a, String b, String c, String d,String e){
		
		super(a,b,c,d, e);
		
		getTechStackInformation =e;
	}
	
	public String departmentName() {
		System.out.println("Welcome to Tech Department");
		return departmentName;
	}
	
	public String getTodaysWork() {
		System.out.println("Complete coding of Module 1");
		return getTodaysWork;
	}
	
	public String getWorkDeadline() {
		System.out.println("Complete by EOD");
		return getWorkDeadline;
	}
	
	public String getTechStackInformation() {
		System.out.println("Core Java");
		return getTechStackInformation;
	}
}

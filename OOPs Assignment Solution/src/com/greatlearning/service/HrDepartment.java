package com.greatlearning.service;

// Human Resource Department extending the Administration Department.

public class HrDepartment extends AdminDepartment{
	
	public String doActivity;
	
	public HrDepartment(String a, String b, String c, String d,String e){
		
		super(a,b,c,d);
		
		doActivity = e;
	}
	
	public String departmentName() {
		System.out.println("Welcome to HR Department");
		return departmentName;
	}
	
	public String getTodaysWork() {
		System.out.println("Fill today's timesheet and mark your attendence");
		return getTodaysWork;
	}
	
	public String getWorkDeadline() {
		System.out.println("Complete by EOD");
		return getWorkDeadline;
	}
	
	public String doActivity() {
		System.out.println("team Lunch");
		return doActivity;
	}
}

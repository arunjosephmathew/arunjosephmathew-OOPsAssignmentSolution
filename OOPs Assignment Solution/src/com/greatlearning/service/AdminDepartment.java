package com.greatlearning.service;

// Administration Department extending the Super Department.

public class AdminDepartment extends SuperDepartment{
	
	
	public AdminDepartment(String a, String b, String c, String d){
		
		super(a,b,c,d);
		
	}
	
	public String departmentName() {
		System.out.println("Welcome to Admin department");
		return  departmentName;
	}
	
	public String getTodaysWork() {
		System.out.println("Complete your documents submission");
		return getTodaysWork;
	}
	
	public String getWorkDeadline() {
		System.out.println("Complete by EOD");
		return getWorkDeadline;
	}
	
}

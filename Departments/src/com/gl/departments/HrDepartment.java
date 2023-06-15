package com.gl.departments;

public class   HrDepartment extends SuperDepartment  {
	
	public String departmentName(){
		
		System.out.println();
   		System.out.println();
   		
		System.out.println("Welcome to HR Department");
		return "";
		}
	
	public String  getTodaysWork() {
		System.out.println("Fill today’s timesheet and mark your attendance");
		return "";		
	   }
	
	public String getWorkDeadline() {
		System.out.println("Complete by EOD");	
		return "";
	   }
	
	public String  doActivity() {
		System.out.println("team lunch");
		return "";
    }

}

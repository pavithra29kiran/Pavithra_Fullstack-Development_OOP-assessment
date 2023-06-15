package com.gl.departments;


public class AdminDepartment extends SuperDepartment{
	
   	public String departmentName(){
   		
   		//super.departmentName(); // With the help of super keyword we can print  SuperDepartment methods.  		
   		//super.getTodaysWork();
   		//super.getWorkDeadline();
   		//super.isTodayAHoliday();
   		
   		//System.out.println();
   		//System.out.println();
   		
		System.out.println("Welcome to Admin Department");
		return "";
		}
	
	public String getTodaysWork() {		
		System.out.println("Complete your documents Submission");
		return " ";
	   }
	
	public String getWorkDeadline() {	   
		System.out.println("Complete by EOD");
    	 return "";
}
}
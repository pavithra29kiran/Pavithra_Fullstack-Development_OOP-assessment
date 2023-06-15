package com.gl.departments;

public class DriverClass {	
		
 public static void main(String[] args) {
			
			AdminDepartment a= new AdminDepartment();
			
			HrDepartment b= new HrDepartment();
			
			TechDepartment c=new TechDepartment();
			
			 a.departmentName();
		     a.getTodaysWork();
		     a.getWorkDeadline();
			 a.isTodayAHoliday();
			 
			 b.departmentName();
			 b.doActivity();
		     b.getTodaysWork();
		     b.getWorkDeadline();		     
		     b.isTodayAHoliday();
			 
			 
			 c.departmentName();
		     c.getTodaysWork();
		     c.getWorkDeadline();
		     c.getTechStackInformation();
			 c.isTodayAHoliday();
			 
		}
	}




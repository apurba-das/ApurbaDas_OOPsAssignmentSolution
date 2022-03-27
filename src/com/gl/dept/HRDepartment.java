package com.gl.dept;

public class HRDepartment extends SuperDepartment{
	
	public String departmentName () {
		
		return "HR Department";
		
	}
	
	public String getTodaysWork () {
		
		return "Fill today’s timesheet and mark your attendance"; // as mentioned in expected output
		
	}
	
	public String getWorkDeadline () {
		
		return "Complete by EOD";
		
	}
	
	public String doActivity ( ) {
		
		return "team Lunch";
		
	}
}

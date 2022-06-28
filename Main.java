package com.gratlearning.gradedassessment1Revised;

public class Main {

public static void main(String[] args) {

//Objects created to pickup the AdminDepartment related output

AdminDepartment wela = new AdminDepartment();
wela.weladmin();

AdminDepartment adADGT = new AdminDepartment();
adADGT.getTodaysWork();

AdminDepartment adGWDL = new AdminDepartment();
adGWDL.getWorkDeadline();

//isTodayHoliday is not available in Admin department. But Admin department is extended class of Super Department.

AdminDepartment adTHDAY = new AdminDepartment();
adTHDAY.isTodayAHoliday();

//inserted a space between lines
System.out.println("\n");

//Objects created to pickup the HR Department related output
HrDepartment welh = new HrDepartment();
welh.welhr();

 HrDepartment hrDA = new HrDepartment();
 hrDA.doActivitye();
 
 HrDepartment hrGTW = new HrDepartment();
 hrGTW.getTodaysWork(); 

 HrDepartment hrGWD = new HrDepartment();
 hrGWD.getWorkDeadline();
 
 //isTodayHoliday is not available in HR department. But HR department is extended class of Super Department.
 HrDepartment hrTAH = new HrDepartment();
 hrTAH.isTodayAHoliday();

 //inserted a space between lines
 System.out.println("\n");

 //Objects created to pickup the Tech Department related output
 TechDepartment welt = new TechDepartment();
 welt.weltech();
  
 TechDepartment techGTW = new TechDepartment();
 techGTW.getTodaysWork();
 
 TechDepartment techGWDL = new TechDepartment();
 techGWDL.getWorkDeadline();
 
 TechDepartment techGTSI = new TechDepartment();
 techGTSI.getTechStackInformation();

 //isTodayHoliday is not available in TECH department. But Tech department is extended class of Super Department.
 TechDepartment tecTAH = new TechDepartment();
 tecTAH.isTodayAHoliday();
 
	}

}


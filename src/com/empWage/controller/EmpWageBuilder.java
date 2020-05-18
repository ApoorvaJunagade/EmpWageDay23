package com.empWage.controller; 
import com.empWage.model.Company; 

public class EmpWageBuilder{
	private Company company;
//	private Company2 company2;
	public EmpWageBuilder(){
		this.company=new Company();
		company.setWage(20);
		company.setNoOfWorkingDays(20);
		company.setWorkingHoursPerMonth(100);
		company.setName("Trishna");

	}
	public int Random(){
		int attendance=(int)Math.floor(Math.random()*10%2);
		return attendance;
	}
	
	public void empWage(){
		System.out.println("company name:"+company.getName());
		int totalDays=company.getNoOfWorkingDays();
		int totalHours=company.getWorkingHoursPerMonth();
		int days=0;
		int hours=0;
		System.out.println("employee id:"+company.getId());
		while(days<totalDays || hours<totalHours){
		days++;
		
			if(Random()==1){
				hours+=4;
				int employeeWage=company.getWage()*hours;
				System.out.println("total days:"+days+" hours worked:"+hours+" employeeWage="+employeeWage);
			}
			else{
			System.out.println("employee is absent");
			}
		}

	}
	
}

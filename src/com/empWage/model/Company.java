package com.empWage.model;
import com.empWage.model.Employee;
public class Company{
	private String name;
	private int wage, noOfWorkingDays, workingHoursPerMonth;
 	private Employee employee;
		public String getName(){
			return name;
		}
		public int getWage(){
			return wage;
		}
		public int getNoOfWorkingDays(){
			return noOfWorkingDays;
		}
		public int getWorkingHoursPerMonth(){
			return workingHoursPerMonth;
		}
		public void setName(String name){
			this.name=name;
		}
		public void setWage(int Wage){
			this.wage=Wage;
		}
		public void setNoOfWorkingDays(int NoOfWorkingDays){
			this.noOfWorkingDays=NoOfWorkingDays;
		}
		public void setWorkingHoursPerMonth(int WorkingHoursPerMonth){
			this.workingHoursPerMonth=WorkingHoursPerMonth;
		}
		public Company(){
		this.employee =new Employee();
		employee.setId(1);
		employee.setName("John");
		}
	public int getId(){
		return employee.getId();
	}
}

	

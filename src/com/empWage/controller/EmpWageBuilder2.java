package com.empWage.controller;
import com.empWage.model.Company2;

public class EmpWageBuilder2{
        private Company2 company2;
        public EmpWageBuilder2(){
                this.company2=new Company2();
                company2.setWage(30);
                company2.setNoOfWorkingDays(21);
                company2.setWorkingHoursPerMonth(80);
		company2.setName("Pearson");

        }
        public int Random(){
                int attendance=(int)Math.floor(Math.random()*10%2);
                return attendance;
        }

        public void empWage(){
		System.out.println("company name:"+company2.getName());
                int totalDays=company2.getNoOfWorkingDays();
                int totalHours=company2.getWorkingHoursPerMonth();
                int days=0;
                int hours=0;
                System.out.println("employee id:"+company2.getId());
                while(days<totalDays || hours<totalHours){
                days++;

                        if(Random()==1){
                                hours+=6;
                                int employeeWage=company2.getWage()*hours;
                                System.out.println("total days:"+days+" hours worked:"+hours+" employeeWage="+employeeWage);
                        }
                        else{
                        System.out.println("employee is absent");
                        }
                }

        }

}


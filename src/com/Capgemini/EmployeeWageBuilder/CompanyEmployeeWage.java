package com.Capgemini.EmployeeWageBuilder;

public class CompanyEmployeeWage {

	 String companyName;
	 final int empWage_per_hour;
	 final int max_working_days;
	 final int max_hours_of_work;
	 int totalEmployeeWage;
	 int no_of_work_days; //for printing no. of work days

	public void setNo_of_work_days(int no_of_work_days) {
		this.no_of_work_days = no_of_work_days;
	}

	public void setTotalEmployeeWage(int totalEmployeeWage) {
		this.totalEmployeeWage = totalEmployeeWage;
	}

	public CompanyEmployeeWage(String companyName, int empWage_per_hour, int max_working_days, int max_hours_of_work) {
		super();
		this.companyName = companyName;
		this.empWage_per_hour = empWage_per_hour;
		this.max_working_days = max_working_days;
		this.max_hours_of_work = max_hours_of_work;
	}
	
	@Override
	public String toString()
	{
		return "Total Employee Wage of "+ companyName+ " for "+no_of_work_days+" days is :"+ totalEmployeeWage;
	}
}
/*-----*/
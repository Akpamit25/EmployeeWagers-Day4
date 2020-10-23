package com.Capgemini.EmployeeWageBuilder;

public class CompanyEmployeeWage {

	 String companyName;
	 final int empWage_per_hour;
	 final int max_working_days;
	 final int max_hours_of_work;

	public CompanyEmployeeWage(String companyName, int empWage_per_hour, int max_working_days, int max_hours_of_work) {
		super();
		this.companyName = companyName;
		this.empWage_per_hour = empWage_per_hour;
		this.max_working_days = max_working_days;
		this.max_hours_of_work = max_hours_of_work;
	}
}

package service;

import com.Capgemini.EmployeeWageBuilder.CompanyEmployeeWage;

public interface EmployeeWageInterface {
	public void addCompanyEmployeeWage(String companyName, int empWage_per_hour, int max_working_days,int max_hours_of_work);
	 void computeEmpWage();
	 int computeEmpWage(CompanyEmployeeWage compArr);
}

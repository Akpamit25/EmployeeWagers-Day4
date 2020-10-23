package com.Capgemini.EmployeeWageBuilder;

import service.EmployeeWageInterface;
import java.util.*;
public class EmployeeWage implements EmployeeWageInterface{

	//CompanyEmployeeWage compArr[] = new CompanyEmployeeWage[2];
	List<CompanyEmployeeWage> compArr = new ArrayList<CompanyEmployeeWage>();
	private int numOfCompany = 0;
	int day = 1;

	public static void main(String[] args) {
		EmployeeWage empWage = new EmployeeWage();
		empWage.addCompanyEmployeeWage("Vmart", 22, 21, 100);
		empWage.addCompanyEmployeeWage("Reliance", 25, 25, 130);
		empWage.computeEmpWage();

	}

	public void addCompanyEmployeeWage(String companyName, int empWage_per_hour, int max_working_days,int max_hours_of_work) {
		compArr.add(new CompanyEmployeeWage(companyName, empWage_per_hour, max_working_days,max_hours_of_work));
		numOfCompany++;
	}

	public void computeEmpWage() {
		for (int i = 0; i < compArr.size(); i++) {
			System.out.println("******************  Details Of " + compArr.get(i).companyName+ " Starts From Here  ******************\n\n");
			int totalEmployeeWage = this.computeEmpWage(compArr.get(i));
			compArr.get(i).setTotalEmployeeWage(totalEmployeeWage);
			compArr.get(i).setNo_of_work_days(day-1);
			System.out.println(compArr.get(i));
			System.out.println("\n******************  Details Of " + compArr.get(i).companyName+ " Ends Here  ******************\n\n\n");
		}
	}

	public int computeEmpWage(CompanyEmployeeWage compArr) {
		int empHour = 0, totalWorkingHour = 0;
		for (day = 1; day <= compArr.max_working_days; day++) {
			if (totalWorkingHour <= compArr.max_hours_of_work) {
				int x = (int) (Math.random() * 3);
				switch (x) { // Using Switch Case
				case 0:
					System.out.print("Day No. " + day + ", ");
					System.out.print("Employee Is Absent");
					empHour = 0;
					break;

				case 1:
					System.out.print("Day No. " + day + ", ");
					System.out.print("Employee Is Present");
					empHour = 8;
					break;

				case 2:
					System.out.print("Day No. " + day + ", ");
					System.out.print("Part-Time Work");
					empHour = 4;
					break;
				}

				totalWorkingHour += empHour;
				System.out.print("\nDay " + day + " Employee Hour = " + empHour + ", " + "Total Working Hour Till Day "	+ day + " =" + totalWorkingHour + "\n\n");
			}
		}
		return totalWorkingHour * compArr.empWage_per_hour;
	}
}
package com.Capgemini.EmployeeWageBuilder;

public class EmployeeWage {

	private String companyName;
	private final int empWage_per_hour;
	private final int max_working_days;
	private final int max_hours_of_work;

	public EmployeeWage(String companyName, int empWage_per_hour, int max_working_days, int max_hours_of_work) {
		super();
		this.companyName = companyName;
		this.empWage_per_hour = empWage_per_hour;
		this.max_working_days = max_working_days;
		this.max_hours_of_work = max_hours_of_work;
	}

	public static void main(String[] args) {
		EmployeeWage Reliance = new EmployeeWage("Reliance", 20, 20, 100);
		Reliance.checkEmployee();
		EmployeeWage Vmart = new EmployeeWage("Vmart", 22, 18, 50);
		Vmart.checkEmployee();
	}

	public void checkEmployee() {
		int empHour = 0;
		int totalEmployeeWage = 0;
		int totalWorkingHour = 0;
		System.out.println(
				"******************  Details Of " + this.companyName + " Starts From Here  ******************\n\n");

		for (int day = 1; day <= max_working_days; day++) {
			if (totalWorkingHour <= max_hours_of_work) {
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
				System.out.print("\nDay " + day + " Employee Hour = " + empHour + ", " + "Total Working Hour Till Day "
						+ day + " =" + totalWorkingHour + "\n\n");
				int wage = empHour * empWage_per_hour;
				totalEmployeeWage += wage;
			}
		}
		System.out.println("\n Total Monthly Employee Wage For " + this.companyName + "=" + totalEmployeeWage);
		System.out.println(" Total Monthly Working Hour For " + this.companyName + "=" + totalWorkingHour + "\n\n");
		System.out
				.println("******************  Details Of " + this.companyName + " Ends Here  ******************\n\n\n");

	}
}

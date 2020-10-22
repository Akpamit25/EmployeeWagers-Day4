
package com.Capgemini.EmployeeWageBuilder;

public class EmployeeWage {
	public static int empWage_per_hour = 20;
	public static int max_working_days = 20;
	public static int max_hours_of_work = 100;
static int count = 1;
	public static int totalEmployeeWage = 0;
	public static int totalWorkingHour = 0;

	public static void main(String[] args) {

		checkEmployee(); // checks whether employee is present or not
		System.out.println("\n Total Employee Wage = " + totalEmployeeWage);
		System.out.println("\n Total Working Hour : " + totalWorkingHour);
	}

	public static void checkEmployee() {
		int empHour = 0;
		for (int day = 1; day <= max_working_days; day++) {
			if (totalWorkingHour <= max_hours_of_work) {
				int x = (int) (Math.random() * 3);
				switch (x) { // Using Switch Case
				case 0:
					System.out.print("Day No. "+day+", ");
					System.out.print("Employee Is Absent");
					empHour = 0;
					dailyEmployeeWage(empHour);
					break;

				case 1:
					System.out.print("Day No. "+day+", ");
					System.out.print("Employee Is Present");
					empHour = 8;
					dailyEmployeeWage(empHour);
					break;

				case 2:
					System.out.print("Day No. "+day+", ");
					System.out.print("Part-Time Work");
					empHour = 4;
					dailyEmployeeWage(empHour);
					break;

				}
			}
		}
	}

	public static void dailyEmployeeWage(int hour) {
		totalWorkingHour += hour;
		System.out.print("\nDay "+count+" Employee Hour = " +hour+", "+"Total Working Hour Till Day "+count+" ="+ totalWorkingHour +"\n\n");
		int wage = hour * empWage_per_hour;
		totalEmployeeWage += wage;
		count++;

	}

}

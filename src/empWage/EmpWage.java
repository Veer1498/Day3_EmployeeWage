package empWage;
/**
 * 
 * @author Veer.singa
 *
 */

//Class EmpWage
public class EmpWage {
	public static final int employeePresent = 1;
	public static final int employeePartTime = 2;
	public static final int WagePerHour = 20;
	public static final int NumberOfWorkingDays =20;
	public static final int TotalHoursinMonth = 100;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		System.out.println("*********************************************\n");
		int numberOfHours = 0;
		int empWagePerDay = 0,nHours=0;
		int totalWorkDays = 0 , totalWorkHours = 0;
		int totalEmployeeWage =0;
		while (totalWorkHours< TotalHoursinMonth && totalWorkDays < NumberOfWorkingDays) {
		//totalWorkDays++;
			int isPresent = (int) Math.floor(Math.random()*10) %3;
			switch (isPresent) {
				case employeePresent :
					numberOfHours =8;
					totalWorkHours =totalWorkHours + numberOfHours;
					System.out.println("Employee is Present");
					System.out.println("Employee earn = " + numberOfHours * WagePerHour);
					totalWorkDays++;
					nHours+=numberOfHours;
					break;
					
				case employeePartTime :
					numberOfHours =4;
					totalWorkHours =totalWorkHours + numberOfHours;
					System.out.println("Employee is Part Time Present");
					System.out.println("Employee earn with PartTime= " + numberOfHours* WagePerHour);
					totalWorkDays++;
					nHours+=numberOfHours;
					break;
	
				default :
					numberOfHours = 0;
					totalWorkHours =totalWorkHours + numberOfHours;
					System.out.println("Employee is Absent");
					System.out.println("Employee earn = 0");
					break;
					}
		}
		
		System.out.println("\ndays  = " + totalWorkDays + " No. of Hours = " +nHours);
		System.out.println(	"\nEmployee Monthly Earn for Max"
				+ " Days or Hours = " + ((numberOfHours) * WagePerHour) * NumberOfWorkingDays);
		
		totalEmployeeWage= totalWorkHours * WagePerHour;
		System.out.println("\nTotal Employee Wage without Condition is "+ totalEmployeeWage);
	}


}

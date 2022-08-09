package empWage;
/**
 * EmployeeWage Program
 * @author Veer.Singa
 *
 */

// Class Method
public class EmployeeWageMethod {
	/*
	 * Created Separate Class named EmpwageMethod
	 * Assigned some instance variables with public static final to Use Anywhere.
	 * I used Final because those variables never change its value.
	 * Because we are going to use them in methods
	 * Created a Function Welcome with print statement
	 * Created another function Method and did all the computation Required.
	 * For Computation, Took a WHILE loop and a Random Variable
	 * A SWITCH CASE created for separating Present or absent or PartTime
	 * Finally Computed TotalEmployee of Wage for Max Working Hours or Days
	 *  
	 */
	public static final int employeePresent = 1;
	public static final int employeePartTime = 2;
	public static final int WagePerHour = 20;
	public static final int NumberOfWorkingDays =20;
	public static final int TotalHoursinMonth = 100;
	
	static int numberOfHours;
	static int totalWorkHours;
	static int totalWorkDays;
	static int nHours;
	
	//Welcome Function
	public void Welcome() {
		System.out.println("Welcome to Employee Wage Computation Program");
		System.out.println("*********************************************\n");
	}
	
	//EmpWageMethod Function
	public void EmpWageMethod() {
		while (totalWorkHours < TotalHoursinMonth && totalWorkDays < NumberOfWorkingDays) {
			int isPresent = (int) Math.floor(Math.random()*10) %3;
			switch (isPresent) {
				case employeePresent :
					numberOfHours =8;
					totalWorkHours =totalWorkHours + numberOfHours;
					totalWorkDays++;
					System.out.println("Day "+totalWorkDays);
					System.out.println("Employee is Present");
					System.out.println("Employee earn = " + numberOfHours * WagePerHour);
					nHours+=numberOfHours;
					break;
					
				case employeePartTime :
					numberOfHours =4;
					totalWorkHours =totalWorkHours + numberOfHours;
					totalWorkDays++;
					System.out.println("Day "+totalWorkDays);
					System.out.println("Employee is Part Time Present");
					System.out.println("Employee earn with PartTime= " + numberOfHours* WagePerHour);
					nHours+=numberOfHours;
					break;

				default :
					numberOfHours = 0;
					totalWorkDays++;
					System.out.println("Day "+totalWorkDays);
					System.out.println("Employee is Absent");
					System.out.println("Employee earn = 0");
					break;
			}
			System.out.println(" ");
		}
		
		System.out.println("\ndays  = " + totalWorkDays + "| Num of Hours = " +nHours);
		System.out.println(	"\nEmployee Monthly Earn for Max"
				+ " Days or Hours = Rs." + (nHours * WagePerHour));
		
	
	}
}

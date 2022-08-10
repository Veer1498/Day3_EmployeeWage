package empWage;
/**
 * EmployeeWage Program
 * @author Veer.Singa
 *
 */

import java.util.Scanner;

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
	public Scanner sc = new Scanner(System.in);
	public static final int employeePresent = 1;
	public static final int employeePartTime = 2;
	
	public String companyName;
	public int WagePerHour;
	public int NumberOfWorkingDays;
	public int TotalHoursinMonth;
	
	public int numberOfHours;
	public int totalWorkHours;
	public int totalWorkDays;
	public int nHours;
	public int totalWage;
	static int n;
	
	static int arr1[] = new int [5];
	static String arr2[] = new String [5];

	
	//Welcome Function
	public void welcome() {
		System.out.println("Welcome to Employee Wage Computation Program");
		System.out.println("*********************************************\n");
	}
	//company Function
	public void company() {
		System.out.println("Please Enter Company Name");
		companyName = sc.next();
		System.out.println("Please Enter Wage per Hour of "+companyName);
		WagePerHour = sc.nextInt();
		System.out.println("Please Enter Number of Working Days of "+companyName);
		NumberOfWorkingDays = sc.nextInt();
		System.out.println("Please Enter Max Number of Hours in Month of "+companyName);
		TotalHoursinMonth = sc.nextInt();
	}
	
	//EmpWageMethod Function
	public void empWageMethod() {
		System.out.println("Please Enter Num of Companies you want to Enter");
		n = sc.nextInt();
		for(int i = 0; i <= n-1; i++) {
			System.out.println("\nCompany "+(i+1));
			company(); // Called Company Method.
			while (totalWorkHours < TotalHoursinMonth && totalWorkDays < NumberOfWorkingDays) {
				int isPresent = (int) Math.floor(Math.random()*10) %3;
				switch (isPresent) {
					case employeePresent :
						numberOfHours =8;
						totalWorkHours =totalWorkHours + numberOfHours;
						totalWorkDays++;
						nHours+=numberOfHours;
						break;
						
					case employeePartTime :
						numberOfHours =4;
						totalWorkHours =totalWorkHours + numberOfHours;
						totalWorkDays++;
						nHours+=numberOfHours;
						break;

					default :
						numberOfHours = 0;
						totalWorkDays++;
					break;
				}
			}
			int totalWage = nHours * WagePerHour;
			arr1[i] = totalWage;
			arr2[i] = companyName;
		}
		System.out.println("\nTOTAL WAGES ");
		System.out.println("============\n");
		for(int i = 0; i <= n-1; i++) {
			System.out.println(arr2[i]+" = Rs."+arr1[i]);
		}
	}
	
	
}

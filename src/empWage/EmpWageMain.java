package empWage;

/**
 * Employee Wage Main function
 * @author Veer.singa
 *
 */

//Class EmpWage
public class EmpWageMain {
	/*
	 * Created a Class EmpWageMain.
	 * Created a function Main.
	 * Created a New Object - empObject.
	 * Call the Required Functions using new Object name.
	 * Here, welcome and Method Functions were Called.
	 */
	public static final int employeePresent = 1;
	public static final int employeePartTime = 2;
	
	private int numOfCompany = 0;
	private EmployeeWageCompany[] companyArray;
	
	public EmpWageMain() {
		companyArray = new EmployeeWageCompany[3];
	}
	public static void main(String[] args) {
		
			EmpWageMain empwage =new EmpWageMain();
			empwage.Welcome();
			System.out.println("");
			empwage.addCompany("Amazon",32, 20,100);
			empwage.addCompany("FlipKart",24, 20,100);
			empwage.computeWage();
	}
	
	//Add Company Function 
	private void addCompany(String Company, int WagePerHour, int NumberOfWorkingDays, int TotalHoursinMonth) {
		companyArray [numOfCompany] = new EmployeeWageCompany(Company, WagePerHour, NumberOfWorkingDays, TotalHoursinMonth);
		numOfCompany++;
	}
	
	//Welcome Function for Message
	public void  Welcome() {
		System.out.println("Welcome to Employee Wage Computation program");
	}
	
	//Computation function for all companies
	private void computeWage() {
		for (int i=0; i< numOfCompany; i++) {
			companyArray[i].setTotalWage(compute(companyArray[i]));
			System.out.println(companyArray[i]);
		}
	}
	
	//Compute function to calculate wages.
	public static int compute(EmployeeWageCompany EmployeeWageCompany) {
		 int numberOfHours = 0;
		 int nHours=0;
	     int totalWorkDays = 0;
	     int totalWorkHours = 0;
		 int totalEmployeeWage =0;
		 
		 while (totalWorkHours< EmployeeWageCompany.getTotalHoursinMonth() && totalWorkDays < EmployeeWageCompany.getNumberOfWorkingDays()) {
				int isPresent = (int) Math.floor(Math.random()*10) %3;
				switch (isPresent) {
					case employeePresent :
						numberOfHours =8;
						totalWorkHours =totalWorkHours + numberOfHours;
						totalWorkDays++;
						nHours+=numberOfHours;
						break;
					case employeePartTime :
						numberOfHours = 4;
						totalWorkHours = totalWorkHours + numberOfHours;
						totalWorkDays++;
						nHours += numberOfHours;
						break;

					default :
						numberOfHours = 0;
						totalWorkDays++;
						break;
						}

				}
				System.out.println("");
			    return totalWorkHours * EmployeeWageCompany.getWagePerHour();
	}


}

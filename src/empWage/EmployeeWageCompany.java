package empWage;
/**
 * EmployeeWage Program 
 * @author Veer.Singa
 *
 */


// Class Method
public class EmployeeWageCompany {
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
		
	private String Company;
	private int WagePerHour;
	private int NumberOfWorkingDays;
	private int TotalHoursinMonth;
	private int totalWage;
	
	public  EmployeeWageCompany(String Company, int WagePerHour, int NumberOfWorkingDays, int TotalHoursinMonth) {
	
		this.Company = Company;
		this.WagePerHour = WagePerHour;
		this.NumberOfWorkingDays = NumberOfWorkingDays;
		this.TotalHoursinMonth = TotalHoursinMonth;
		
	}
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	public int getWagePerHour() {
		return WagePerHour;
	}
	public void setWagePerHour(int wagePerHour) {
		WagePerHour = wagePerHour;
	}
	public int getNumberOfWorkingDays() {
		return NumberOfWorkingDays;
	}
	public void setNumberOfWorkingDays(int numberOfWorkingDays) {
		NumberOfWorkingDays = numberOfWorkingDays;
	}
	public int getTotalHoursinMonth() {
		return TotalHoursinMonth;
	}
	public void setTotalHoursinMonth(int totalHoursinMonth) {
		TotalHoursinMonth = totalHoursinMonth;
	}
	public void setTotalWage(int totalWage) {
		this.totalWage = totalWage;
	}
	@Override
	public String toString() {
		return "[Company= " + Company + ", WagePerHour= " + WagePerHour + ", NumberOfWorkingDays= "
				+ NumberOfWorkingDays + ", TotalHoursinMonth= " + TotalHoursinMonth + ", totalWage= " + totalWage
				+"]";
		
	}
		
	
	
}

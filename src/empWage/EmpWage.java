package empWage;
/**
 * 
 * @author Veer.singa
 *
 */

//Class EmpWage
public class EmpWage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Employee Wage Program");
		System.out.println("********************************\n");
		int employeePresent = 1;
		int employeePartTime = 2;
		int wagePerHour = 20;
		int numberOfHours = 8;
		int partTimeHours = 4;
		int isPresent = (int) Math.floor(Math.random() * 10) % 3;
		if (isPresent == employeePresent) {
			System.out.println("Employee is Present : P");
			System.out.println("Employee earn = " + numberOfHours * wagePerHour);
		} 
		else if (isPresent == employeePartTime) {
			System.out.println("Employee is Part Time Present : (1/2) P");
			System.out.println("Employee earn with PartTime = " +partTimeHours * wagePerHour);
			}
		else {
			System.out.println("Employee is Absent  : A");
			System.out.println("Employee earn = 0");
		}
	}

}

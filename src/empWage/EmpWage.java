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
		
		int wagePerHour = 20;
		int numberOfHours = 8;
		int partTimeHours = 4;
		int workingDays = 20;
		int isPresent = (int) Math.floor(Math.random() * 10) % 3;
		switch (isPresent) {
		case 1 :
			System.out.println("Employee is Present : P");
			System.out.println("Employee earn per Day = " + numberOfHours * wagePerHour);
			System.out.println("Employee Monthly Earn = " + (numberOfHours * wagePerHour) * workingDays);
			break;
		case 2 :
			System.out.println("Employee is Part Time Present : (1/2) P");
			System.out.println("Employee earn PartTime per Day = " +partTimeHours * wagePerHour);
			System.out.println("Employee Monthly Earn          = " + (partTimeHours * wagePerHour) * workingDays);
			break;
		case 0 :
			System.out.println("Employee is Absent  : A");
			System.out.println("Employee earn = 0");
			break;
		}
	}

}

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
		int isPresent =(int) Math.floor(Math.random()*10) % 2;
		if ( isPresent == employeePresent)
			System.out.println("Employee is Present : P");
		else
			System.out.println("Employee is Absent  : A");

	}

}

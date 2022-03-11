import java.util.Scanner;

public class Employee {
    private String FirstName;
    private String LastName;
    private int Age;
    private double Salary;
    Scanner scan= new Scanner(System.in);
    public Employee() {
	System.out.print("Please input the employee's first name:");
	scanFirst();
	System.out.print("Please input the employee's last name:");
	scanLast();
	System.out.print("Please input the employee's age:");
	scanAge();
	System.out.print("Please input the employee's monthly salary:");
	scanSalary();

    }
	private void scanFirst(){
	FirstName=scan.nextLine();
	}
	
	private void scanLast(){
	LastName=scan.nextLine();
	}
	private void scanAge(){
	Age=Integer.parseInt(scan.nextLine());
	}
	private void scanSalary(){
	Salary=Double.parseDouble(scan.nextLine()); // using the wrapper class fixes the scan.nextLine problem while looping
	}
	private String First(){
	return FirstName;
	}
	private String Last(){
	return LastName;
	}
	private int Age(){
	return Age;
	}
	private Double Salary(){
	return Salary;
	}

	public String toString() {
	return First()+" "+Last()+","+Age()+","+Salary();
	}
}
import java.util.Scanner;

class Employee{
	public static void main(String[] args){
		String firstname;
		String lastname;
		double salary;
		String grade;
		String date;
		//String process;
		//char process;
		int i=1,j,z=i,p;
		for (i=1; i<100000; i++){
			Scanner input = new Scanner(System.in);
			System.out.println("Enter First name of employee");
			firstname = input.next();
			System.out.println("Enter last name of employee");
			lastname = input.next();
			System.out.println("Enter salary of employee");
			salary = input.nextFloat();
			System.out.println("Enter Grade of employee");
			grade = input.next();
			System.out.println("Enter Date of joining of employee");
			date = input.next();
			System.out.println("First name  :"+firstname);
			System.out.println("Last name   :"+lastname);
			System.out.println("Employee-ID :"+z);
			System.out.println("Salary      :"+salary);
			System.out.println("Grade       :"+grade);
			System.out.println("Date        :"+date);
			//Date date = new Date();  
			//SimpleDateFormat formatter = new SimpleDateFormat ("MMM/yyyy");  
			//String strdate= formatter.format(date);  
			//System.out.println(strDate);  
			//SimpleDateFormat df = new SimpleDateFormat("MMM-yyyy");
			//SimpleDateFormat ft1 = new SimpleDateFormat ("dd/MM/yyyy");
			System.out.println("CONTINUE to enter other employee details(1)/EXIT(0)");
			p = input.nextInt();
			if (p == 1){
				z=i+1;
			}
			else
			{
				System.out.println("Thankyou");
			}
			//z++;
			//System.out.println("CONTINUE to enter other employee details(C)/EXIT(E)");
			//process = input.next();
			//if(process="C"){
			//	z=i+1;
		}
	}
}
import java.io.*;
import java.util.*;
public class class1
{
    
    public static void main(String[] args)
	{
    empdir emp = null;
    Scanner scan = new Scanner(System.in);
	double sal;
	int i=1,dm=0,dy=0;
	System.out.println("***********Displaying Entry Format********");
	emp = new empdir(); 
	emp.displayentry();
	System.out.println("******************************************");
	while(i==1)
	{
	  System.out.println("Do you want to make an Entry?(Y/N)");
	  String ch = scan.next();
	  
	  if(ch.charAt(0) == 'Y' || ch.charAt(0) == 'y')
	  {
	    System.out.println("Enter Employee First name: ");
		String fn = scan.next();
		System.out.println("Enter Employee Last name : ");
		String ln = scan.next();
		System.out.println("Enter Employee Salary    : ");
		sal = scan.nextDouble();
		System.out.println("Enter Employee Grade     : ");
		String grd = scan.next();
		System.out.println("Enter Employee Joining month in mm format : ");
		dm = scan.nextInt();
		System.out.println("Enter Employee Joining Year in yyyy format : ");
		dy = scan.nextInt();
		if (dm<01 || dm>12)
		{
			System.out.println("Date Input is Invalid");
		}
		else
		if(dm<01 || dm>12 || dy<1000 || dy>9999)
		{
			System.out.println("Date Input is Invalid");
		}
		else
		{
		   emp = new empdir(fn,ln,sal,grd,dm,dy);
		   emp.displayentry();	
		}
	  }
	  else 
	  break;
	}
	 emp = new empdir();
     emp.displaycount();
   }
}

	
	
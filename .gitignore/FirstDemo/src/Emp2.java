import java.util.*;
class Emp2{
static int count=0;
	
	public static void main(String[] args){
	int i;
        Scanner sc=new Scanner(System.in);
	
	
	      for (i=1;i<5;i++)
                {
       
	 
	count++;	

	System.out.println("Enter your firstname");
        String firstName=sc.next();
	
	System.out.println("Enter your lastname");
        String lastName=sc.next();

        System.out.println("Enter your salary");
        int salary=sc.nextInt();

	System.out.println("Enter your grade");
        char grade=sc.next().charAt(0);

	System.out.println("Enter your date of joining");
        int dojd=sc.nextInt();
		if(dojd <= 01 || dojd >= 31 ){
			System.out.println("date should be between 01 and 31");
			
		}
		int dojm=sc.nextInt();
		int dojy=sc.nextInt();
         Emp e = null; 
         e = new Emp(firstName, lastName, salary, grade, dojd, dojm, dojy);
      
      
        e.displayDetails();
       e.getInvoices();
	
 }
	
         
        
 
	System.out.println("No.of employees created are:" +count);	
		
		


              
        	
	}
}
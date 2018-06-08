class Emp{
        int empid;
	String firstName;
	String lastName;
    	static int count = 0; 
	int salary;
	char grade;
	int dojd;
	int dojm;
	int dojy;
	

public Emp(){
        
	firstName= "";
	lastName= "";
	salary= 0;
	grade= ' ';
	dojd=0;
	dojm=0;
	dojy=0;
	 

}
public Emp(String fn,String ln,int sal, char grd, int d,int m,int y ){
	this.firstName=fn;
	this.lastName=ln;
	this.salary=sal;
	this.grade=grd;
	this.dojd=d;
	this.dojm=m;
	this.dojy=y;
        

}


public void displayDetails(){
	count++;
	System.out.println("empid:" +count);
	System.out.println("Firstname: "+firstName);
	System.out.println("lastName: "+lastName);
	System.out.println("salary: " +salary);
	System.out.println("grade: "+grade);
	System.out.println("doj:" +dojd+ "-" +dojm+ "-"+dojy);
 
	
}
public Invoice[] getInvoices(){
	return null;
}
class Invoice{
}
}	
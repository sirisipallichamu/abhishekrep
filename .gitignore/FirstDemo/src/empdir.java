public class empdir
{
	private String fname;
	private String lname;
	private double sal;
	private String grade;
	private int dm;
	private int dy;
	public static int idcount;
	
	
	public empdir()
	{
		fname = "N/A";
		lname = "N/A";
		sal   = 0.0;
		grade = "N/A";
		dm    = 99;
		dy    = 9999;
	}
	
	public empdir(String fname,String lname,double sal,String grade,int dm,int dy)
	{
		this.fname = fname;
		this.lname = lname;
		this.sal   = sal;
		this.grade = grade;
        this.dm    = dm;
		this.dy    = dy;
		
		this.idcount = ++idcount;
	}
	public void displayentry()
	{
		   System.out.println("******************************************");
		   System.out.println("Employee ID   : "+idcount);			
           System.out.println("First Name    : "+fname);
           System.out.println("Last  Name    : "+lname);
           System.out.println("Salary        : "+sal);
           System.out.println("Grade         : "+grade);
           System.out.println("Joining date  : "+dm+"/"+dy);	
		   System.out.println("******************************************");
	}
	public void displaycount()
	{
		   System.out.println("Total entries present : "+idcount);	
		
	}
	
} 

	
	
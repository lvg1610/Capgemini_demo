public class SalesMan extends Employee 
{
    int points;
    public SalesMan(){}
    public SalesMan(int ssn,String name,int age,int empid,double salary,int points)
    {
    	super(ssn,name,age,empid,salary);
    	this.points = points;
    }
    public void showSalesMan()
    {
    	showEmployee();
    	System.out.println("Points       "+points);
    	System.out.println("Incentives   "+points * 700);
    	System.out.println("Total Salary "+(salary+points * 700));
    }
}

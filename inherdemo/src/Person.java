public class Person 
{
    int ssn;
    String name;
    int age;
    public Person() {}
    public Person(int ssn,String name,int age)
    {
    	this.ssn = ssn;  this.name=name;   this.age=age;
    }
    public void showPerson()
    {
    	System.out.println("Ssn   "+ssn);
    	System.out.println("Name  "+name);
    	System.out.println("Age   "+age);
    }
}

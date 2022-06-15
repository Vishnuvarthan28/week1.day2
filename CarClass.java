package week1.day2;

public class CarClass 
{

	public boolean applyBreak() {
		return (true);
	}
	private boolean applyGear() {
		return (false);
	}	
	boolean switchOnAc() 
	{
		return(false);
	}
	public boolean applyAcclerate() 
	{
	return (true);	
	}
	
	public static void main(String[] args) 
	{
CarClass obj = new CarClass();
boolean a = obj.applyBreak();
System.out.println(a);
boolean b = obj.applyGear();
System.out.println(b);
boolean c = obj.switchOnAc();
System.out.println(c);
boolean d = obj.applyAcclerate();
System.out.println(d);
	}
}


//create new class as MyCar class and create object for existing class and execute - This scenario is tested in another class.
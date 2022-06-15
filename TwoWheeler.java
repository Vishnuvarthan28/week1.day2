package week1.day2;

public class TwoWheeler 
{
	int noOfWheels = 4;
	short noOfMirror= 2;
	long chassisNumber = 9876543590L;
	boolean isPunctured = false;
	String bikeName = "Duke";
	double runningKM = 35000;
	
	public static void main(String[] args) 
	{
    TwoWheeler obj = new TwoWheeler();
     int a = obj.noOfWheels;
     System.out.println(a);
     short b = obj.noOfMirror;
     System.out.println(b);
     long c = obj.chassisNumber;
     System.out.println(c);
     boolean d = obj.isPunctured;
     System.out.println(d);
     String e = obj.bikeName;
	 System.out.println(e);
	 double f = obj.runningKM;
	 System.out.println(f);
 	}
}

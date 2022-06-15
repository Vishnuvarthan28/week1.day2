package week1.day2;

public class EmployeeDetails {

    public void printEmployeeName(String empName, int empId)
    {
    	System.out.println(empName  +empId);
	}
	public void getEmployeeAddress(String empAddress) 
	{
	System.out.println(empAddress);
	}
	public double printEmployeeSalary(double empSalary)
	{
    System.out.println(empSalary);
    return empSalary;
	}
	public long printEmployeeMobileNumber(long mobNum) 
	{
		System.out.println(mobNum);
		return mobNum;
	}
    
	public static void main(String[] args) 
	{
	EmployeeDetails obj = new EmployeeDetails();
	obj.printEmployeeName("Test", 1);
	obj.getEmployeeAddress("Test");
	obj.printEmployeeSalary(10000);
	obj.printEmployeeMobileNumber(9632587410l);
	}
}

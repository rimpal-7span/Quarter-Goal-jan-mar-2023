package java8_features;

import collection.Employee;

interface StaticAndDefaultMethodInterface
{
	 static Employee setEmployeeData(Employee e)
	{
		e.setEid(1);
		e.setName("ABC");
		e.setSalary(123.64);
		return e;
	}
	default void getEmployeeData(Employee e)
	{
		System.out.println(e.toString());
	}
}



public class StaticAndDefaultMethod implements StaticAndDefaultMethodInterface
{
	public static void main(String[] args)
	{
		Employee e1 =StaticAndDefaultMethodInterface.setEmployeeData(new Employee());
		StaticAndDefaultMethod staticAndDefaultMethod=new StaticAndDefaultMethod();
		staticAndDefaultMethod.getEmployeeData(e1);
	}
}

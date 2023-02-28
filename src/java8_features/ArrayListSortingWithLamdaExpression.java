package java8_features;

import collection.Employee;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSortingWithLamdaExpression
{
	public static void main(String[] args)
	{
		Employee e1=new Employee(1, "emp1",30000.89);
		Employee e2=new Employee(2, "emp2",21000.89);
		Employee e3=new Employee(3, "emp3",32000.89);
		Employee e4=new Employee(4, "emp4",25000.89);
		List<Employee> employeeList=new ArrayList<>();
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);

		employeeList.sort((o1, o2) -> (int) (o1.getSalary()-o2.getSalary()));
		System.out.print("name is    ");
		System.out.println("Salary is");
		employeeList.forEach(employee ->{
			System.out.print(employee.getName());
			System.out.print("    ");
			System.out.println(employee.getSalary());
		} );
	}
}

package collection;

import com.sun.javafx.collections.MappingChange;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_test
{
	public static void main(String[] args)
	{
		Employee employee=new Employee(1,"abc",23000.00);
		Employee employee1=new Employee(2,"pqr",25000.00);
		Employee employee3=new Employee(3,"xyz",27000.00);

		Map<Integer, Employee> empMap= new HashMap<>();
		empMap.put(1,employee);
		empMap.put(2,employee1);
		empMap.put(3,employee3);
		System.out.println(empMap.keySet());
		System.out.println(empMap.values());
		System.out.println(empMap.entrySet());

		final Set<Integer> integers = empMap.keySet();
		for(Integer key:integers)

			System.out.println("key is==>"+key +"and value is===>"+empMap.get(key));


	}





}

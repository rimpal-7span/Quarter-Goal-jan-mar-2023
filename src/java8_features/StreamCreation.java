package java8_features;

import collection.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCreation
{
	public static void main(String[] args)
	{
		Employee e1 = new Employee(1, "emp1", 32000.89);
		Employee e2 = new Employee(2, "emp2", 21000.89);
		Employee e3 = new Employee(3, "emp3", 32000.89);
		Employee e4 = new Employee(4, "emp4", 25000.89);
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);

		Employee e5 = new Employee(5, "emp5", 22000.89);
		Employee e6 = new Employee(6, "emp6", 27000.89);

		List<Employee> employeeList1 = new ArrayList<>();
		employeeList1.add(e5);
		employeeList1.add(e6);
		//Stream of chars
		Stream<Character> stream = Stream.of('a', 'b', 'c');
		stream.forEach(System.out::println);

		//Stream of array
		System.out.println("=======creating stream of array of employee=========");
		//Stream<Employee> employeeStream = Stream.of(new Employee[]{e1,e2,e3,e4});
		Stream<Employee> employeeStream = Stream.of(e1, e2, e3, e4);
		employeeStream.forEach(System.out::println);

		//Stream from List
		System.out.println("=======creating stream of employee from list=========");
		Stream<Employee> stream1 = employeeList.stream();
		stream1.forEach(System.out::println);

		//filter
		System.out.println("=======filtering employee with salary  is >25000=========");
		employeeList.stream().filter(e -> e.getSalary() > 25000).collect(Collectors.toList()).forEach(System.out::println);

		//map
		System.out.println("=======mapping XYZ with employee name in list=========");
		employeeList.stream().map(e -> e.getName() + "XYZ").collect(Collectors.toList()).forEach(System.out::println);

		//sorted
		System.out.println("=======Sorting of employee list with salary=========");
		employeeList.stream().sorted(new Comparator<Employee>()
		{
			@Override
			public int compare(Employee o1, Employee o2)
			{
				return (int) (o1.getSalary() - o2.getSalary());
			}
		}).collect(Collectors.toList()).forEach(System.out::println);

		//find max salary
		System.out.println("=======max salary employee=========");
		System.out.println(employeeList.stream().max(Comparator.comparingDouble(value -> value.getSalary())).get());

		//String array to uppercase String with delimiter ,
		System.out.println("=======Convert string array in uppercase and add delimiter=========");

		List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.", "Canada");
		String G7Countries = G7.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(", "));
		System.out.println(G7Countries);

		//get count, sum, average, max, min
		System.out.println("=======get count, sum, average, max, min in one function=========");

		List<Integer> list = Arrays.asList(1, 2, 3, 6, 7);
		IntSummaryStatistics intSummaryStatistics = list.stream().mapToInt((i) -> i).summaryStatistics();
		System.out.println(intSummaryStatistics.getMax());
		System.out.println(intSummaryStatistics.getAverage());

		System.out.println(employeeList.stream().filter(e -> e.getName().endsWith("3")).collect(Collectors.toList()));

		System.out.println("======Find First=====");
		System.out.println(employeeList.stream().findFirst());

		System.out.println("======Find Any=====");
		System.out.println(employeeList.stream().findAny());

		System.out.println("====== Any Match=====");
		System.out.println(employeeList.stream().anyMatch(e -> e.getSalary() > 25000));

		System.out.println("======Convert List to map=====");

		Map<Integer, String> empHashmap = new HashMap<>();
		empHashmap = employeeList.stream().collect(Collectors.toMap(Employee::getEid, Employee::getName));
		empHashmap.entrySet().forEach(System.out::println);

		System.out.println("======Grouping of List=====");

		Map<Double, List<Employee>> salaryGroup = employeeList.stream().collect(Collectors.groupingBy(Employee::getSalary));
		salaryGroup.entrySet().forEach(System.out::println);

		System.out.println("======AllMatch in list=====");
		System.out.println(employeeList.stream().allMatch(e -> e.getSalary() < 50000));

		System.out.println("======AnyMatch in list=====");
		System.out.println(employeeList.stream().anyMatch(e -> e.getSalary() > 50000));

		System.out.println("======Flat Map =====");
		List<List<Employee>> allEmpList = new ArrayList<>();
		allEmpList.add(employeeList);
		allEmpList.add(employeeList1);

		System.out.println("====before=====");
		allEmpList.forEach(System.out::println);

		System.out.println("====after=====");
		allEmpList.stream().flatMap(e -> e.stream()).collect(Collectors.toList()).forEach(System.out::println);

		System.out.println("====Limit in list 2=====");
		employeeList.stream().limit(2).collect(Collectors.toList()).forEach(System.out::println);

		System.out.println("====skip  2 in list=====");
		employeeList.stream().skip(2).collect(Collectors.toList()).forEach(System.out::println);

		System.out.println("====reduce in list=====");
		Optional<Employee> emp = employeeList.stream().reduce((employee, employee2) -> employee.getSalary()==employee2.getSalary() ? employee:employee2);
		System.out.println(emp.get());
	}
}

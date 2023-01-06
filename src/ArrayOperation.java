import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ArrayOperation
{
	public static void main(String[] args)
	{
		Employee e1=new Employee(1, "emp1",20000.89);
		Employee e2=new Employee(2, "emp2",20000.89);
		Employee e3=new Employee(3, "emp3",20000.89);
		Employee e4=new Employee(4, "emp4",20000.89);

		List<Employee> empList = new ArrayList<>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);


		System.out.println("empList======>"+empList);
		List<Employee> empList1 = new ArrayList<>();
		empList1.addAll(empList);
		System.out.println("empList1======>"+empList1);

		empList1.add(e4);
		empList1.removeAll(empList);

		System.out.println("empList1======>"+empList1);

		empList1.addAll(empList);
		System.out.println("empList1======>"+empList1);

		empList1.clear();
		System.out.println("empList1 after clear =====>"+empList1);

		Iterator<Employee> itr = empList.iterator();

		while(itr.hasNext())
		System.out.println(itr.next());

	}
}

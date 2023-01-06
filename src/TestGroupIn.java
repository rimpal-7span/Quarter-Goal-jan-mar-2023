import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

public class TestGroupIn
{
	public static void main(String[] args)
	{
		GroupInForEmployee g1 = new GroupInForEmployee("aa1", new Employee(1, "aa", 200.40), "XYZ");
		GroupInForEmployee g2 = new GroupInForEmployee("aa1", new Employee(2, "bb", 200.40), "XYZ");
		GroupInForEmployee g3 = new GroupInForEmployee("aa1", new Employee(3, "cc", 200.40), "XYZ");
		GroupInForEmployee g4 = new GroupInForEmployee("aa2", new Employee(4, "dd", 200.40), "XYZ");
		GroupInForEmployee g5 = new GroupInForEmployee("aa2", new Employee(5, "ee", 200.40), "XYZ");
		GroupInForEmployee g6 = new GroupInForEmployee("aa2", new Employee(6, "ff", 200.40), "XYZ");
		GroupInForEmployee g7 = new GroupInForEmployee("aa3", new Employee(7, "gg", 200.40), "XYZ");

		List<GroupInForEmployee> list = new ArrayList<>();
		list.add(g1);
		list.add(g2);
		list.add(g3);
		list.add(g4);
		list.add(g5);
		list.add(g6);
		list.add(g7);

		Map<String, List<GroupInForEmployee>> result = list.stream().collect(groupingBy(GroupInForEmployee::getName));

		for (Map.Entry<String, List<GroupInForEmployee>> data : result.entrySet())
		{
			List<GroupInForEmployee> groupedEmployee = data.getValue();

			for (int i = 0; i < groupedEmployee.size(); i++)
			{
				GroupInForEmployee employee = groupedEmployee.get(i);
				System.out.println(employee.getName());
				System.out.println(employee.getEmployee());
			}

		}

	}
}

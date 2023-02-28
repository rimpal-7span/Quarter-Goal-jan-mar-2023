package java8_features;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface FunctionalInterfaceTest
{
	void printArray(List<String> stringList);
}

public class FunctionalInterfaceAndLamdaExpressionDemo
{
	public static void main(String[] args)
	{
		List<String> strings=new ArrayList<>();
		strings.add("Rimpal");
		strings.add("patel");

		FunctionalInterfaceTest f= (List<String> list)->
		{
						list.forEach(list1-> System.out.println(list1));
		};
		f.printArray(strings);

	}

}

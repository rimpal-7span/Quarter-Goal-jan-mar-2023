package java8_features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateDemo
{
	public static void main(String[] args)
	{
		Predicate<String> predicate = str -> str.startsWith("r");
		List<String> stringList = new ArrayList<>();
		stringList.add("rimpal");
		stringList.add("kevin");
		stringList.add("rima");
		stringList.stream().filter(predicate).collect(Collectors.toList()).forEach(System.out::println);

	}
}

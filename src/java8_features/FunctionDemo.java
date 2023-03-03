package java8_features;

import java.util.function.Function;

public class FunctionDemo
{
	public static void main(String[] args)
	{
		Function<String, Integer> function=x -> x.length();
		System.out.println(function.apply("this is my code"));

		Function<Integer,Integer> function1= y-> y*3;
		Integer length =function.andThen(function1).apply("this is my another code");
		System.out.println(length);
	}
}

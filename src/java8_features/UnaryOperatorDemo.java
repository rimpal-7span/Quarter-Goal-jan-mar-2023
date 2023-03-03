package java8_features;

import java.util.function.UnaryOperator;

public class UnaryOperatorDemo
{
	public static void main(String[] args)
	{
		UnaryOperator<String> unaryOperator= str -> str.toUpperCase();
		System.out.println(unaryOperator.apply("aaaaaaaaaaa"));
	}
}

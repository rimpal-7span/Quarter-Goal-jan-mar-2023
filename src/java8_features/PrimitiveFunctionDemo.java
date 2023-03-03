package java8_features;

import java.util.function.IntFunction;

public class PrimitiveFunctionDemo
{
	public static void main(String[] args)
	{
		IntFunction<Integer> intFunction = i -> i*5;
		System.out.println(intFunction.apply(6));
	}
}

package java8_features;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorAndBiFunctionDemo
{
	public static void main(String[] args)
	{
		//Both work same but in {Binary operator take type which is type for both input type and output type}
		BinaryOperator<String> binaryOperator= (str,str1) -> str.concat(str1);
		System.out.println(binaryOperator.apply("hi","hello"));

		//{BiFunction take three argument of same type in and return same type}
		BiFunction<String, String,String> biFunction = (str,str1) -> str.concat(str1);
		System.out.println(biFunction.apply("bi","function"));
	}
}

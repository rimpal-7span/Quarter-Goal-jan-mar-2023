package java8_features;

import java.util.function.Consumer;

public class ConsumerDemo
{
	public static void main(String[] args)
	{
		Consumer<String> consumer = str -> System.out.println(str);
		consumer.accept("This is consumer demo");
	}
}

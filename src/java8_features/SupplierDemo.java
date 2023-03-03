package java8_features;

import java.util.function.Supplier;

public class SupplierDemo
{
	public static void main(String[] args)
	{

		Supplier<String> supplier = () -> "this is returned value";
		System.out.println(getText(supplier));

	}
	public static int getText(Supplier<String> text)
	{
		return text.get().length();
	}
}

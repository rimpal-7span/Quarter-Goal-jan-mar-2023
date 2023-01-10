package collection;

public class LambdaExpressionWithFunctionalInterface
{
	public static void main(String[] args)
	{
		TestInterface t = ()-> System.out.println("Test Interface method implementation");
		t.test();
	}
}

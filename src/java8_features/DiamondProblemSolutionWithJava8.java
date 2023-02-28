package java8_features;

interface A
{
	default void show()
	{
		System.out.println("this is show of A");
	}
}

interface B
{
	default void show()
	{
		System.out.println("this is show of B");
	}
}

public class DiamondProblemSolutionWithJava8 implements A, B
{
	public static void main(String[] args)
	{
		DiamondProblemSolutionWithJava8 d = new DiamondProblemSolutionWithJava8();
		d.show();
	}

	@Override
	public void show()
	{
		A.super.show();
		B.super.show();
	}
}

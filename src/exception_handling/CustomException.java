package exception_handling;

public class CustomException
{
	public static void main(String[] args)
	{
		testAge age =new testAge();
		try
		{
			age.testAgeMethod(19);
		}
		catch (AgeNotValid notValid)
		{
			System.out.println(notValid);
		}

	}
}

class AgeNotValid extends Exception
{
	public AgeNotValid(String msg)
	{
		super(msg);
	}
}

class testAge
{
	public void testAgeMethod(int age) throws AgeNotValid
	{
		if(age<18)
		{
			throw new AgeNotValid("Age is less than 18");
		}
		else
		{
			System.out.println("you can vote");
		}
	}
}

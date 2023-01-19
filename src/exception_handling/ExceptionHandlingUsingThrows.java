package exception_handling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandlingUsingThrows
{
	public static void main(String[] args)
	{
		try
		{
			Test t = new Test();
			t.test_method();
		}
		catch (Exception e)
		{
			System.out.println("method test_method have exception");
		}

	}
}

class Test
{
	 void test_method() throws FileNotFoundException
	{
		FileReader file =new FileReader("uy.txt");
		throw new FileNotFoundException("file not present");
	}
}
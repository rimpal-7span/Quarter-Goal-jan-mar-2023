package exception_handling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandlingUsingTryCatch
{
	public static void main(String[] args)
	{
		try
		{
			FileReader file =new FileReader("pqr.txt");
			file.read();

		}
		catch (FileNotFoundException ex)
		{
			System.out.println("file not found");

		}
		catch (IOException e)
		{
			throw new RuntimeException(e);
		}

	}

}

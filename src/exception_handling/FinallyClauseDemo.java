package exception_handling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FinallyClauseDemo
{
	public static void main(String[] args) throws IOException
	{
		FileReader file = null;

		try
		{
			file =new FileReader("pqr.txt");
			file.read();

		}
		catch (IOException ex)
		{
			System.out.println("file not found");

		}
		finally
		{
			try
			{
				file.close();
			}
			catch (NullPointerException e)
			{
				System.out.println("null pointer exception caught");
			}

		}
	}
}

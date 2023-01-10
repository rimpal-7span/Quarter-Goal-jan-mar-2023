package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializable_Has_Relationship
{

	public static void main(String[] args)
	{
		Address address = new Address(1, "Gujarat", "Ahmedabad");
		Student student = new Student(1, "ABC", address);


		Student obj = null;
		try
		{

			FileOutputStream fileOutputStream = new FileOutputStream("a.txt");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(student);
			System.out.println("Object is serialized");
			objectOutputStream.close();

			FileInputStream fileInputStream = new FileInputStream("a.txt");
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			obj = (Student) objectInputStream.readObject();
			System.out.println("Object is deserialized");
			objectInputStream.close();
		}
		catch (IOException i)
		{
			i.printStackTrace();
		}
		catch (ClassNotFoundException e)
		{
			throw new RuntimeException(e);
		}

	}

}


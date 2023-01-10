package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


//also called custom serialization
public class StudentSerialization implements Serializable
{
	public Integer stud_id;
	public String name;

	public StudentSerialization(Integer stud_id, String name)
	{
		this.stud_id = stud_id;
		this.name = name;
	}


	public static void main(String[] args)
	{
		StudentSerialization obj = null;
		try
		{
			StudentSerialization studentSerialization=new StudentSerialization(1,"ABC");
			FileOutputStream fileOutputStream = new FileOutputStream("a.txt");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(studentSerialization);
			System.out.println("Object is serialized");
			objectOutputStream.close();

			FileInputStream fileInputStream = new FileInputStream("a.txt");
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		    obj = (StudentSerialization) objectInputStream.readObject();
			System.out.println("Object is deserialized");
			objectInputStream.close();
		}
		catch (IOException | ClassNotFoundException i)
		{
			i.printStackTrace();
		}

		System.out.println("Student id is==>"+obj.stud_id);
		System.out.println("Student name is=>"+obj.name);


	}

}

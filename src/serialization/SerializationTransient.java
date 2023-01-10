package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationTransient implements Serializable
{
	public Integer stud_id;
	public String name;
	transient public  String lastname;

	public SerializationTransient(Integer stud_id, String name, String lastname)
	{
		this.stud_id = stud_id;
		this.name = name;
		this.lastname=lastname;
	}


	public static void main(String[] args)
	{
		SerializationTransient obj = null;
		try
		{
			SerializationTransient serializationTransient=new SerializationTransient(1,"ABC","XYZ");
			FileOutputStream fileOutputStream = new FileOutputStream("a.txt");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(serializationTransient);
			System.out.println("Object is serialized");
			objectOutputStream.close();

			FileInputStream fileInputStream = new FileInputStream("a.txt");
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			obj = (SerializationTransient) objectInputStream.readObject();
			System.out.println("Object is deserialized");
			objectInputStream.close();
		}
		catch (IOException | ClassNotFoundException i)
		{
			i.printStackTrace();
		}

		System.out.println("Student id is==>"+obj.stud_id);
		System.out.println("Student name is=>"+obj.name);
		System.out.println("Student Last name is=>"+obj.lastname);


	}

}

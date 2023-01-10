package serialization;

import java.io.Serializable;

public class Student implements Serializable
{
	public int sid;
	public String name;
	Address address;

	public Student(int sid, String name, Address address)
	{
		this.sid = sid;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString()
	{
		return "Student{" + "sid=" + sid + ", name='" + name + '\'' + ", address=" + address + '}';
	}

	public static void main(String[] args)
	{
		Address address=new Address(1,"Gujarat","Ahmedabad");
		Student student=new Student(1,"ABC",address);
		System.out.println(student.toString());
	}
}

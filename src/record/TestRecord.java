package record;

public class TestRecord
{
	public static void main(String[] args)
	{
		EmpRecord empRecord = new EmpRecord(1,"aaa");
		EmpRecord empRecord1 = new EmpRecord(2,"bbb");

		//get object
		System.out.println(empRecord.id());
		System.out.println(empRecord.name());

		//call toString
		System.out.println(empRecord1);

		//call instance and static method
		System.out.println(empRecord.getUpperCase(empRecord.name()));
		EmpRecord.printName(empRecord.name());

	}
}

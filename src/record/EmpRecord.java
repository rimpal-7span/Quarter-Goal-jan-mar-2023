package record;

public record EmpRecord(int id, String name)
{
	//create instance and static method
	public String getUpperCase(String name)
	{
		return name.toUpperCase();
	}
	public static void printName(String name)
	{
		System.out.println(name);
	}
}

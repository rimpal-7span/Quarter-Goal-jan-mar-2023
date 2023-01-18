package string_memory_management;

public class StringOperation
{
	public static void main(String[] args)
	{
		//Create two String literal with sane value have same location

		String name ="Test";
		String name1="Test";

		// == operator check equality according location of object
		System.out.println(name==name1);


		//Create two object with same value have different location

		String nameObj= new String("Test");
		String nameObj1= new String("Test");

		System.out.println(nameObj1==name1);
		System.out.println(nameObj==nameObj1);


		String nameObj2 = new String("Test").intern();
		System.out.println(nameObj2==name1);


	}
}

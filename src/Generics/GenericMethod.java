package Generics;

public class GenericMethod
{
	public static void main(String[] args)
	{
		GenericMethodImpl genericMethodData =new GenericMethodImpl();
		genericMethodData.displayData("Rimpal","3445");
		genericMethodData.displayData(9876.89,22434);
		genericMethodData.displayData(9876.89,"Patel");
	}


}

class GenericMethodImpl
{
	public <T, U> void displayData(T data1, U data2)
	{
		System.out.println("this is data1=>"+data1);
		System.out.println("this is data2=>"+data2);

	}
}
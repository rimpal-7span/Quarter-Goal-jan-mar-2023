package Generics;

public class GenericClass<T, U>
{
	T data1;
	U data2;
	GenericClass(T input1, U input2)
	{
		this.data1=input1;
		this.data2=input2;
		System.out.println("this is data1=>"+data1);
		System.out.println("this is data2=>"+data2);

	}

	public static void main(String[] args)
	{
		GenericClass<String, Integer> genericClass = new GenericClass<>("Rimpal",12345);
		GenericClass<Integer, Double> genericClass1 = new GenericClass<>(12345,12.45);
		GenericClass<String, String> genericClass2 = new GenericClass<>("Rimpal","patel");
	}
}

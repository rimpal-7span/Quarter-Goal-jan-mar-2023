package Generics;

public class DisplayFamily
{
	public static <T extends GrandFather> T displayMain(T t)
	{
		t.disply();
		return null;
	}
	public static void main(String[] args)
	{
		Father f= new Father();
		Other o =new Other();
		GrandFather g=new GrandFather();
		Son s=new Son();
	 displayMain(f);
	 displayMain(s);
	 displayMain(g);
	 //displayMain(o);  instance of other can not be used becuase it restrict type which are Grandfather or subclass of Grandfather.
	}

}
class GrandFather
{
	public void disply()
	{
		System.out.println("this is grandfather");
	}
}
class Father extends GrandFather
{
	public void disply()
	{
		System.out.println("this is Father");
	}
}

class Son extends Father
{
	public void disply()
	{
		System.out.println("this is son");
	}
}

class Other
{
	public void disply()
	{
		System.out.println("this is Other");
	}
}
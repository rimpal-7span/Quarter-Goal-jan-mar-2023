package Generics;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundDemo
{
	public static void displayFamily(List<? extends Father> father)
	{
		father.forEach(father1 -> father1.disply());
	}

	public static void main(String[] args)
	{
		Father f1=new Father();
		Father f2=new Father();

		Son s1=new Son();
		Son s2=new Son();
		List<Father> flist=new ArrayList<>();
		flist.add(f1);
		flist.add(f2);

		List<Son> slist= new ArrayList<>();
		slist.add(s1);
		slist.add(s2);

		displayFamily(flist);
		displayFamily(slist);

	}
}

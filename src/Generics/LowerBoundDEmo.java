package Generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LowerBoundDEmo
{
	public static void addFamily(List<? super Father> father)
	{
		Father f=new Father();
		father.add(f);
		GrandFather f1=new GrandFather();
		f1= (GrandFather) father.get(0);
		f1.disply();


		//It will not allow son because lower bound is restricted.
		//Son s1=new Son();
	//	s1= (Son) father.get(0);
		//f1.disply();
	}

	public static void main(String[] args)
	{
		GrandFather f1=new GrandFather();
		GrandFather f2=new GrandFather();

		Son s1=new Son();
		Son s2=new Son();
		List<GrandFather> flist=new ArrayList<>();
		flist.add(f1);
		flist.add(f2);

		List<Son> slist= new ArrayList<>();
		slist.add(s1);
		slist.add(s2);

		addFamily(flist);
		//addFamily(slist);

	}
}

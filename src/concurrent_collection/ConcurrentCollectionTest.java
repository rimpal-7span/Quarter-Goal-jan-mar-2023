package concurrent_collection;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentCollectionTest
{
	public static void main(String[] args)
	{
		// **********if we are using hashmap here then it will throw ConcurrentModificationException.

		ConcurrentHashMap<Integer, String> hashMap = new ConcurrentHashMap<>();
		//HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1,"abc");
		hashMap.put(2,"xyz");
		hashMap.put(3,"pqr");

		ConcurrentHashMap<Integer, String> testHashMap =new ConcurrentHashMap<>(hashMap);
		//HashMap<Integer, String> testHashMap =new HashMap<>(hashMap);

		System.out.println("hashmap elements"+hashMap.entrySet());
		System.out.println("testhashmap elements"+testHashMap.entrySet());

		Iterator<Integer> it= testHashMap.keySet().iterator();
		while (it.hasNext())
		{
			Integer key = it.next();
			if(key == 2)
				testHashMap.put(4,"sdfds");
		}
		System.out.println("testhashmap data"+ testHashMap);
	}
}

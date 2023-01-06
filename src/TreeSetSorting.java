import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetSorting
{
	public static void main(String[] args)
	{

		//Set<Integer> myHashSet= new TreeSet<Integer>((i1,i2)-> (i1>i2)?-1:(i1<i2)?1:0);
		Set <StringBuffer> stringBuffers= new TreeSet<>(new StringBufferComparator());
		stringBuffers.add(new StringBuffer("xyz"));
		stringBuffers.add(new StringBuffer("ngs"));
		stringBuffers.add(new StringBuffer("abc"));
		stringBuffers.add(new StringBuffer("sdr"));
		System.out.println(stringBuffers);

	}
}

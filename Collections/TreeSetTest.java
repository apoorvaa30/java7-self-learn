//version 11.1

import java.util.*;

class TreeSetTest
{
	public static void main(String s[])
	{
		TreeSet al=new TreeSet();
	
		al.add(new String("ABC"));
		al.add("xyz");
		al.add("mno");
		al.add("pqr");
		al.add("xyz");
		al.add("hij");
		
		System.out.println("No. of elements:   "+al.size());
		System.out.println("List of elements:   ");
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			Object ob=itr.next();
			System.out.println(ob);
		}
	}
}


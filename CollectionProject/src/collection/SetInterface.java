package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map.Entry;
import java.util.NavigableSet;

public class SetInterface {

	public static void main(String[] args)
	{
		Set<Integer> h=new HashSet<Integer>();
            h.add(101);
            h.add(102);
            h.add(103);
            h.add(104);
            h.add(null);
            h.add(null);
		SortedSet<String> hs=new TreeSet<String>();
			hs.add("Subha");
			hs.add("sri");
			hs.add("Unna");
			hs.add("Unna");
			hs.add("Anne");
			hs.add("Subha");
		NavigableSet<String> ns=new TreeSet<String>();
		ns.add("subha176@gmail.com");
		ns.add("sri176@gmail.com");
		ns.add("unna176@gmail.com");
		ns.add("anne176@gmail.com");
		ns.add("subha176@gmail.com");
		if(hs.isEmpty()&&h.isEmpty())
		{
		   System.out.println("Employee Details not available!!");
		}else
		{
		       System.out.println("Employee ID Number :");
		       h.forEach(System.out::println);
		       System.out.println("Employee Name :");
			   hs.forEach(System.out::println);
			   System.out.println("Employee ID 101 details:");
			   System.out.println(ns.first()+"\n"+hs.first());
			   System.out.println("After pollLast and last operation");
			   System.out.println(ns.pollLast()+"\n"+hs.last());
		}

}
}
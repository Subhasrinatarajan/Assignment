package collection;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class EmployeeDetails {

	public static void main(String[] args)
	{
		Map<Integer,String> tm=new TreeMap<Integer,String>();  
		tm.put(104,"Subha");
		tm.put(103,"sri");
		tm.put(101,"Unna");
		tm.put(106,"Unna");
		tm.put(101,"Anne");
		tm.put(105,"Subha");
		tm.put(102,"Sandiya");
		if(tm.isEmpty())
		{
		   System.out.println("Employee Details not available!!");
		}else
		{
			
		System.out.println("Employee Details");
		System.out.println("Employee_ID"+" "+"Employee_Name"+" "+"Employee_AccountDetails"+" "+"Employee_EmailID");
		/** 
		 * To convert map interface into Set interface
		 */
		Set<Entry<Integer, String>> set=tm.entrySet();
		Map<Integer,String> tp=new TreeMap<Integer,String>();  
		tp.put(102,"sandiya45@gmail.com");
		tp.put(103,"subha54765@gmail.com");
		tp.put(101,"anne1234@gmail.com");
		tp.put(106,"unna574@gmail.com");
		tp.put(104, null);
		tp.put(106,"sri5675@gmail.com");
		Map<Integer,String> trm=new LinkedHashMap<Integer,String>();  
		trm.put(101,"1274545678");
		trm.put(102,"1276253697");
		trm.put(103,"1273567765");
		trm.put(104,"1277636756");
		trm.put(105, "1274655631");
		trm.put(106,"1274567667");
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
	        Map.Entry entry=(Map.Entry)itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		System.out.println("Employee Id 101 details:");
		System.out.println("Name: "+ tm.get(101));
		System.out.println("Email: "+tp.get(101));
		System.out.println("Account Number: "+trm.get(101));
	}
      
}
}
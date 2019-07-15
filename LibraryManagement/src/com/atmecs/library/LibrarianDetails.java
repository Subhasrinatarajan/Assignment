package com.atmecs.library;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibrarianDetails implements java.io.Serializable 
{
	transient static int id;
	transient static String name;
	transient static long pno;
    public static void detail()
    {
    	List li=new ArrayList();
    	li.add("CC001");
    	li.add("CC002");
    	li.add("CC003");
    	li.add("CC004");
    	
    	if(li.contains(id))
    	{
    		Scanner scan=new Scanner(System.in);
        	System.out.println("---Librarian Detail---");
        	System.out.println("Librarian Id :");
        	id=scan.nextInt();
        	System.out.println("Librarian Name :");
        	name=scan.next();
        	System.out.println("Librarian phoneno :");
        	pno=scan.nextLong();
    	}
    }
}

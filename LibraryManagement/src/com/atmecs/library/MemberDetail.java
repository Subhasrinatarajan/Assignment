package com.atmecs.library;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class MemberDetail {

	public static void memberdetails()
	{
		 Scanner sc =new Scanner(System.in);
		  
		  System.out.println("Enter a memid:");
		  String word=sc.nextLine();
		 
		  try
		  {
		   File f=new File("C:\\Users\\Subhasri.Natarajan\\eclipse-workspace\\LibraryManagement\\LibraryUserDetails.txt");
		   if(f.exists())
		   {
		    BufferedReader br=new BufferedReader(new FileReader(f));
		    String line;
		    String []id;
		    int i;
		    while((line=br.readLine())!=null)
		    {
		    	id=line.split(",");
		     for(i=0;i<id.length;i++)
		     {
		      if(id[i].equals(word))
		      {
		       for(int j= 0; j<id.length;j++) {
		        System.out.print(id[j]+" ");
		       }
		      }
		     }
		    }
		   
		   }
		   else {
		    System.out.println("File not found");
		   }
		  }
		  catch(Exception e)
		  {
		   System.out.println(e.toString());
		  }
		  
		  
		  
		 
		 
		}
		}

	
package com.atmecs.library;

import java.io.*;
public class Deserializing {

   public static void main(String [] args) {
	   MemberPortalLoginCrediential port = null;
      try {
         FileInputStream fileIn = new FileInputStream("C:\\\\Users\\\\Subhasri.Natarajan\\\\Documents\\\\process\\\\memportal.txt");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         port = (MemberPortalLoginCrediential) in.readObject();
         in.close();
         fileIn.close();
      }
         catch (FileNotFoundException e2)
         {
        	 e2.printStackTrace();
         }
       catch (IOException i) {
         i.printStackTrace();
         return;
      } catch (ClassNotFoundException c) 
      {
         System.out.println("MemberPortalLoginCrediential class not found");
         c.printStackTrace();
         return;
      }
      
      System.out.println("Deserialized MemberPortalLoginCrediential...");
      System.out.println("Member Name: " + port.name);
      System.out.println("Member ID" +port.id);
   
      
   }
}
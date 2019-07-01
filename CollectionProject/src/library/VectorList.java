package library;

import java.util.Scanner;
import java.util.Vector;


public class VectorList extends Thread
{ 
	 
	 public static void main(String[] args) 
	 
	 {
	 Vector<String> vector = new Vector<String>(6);
	 Scanner scan=new Scanner(System.in);
	 System.out.println("Welcome!!State Central Library");
	    vector.add("Java");
	    vector.add("Java Script");
	    vector.add("Python");
	    vector.add("Ayurveda medicine");
	    vector.add("Cataract Surgrey");
	    vector.add("The Human of God");
	    vector.add("Believe your self");
	    vector.add("Train your Brain");
	    vector.add("Know your future");
	 System.out.println("Checking Books Avaiability");
	 try {
		Thread.sleep(2000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	  if(vector.isEmpty())
	  {
		  System.out.println("Sorry!!Books Not Avaiable Here");
	  }else
	  {
		  while(vector.isEmpty()==false)
		  {
			  Scanner scan1=new Scanner(System.in);
			  System.out.println("Continue Order");
			  System.out.println("If yes enter 1st option value");
			  System.out.println("1.true");
			  System.out.println("2.false");
			  boolean value=scan.nextBoolean();
 
		  if(value)
		  {
			  try {
				Thread.sleep(5000);
			} catch (InterruptedException e) 
			  {
				e.printStackTrace();
			  }
		  System.out.println("Only Avaiable Books categories are");
		  System.out.println("1.Computer language Oriented Books");
		  System.out.println("2.Medical Oriented Books");
		  System.out.println("3.Novel Oriented Books");
		  
		  System.out.println("Enter Your Book Type");
		  int type=scan.nextInt();
		  switch(type)
		  {
		  case 1:
			   System.out.println("Computer language oriented books lists are");
			   System.out.println("1.Java");
			   System.out.println("2.Java Script");
			   System.out.println("3.python");
			   
			   System.out.println("Choose your book");
			   int choice=scan.nextInt();
			   switch(choice)
			   {
			   case 1:
				   System.out.println("1.Java");
				   
				   System.out.println(" Thank you!!Your order is taken");
				   Object obj2 = vector.remove(0);
				   break;
			   case 2:
				   System.out.println("2.Java Script");
				   
                   System.out.println(" Thank you!!Your order is taken");
				   Object obj1 = vector.remove(1);

				   break;
			   case 3:
				   System.out.println("3.python");

                   System.out.println(" Thank you!!Your order is taken");
				   Object obj = vector.remove(2);
				   break;
			   }
			   
			   break;
		  case 2:
			   System.out.println("Medical Oriented Books lists are");
			   System.out.println("1.Ayurveda medicine");
			   System.out.println("2.Cataract Surgery");
			   System.out.println("3.The Human of God");
			   
			   System.out.println("Choose your book");
			   int choice1=scan.nextInt();
			   switch(choice1)
			   {
			   case 1:
				   System.out.println("1.Ayurveda medicine");
				   
				   System.out.println(" Thank you!!Your order is taken");
				   Object obj = vector.remove(3);
				   break;
			   case 2:
				   System.out.println("2.Cataract Surgery");
				   
				   System.out.println(" Thank you!!Your order is taken");
				   Object obj2 = vector.remove(4);
				   break;
			   case 3:
				   System.out.println("3.The Human of God");
				   
				   System.out.println(" Thank you!!Your order is taken");
				   Object obj3 = vector.remove(5);
				   break;
		 	   }
			   break;
		  case 3:
			   System.out.println("Novel Oriented Books Lists are");
			   System.out.println("1.Believe your self");
			   System.out.println("2.Train your Brain");
			   System.out.println("3.Know your future");
              
			   System.out.println("Choose your book");
			   int choice11=scan.nextInt();
			   switch(choice11)
			   {
			   case 1:
				   System.out.println("1.Believe your self");
				   
				   System.out.println(" Thank you!!Your order is taken");
				   Object obj = vector.remove(6);
				   break;
			   case 2:
				   System.out.println("2.Train your Brain");
				   
				   System.out.println(" Thank you!!Your order is taken");
				   Object obj5 = vector.remove(7);
				   break;
			   case 3:
				   System.out.println("3.Know your future");
				   
				   System.out.println(" Thank you!!Your order is taken");
				   Object obj6 = vector.remove(8);
				   break;
		 	   }
			   break;
		  }
		    System.out.println("\nAfter Book delivery the remaining books are:");
		    for(int i=0; i < vector.size(); i++)
		    {
		       System.out.println(vector.get(i));
		    }
		 
		  }
	  }
	 }
	}

}
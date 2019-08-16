import java.util.Scanner;


public class FoodOrder3
{
	static void swiggy(String food)throws NotAvaiableException
	{
		String []Foodlist= {"idili","dhosa","curd rice"};
		
	int i=0;
		for(;i<Foodlist.length;i++)
		{
            if(Foodlist[i].contains(food))
            {
		
			System.out.println("your order is booked!!");
			if(Foodlist[i+1].contains(food))
			{
				System.out.println("your order is booked!!");

			}
		}
		else
		{
		throw new NotAvaiableException(" Sorry! your order is cancled");
		}
	}
	}
	public static void main(String []args)
	{
		FoodOrder3 ref=new FoodOrder3();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your FoodOrder");
		String food=sc.next();
		
			try
			{
				swiggy(food);
			}catch(NotAvaiableException e)
			{
				e.printStackTrace();
			}
	}	
		
	}

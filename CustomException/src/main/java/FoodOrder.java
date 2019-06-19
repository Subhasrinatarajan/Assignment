import java.util.Scanner;


public class FoodOrder
{
	static void swiggy(String food)throws NotAvaiableException
	{
		String []Foodlist= {"idili"};
		
	int i=0;
		for(;i<Foodlist.length;i++)
		{
            if(Foodlist[i].contains(food))
            {
		
			System.out.println("your order is booked!!");
			break;
		}
		else
		{
		throw new NotAvaiableException(" Sorry! your order is cancled");
		}
	}
	}
	public static void main(String []args)
	{
		FoodOrder ref=new FoodOrder();
		
		Scanner sc=new Scanner(System.in);
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

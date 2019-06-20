package Payment;

import java.util.Arrays;
import java.util.Scanner;

import FoodOrder.FoodOrder;
import FoodOrder.NotAvaiableException;

public class PaymentProcess
{
	public static void pay(int amount,int food_amount, String food,int ordertype)throws PaymentIncorrectException
	{
		if(ordertype==1)
		{
		  System.out.println("Your order is on the way!!!!");	
		}
		if(ordertype==2||ordertype==3)
		{
		if(food_amount<=amount&&Arrays.asList("idly","dhosa","curd rice","chappati").contains(food))
		{
			
			if(ordertype==2||ordertype==3)
			{
			System.out.println("Thank you!!Your Order on the way!!!");
			}
		}else {
			
			
				throw new PaymentIncorrectException("Please check your balance!!!");
		}
		}
	}

	public static void main(String[] args) 
	{
		FoodOrder re=new FoodOrder();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your order here");
		String food = scan.next();
		System.out.println("Enter your Payment type");
		System.out.println("1.Cash Payment");
		System.out.println("2.Creditcard Payment");
		System.out.println("3.Debitcard Payment");
		System.out.println("Enter your Order Type");
		int ordertype=scan.nextInt();
				
		switch(ordertype)
		{
		case 1:
			 System.out.println("Cash Payment");
			 break;
		case 2:
			System.out.println("Creditcard Payment");
			break;
		case 3:
			System.out.println("Debitcard Payment");
			break;
		}
        System.out.println("Payment Here:");
		int amount=scan.nextInt();
		
		
		try

		{
			re.swiggy(food);

		} catch (NotAvaiableException e)

		{
			e.printStackTrace();

		}
		
		try
		{
			pay(amount,100,food,ordertype);
		}catch(PaymentIncorrectException e)
		{
			e.printStackTrace();
		}
		
	}
}

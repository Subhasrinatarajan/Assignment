package Payment;

import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Logger;

import FoodOrder.FoodOrder;
import FoodOrder.NotAvaiableException;

public class PaymentProcess
{
	static final Logger l=Logger.getLogger("PaymentProcess");
	public static void pay(int amount,int food_amount, String food,int ordertype)throws PaymentIncorrectException
	{
		if(ordertype==1)
		{
			l.info("Your order is on the way!!!!");	
		}
		if(ordertype==2||ordertype==3)
		{
		if(food_amount<=amount&&Arrays.asList("idly","dhosa","curd rice","chappati").contains(food))
		{
			
			if(ordertype==2||ordertype==3)
			{
				l.info("Thank you!!Your Order on the way!!!");
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
		l.info("Enter your order here");
		String food = scan.next();
		l.info("Enter your Payment type");
		l.info("1.Cash Payment");
		l.info("2.Creditcard Payment");
		l.info("3.Debitcard Payment");
		int ordertype=scan.nextInt();
				
		switch(ordertype)
		{
		case 1:
			l.info("Cash Payment");
			 break;
		case 2:
			l.info("Creditcard Payment");
			break;
		case 3:
			l.info("Debitcard Payment");
			break;
		}
		l.info("Payment Here:");
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

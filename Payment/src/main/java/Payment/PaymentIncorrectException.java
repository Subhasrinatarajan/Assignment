package Payment;

public class PaymentIncorrectException extends Exception
{
   public PaymentIncorrectException(String message)
   {
	   super(message);
   }
}

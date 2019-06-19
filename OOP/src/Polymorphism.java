import java.util.Scanner;

public class Polymorphism {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Name"+scan.next());
		System.out.println("Roll_no"+scan.nextLong());
		System.out.println("Phone_no"+scan.nextLong());
		System.out.println("cut_off"+scan.nextDouble());
		if(scan.nextDouble()<170)
		{
			System.out.println("Sorry Not Qualified");
		}else
		{
			System.out.println("Your Registration accepted");
		}

	}

}

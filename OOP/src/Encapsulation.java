class Demo
{
	private long Account_no;
	private String Account_holder_name;
	private long Account_holder_phone_no;
	private String Bank_name;
	private String Bank_branch;
	public long getbkAccount_no()
	{
		return Account_no;
	}
	public void setbkAccount_no(long i)
	{
		Account_no=i;
	}
	public long getbkAccount_holder_pno()
	{
		return Account_no;
	}
	public void setbkAccount_holder_pno(long i)
	{
		Account_holder_phone_no=i;
	}
	 void transact()
	{
		String  str=""+Account_no;
		String str2=""+Account_holder_phone_no;
		if(str.length()==15)
		{
			if(str2.length()==10)
			{
				System.out.println("your Transaction successful");
			}
		}else
		{
			System.out.println("your Transaction Failed");
		}
	}
}
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Demo ref=new Demo();
       ref.setbkAccount_no(76757666666666l);
       ref.setbkAccount_holder_pno(657686757l);
       ref.transact();
	}

}

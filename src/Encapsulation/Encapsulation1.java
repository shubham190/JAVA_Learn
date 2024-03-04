package Encapsulation;

public class Encapsulation1 {
	
	
	/*public int Accountno=123;
	public  double amount=95000;
	public int pinno=234;
	*/
	
	public int Accountno=123;
	private  double amount=95000;
	private int pinno=234;
	
	public void withdraw(int Accno, int pin,double balance)
	{
		if(Accno==Accountno && pin==pinno)
		{
			if(balance<amount)
			{
				amount=amount-balance;
				System.out.println("Amount withdraw : " +balance );
			}
			else
			{
				System.out.println("Insufficent Balance");
			}
		}
		else
		{
			System.out.println(" Invalid Customer verification ");
		}
	}
	
	public void updatepin(int actno, int oldpin,int newpin)
	{
		if(actno==Accountno && oldpin==pinno)
		{
			pinno=newpin;
			System.out.println("Pin no sucessfully");
			
		}
		else
		{
			System.out.println("Invalid credentials");
		}
	}
	
	public double depositcash(int accNo ,int pin, double balamount)
	{
		if(accNo==Accountno && pin==pinno)
		{
			amount =amount+balamount;
			return amount;
		}
		else
		{
			System.out.println("Invalid cred");
			return amount;
		}
			
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

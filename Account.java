public class Account
{
	private String name;
	private double balance;

	public class Account(String sName,double sBlanance)
	{
		this.name = sName;
		if(sBlanance > 0.0)
		{
			this.balance = sBlanancE;
		}
	}


	public void deposit(double depositAmount)
	{
		if(depositAmount > 0.0)
		{
			this.balance+=depositAmount;
		}
	}

	public double getBalance()
	{
		return this.balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String sName) {
		this.name = sName;
	}
}
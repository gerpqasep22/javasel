package sep22.day6.PolymorphismAbstractionArray;

public class LearnMethodOverLoading {
	
	public void savingAccount(String accountname) 
	{
		System.out.println("AccountName is: " + accountname);		
	}
	
	public void savingAccount(String accountname, int accnumber) 
	{
		System.out.println("AccountName is: " + accountname + "and his AccountNumber is: "+ accnumber);		
	}
	
	public void savingAccount(int accnumber, long accbalance) 
	{
	 System.out.println("AccountNumber is: " + accnumber + "and his AccountBalance is: "+ accbalance);
	}
	
	public void savingAccount(int accnumber, String secondaryaccount) 
	{
		System.out.println("AccountNumber is: " + accnumber + "and his secondaryAccount is: "+ secondaryaccount);
		
	}

	public static void main(String[] args) {
		
		LearnMethodOverLoading lmol = new LearnMethodOverLoading();
		lmol.savingAccount("Sudhakar");
		lmol.savingAccount(10111, "Spose of Sudhakar");
		lmol.savingAccount(10111, 10000L);
		lmol.savingAccount("Sudhakar", 10111);
	}

}

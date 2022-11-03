package sep22.day6.PolymorphismAbstractionArray;

public class HDFC extends RBI{
	
	@Override
	public void savingsAccount(int savingsinterest)
	{
		System.out.println("savingsinterest :" + savingsinterest);
	}
	
	@Override
	public void checkingAccount(int checkinginterest)
	{
		System.out.println("checkinginterest :" + checkinginterest);
	}
	
	@Override
	public void loanAccount(int loaninterest)
	{
		System.out.println("loaninterest :" + loaninterest);
	}

	public static void main(String[] args) {
		HDFC hdfc = new HDFC();
		hdfc.savingsAccount(7);
		hdfc.savingsAccount(10);
		hdfc.savingsAccount(11);

	}

}

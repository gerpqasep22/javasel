package sep22.day6.PolymorphismAbstractionArray;

public class RBI {

	public void savingsAccount(int savingsinterest)
	{
		System.out.println("savingsinterest :" + savingsinterest);
	}
	
	public void checkingAccount(int checkinginterest)
	{
		System.out.println("checkinginterest :" + checkinginterest);
	}
	
	public void loanAccount(int loaninterest)
	{
		System.out.println("loaninterest :" + loaninterest);
	}
	
	public void goldLoan()
	{
		System.out.println("RBI - Gold Loan");
	}
	
	public static void main(String[] args) {
		RBI rbi = new RBI();
		rbi.savingsAccount(7);
		rbi.checkingAccount(10);
		rbi.loanAccount(12);
		

	}

}

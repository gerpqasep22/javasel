package sep22.day6.PolymorphismAbstractionArray;

public class ICICIBank extends RBI {

	@Override
	public void savingsAccount(int savingsinterest)
	{
		System.out.println("savingsinterest :" + savingsinterest);
	}
	
	//@Overload - savingsAccount method is overload within the same class, same method name and different arg
	public void savingsAccount(int pen, String penname)
	{
		System.out.println(pen + "and " + penname);
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
		ICICIBank icici = new ICICIBank();
		icici.savingsAccount(5);
		icici.checkingAccount(8);
		icici.savingsAccount(10);
	}

}

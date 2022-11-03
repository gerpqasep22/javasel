package sep22.day6.PolymorphismAbstractionArray;

public class IndianGovt extends FinanceMinistry  implements MobileFullAbstraction, AndroidPhoneInterface{

	@Override
	public void disasterLoan() {
		System.out.println("This is disaster Loan - IndianGovt");
		
	}

	@Override
	public void budget() {
		System.out.println("This is budget - IndianGovt");
		
	}
	
	public void ministry()
	{
		System.out.println("THis is Ministry of IndianGovt");
	}
	
	public void takeVideo() {
		System.out.println("This is takeVideo");
		
	}

	public void touchScreen() {
		System.out.println("This is touchScreen");
		
	}
	
	public static void main(String[] args)
	{
		IndianGovt ig = new IndianGovt();
		ig.disasterLoan();
		ig.budget();
		ig.ministry();
		ig.goldLoan();
		ig.security();
		ig.takeVideo();
		ig.touchScreen();
		ig.goldLoan();
	}

	

}

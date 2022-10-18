package sep22.day2.operatorsandcontrolstatements;

public class LearnConditionalStatements {
	
	public void lessThan(int a, int b)
	{
		if (a<b)
			System.out.println(a +" is lesser than " + b);
		
		else if (a>b)
			System.out.println(a +" is greater than " + b);
		
		else
			System.out.println(a +" is equal to " + b);
	}
	

	public static void main(String[] args) {
		LearnConditionalStatements Lcs = new LearnConditionalStatements();
		Lcs.lessThan(10, 20);
		Lcs.lessThan(30, 10);
		Lcs.lessThan(100, 100);
		

	}

}

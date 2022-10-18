package sep22.day1.IntroJava;

public class Car {
	
	//accessSpecifier not/returnType methodName()
	public void applyBrake()
	{
		System.out.println("Applying Brake");
		
	}

	public static void main(String[] args) {
		//Object should be created under the main method
		
		//Syntax: ClassName ObjectName = new ClassName();
		
		Car Toyota = new Car();
		
		//ObjectName.methodName();
		Toyota.applyBrake();
		

	}

}

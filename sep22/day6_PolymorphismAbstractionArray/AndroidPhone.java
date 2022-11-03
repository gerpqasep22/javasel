package sep22.day6.PolymorphismAbstractionArray;

public class AndroidPhone implements MobileFullAbstraction{
	
	public void takeVideo() {
		System.out.println("This is implemented Method from Interface: This is take Video");
		
	}

	
	public void textMessage()
	{
		System.out.println("THis is AndroidPhone Method: TextMessage ");
	}

	public static void main(String[] args) {
		AndroidPhone android = new AndroidPhone();
		android.takeVideo();
		android.touchScreen();
		android.textMessage();

	}


	public void touchScreen() {
		System.out.println("This is implemented Method from Interface: This is Touch Screen");
		
	}
	
	

	
}

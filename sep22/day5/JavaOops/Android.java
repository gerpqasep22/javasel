package sep22.day5.JavaOops;

public class Android extends Mobile {

	public void fingerPrint()
	{
		System.out.println("FingerPrint Recognition");
	}
	
	public static void main(String[] args) {
		Android android = new Android();
		android.fingerPrint();
		android.makeCall();
		android.sendMessage();
		

	}

}

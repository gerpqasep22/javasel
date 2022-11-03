package sep22.day5.JavaOops;

public class Tablet extends Apple {

	public void faceTime()
	{
		System.out.println("FaceTime");
	}
	public static void main(String[] args) {
		Tablet tablet = new Tablet();
		tablet.sendMessage();
		tablet.makeCall();
		tablet.faceRecognition();
		tablet.faceTime();
	}

}

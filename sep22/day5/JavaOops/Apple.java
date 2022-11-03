package sep22.day5.JavaOops;

public class Apple extends Mobile {

	public void faceRecognition()
	{
		System.out.println("Face Recognition");
	}
	
	public static void main(String[] args) {
		Apple apple = new Apple();
		
		apple.sendMessage();
		apple.makeCall();
		apple.faceRecognition();

	}

}

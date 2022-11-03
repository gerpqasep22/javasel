package sep22.day5.JavaOops;

import jul22.week1.day1.Car;

public class Mobile extends Car{

	public void makeCall() 
	{
		System.out.println("Make Call");
	}
	
	public void sendMessage()
	{
		System.out.println("Send Message");
	}
	
	public static void main(String[] args) {
		Mobile mobile = new Mobile();
		mobile.makeCall();
		mobile.sendMessage();	
	}
}

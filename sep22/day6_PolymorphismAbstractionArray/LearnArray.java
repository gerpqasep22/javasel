package sep22.day6.PolymorphismAbstractionArray;

import java.util.Arrays;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class LearnArray {

	
	public static void main(String[] args) {
	
	//int[] a= new int[5];
	//a[0]=10;
	//a[1]=20;
	//a[2]=30;
	//a[3]=40;
	//a[4]=50;
	//a[5]=60;
		
	int[] a= {90,50,80,30,20,10};
	
	System.out.println(a.length);
	int lastIndex = a[(a.length)-1];
System.out.println(lastIndex);
Arrays.sort(a);
	for(int i=a.length-1; i>=0; i--)
	{
	//System.out.println("Printing the index values");
		//System.out.println(a[i]);
		
		//System.out.println("Printing in Ascending order after Arrays.sort");
		System.out.println(a[i]);
		}
	}
	
	
	
	
}

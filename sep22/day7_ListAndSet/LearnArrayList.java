package sep22.day7_ListAndSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnArrayList {

	public static void main(String[] args) {
		
		//Interface cannot have Object
		//List<> reference = new ArrayList<>();
		
		//int[] a = new int[10];
		
		List<Double> listValues = new ArrayList<Double>();
		
		System.out.println(listValues.size());
		
		System.out.println(listValues.add(100.00)); //index 0
		listValues.add(500.04);
		listValues.add(200.01);
		listValues.add(400.03);
		listValues.add(300.02);
		listValues.add(600.05);
		System.out.println(listValues.add(100.00));
		
		System.out.println(listValues.size());
		
		System.out.println(listValues.get(2));
		
		Collections.sort(listValues);
		
		System.out.println("=========Before Removing a value===========");
		for(int i=0; i<listValues.size(); i++)
		{
			
			System.out.println(listValues.get(i));
		}
		
		
	
		
		listValues.remove(4);
		System.out.println(listValues.size());
		
		System.out.println("=========After Removing a value===========");
		for(int j=0; j<listValues.size(); j++)
		{
			
			System.out.println(listValues.get(j));
		}
	}

}

package sep22.day7.ListAndSet;


import java.util.Set;
import java.util.TreeSet;

public class LearnTreeSet {

	public static void main(String[] args) 
	{
		Set<String> setValues = new TreeSet<String>();
	
	System.out.println(setValues.size());
	
	boolean firstValue = setValues.add("!Nur");
	System.out.println(firstValue);
	System.out.println(setValues.add("faisal"));
	System.out.println(setValues.add("Ami"));
	System.out.println(setValues.add("amisha"));
	System.out.println(setValues.add("Ritu"));
	System.out.println(setValues.add("Sudhakar"));
	System.out.println(setValues.add("Ritu"));
	
	System.out.println(setValues.size());
	
	
	/*
	 * setValues.remove(2); System.out.println(setValues.size());
	 */
	 
	//foreach Ctrl+space+Enter
	for (String insertValues: setValues) {
		System.out.println(insertValues);
		
	}

}

}
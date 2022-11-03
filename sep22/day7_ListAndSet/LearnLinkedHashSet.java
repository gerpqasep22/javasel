package sep22.day7.ListAndSet;


import java.util.LinkedHashSet;
import java.util.Set;

public class LearnLinkedHashSet {

	public static void main(String[] args) 
	{
	Set<String> setValues = new LinkedHashSet<String>();
	
	System.out.println(setValues.size());
	
	boolean firstValue = setValues.add("Nur");
	System.out.println(firstValue);
	System.out.println(setValues.add("Faisal"));
	System.out.println(setValues.add("Ami"));
	System.out.println(setValues.add("Amisha"));
	System.out.println(setValues.add("Ritu"));
	System.out.println(setValues.add("Sudhakar"));
	System.out.println(setValues.add("Ritu"));
	
	System.out.println(setValues.size());
	
	setValues.remove(4);
	System.out.println(setValues.size());
	
	//foreach Ctrl+space+Enter
	for (String insertValues: setValues) {
		System.out.println(insertValues);
		
	}

}

}
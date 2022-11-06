package sep22.day7_ListAndSet;

import java.util.ArrayList;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LearnCopyingSetToList {

	public static void main(String[] args) {
		Set<String> setValues = new LinkedHashSet<String>();
		
		System.out.println(setValues.size());
		
		setValues.add("Nur");
		setValues.add("Faisal");
		setValues.add("Ami");
		setValues.add("Amisha");
		setValues.add("Ritu");
		setValues.add("Sudhakar");
		setValues.add("Ritu");
		
		System.out.println(setValues.size());
		List<String> listValues = new ArrayList<String>(setValues);
		
		
		System.out.println(listValues.get(2));
		
		System.out.println("====================");
		
		setValues.remove(2);
		System.out.println(setValues.size());
		
		//foreach Ctrl+space+Enter
		for (String insertValues: setValues) {
			System.out.println(insertValues);
			
		}

	}

}

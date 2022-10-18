package sep22.day2.operatorsandcontrolstatements;

public class LearnPassingArguments {
	
	//ctrl+space+enter
	public void student(String name, int roll_no, char sex) {
		System.out.println("Student:" +name + " roll_no: "+ roll_no + "sex: " +sex);
		
	}
	
	public static void main(String[] args) {
		
		LearnPassingArguments lpa = new LearnPassingArguments();
		lpa.student("Sudhakar", 101,  'M');
		lpa.student("Aarti", 102, 'F');
		
	}

}

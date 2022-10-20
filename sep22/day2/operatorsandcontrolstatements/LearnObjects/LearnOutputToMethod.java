package sep22.day2.LearnObjects;

public class LearnOutputToMethod {
	
	//void will not return value
	public void getEmployeeName(String empName, int empId) {
		System.out.println("Details of the employee is: " + empName + " and his empId is: " +empId);
	}
	
	public String getEmployeeAddress()
	{
		return "Tanvinder";
	}

	public static void main(String[] args) {
		LearnOutputToMethod lom = new LearnOutputToMethod();
		lom.getEmployeeName("Sudhakar", 101);
		System.out.println(lom.getEmployeeAddress());
		
		
	}

}

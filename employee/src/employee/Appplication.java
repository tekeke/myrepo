package employee;

public class Appplication {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		
		emp1.firstName = "Peter";
		emp1.lastName = "Müller";
		
		emp1.printFullName(emp1.firstName , emp1.lastName);

	}

}

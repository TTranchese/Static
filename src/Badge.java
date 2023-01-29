public class Badge {
	private static int  totalNumberOfEmployees;
	private String badgeIdCode;
	public Employee employee;

	private static void  keepTrackOfEmployeesNumber(){
		totalNumberOfEmployees+=1;
	}
	private String generateBadgeIdCode(){
		return "XYZ"+employee.name+employee.surname+"XYZ";
	}
	public void showBadgeDetails(){
		System.out.println(totalNumberOfEmployees);
		System.out.println(employee.getEmployeeDetails());
		System.out.println(badgeIdCode);
	}
	public Badge(Employee employeeThatNeedsBadge){
		keepTrackOfEmployeesNumber();
		this.employee=employeeThatNeedsBadge;
		this.badgeIdCode=generateBadgeIdCode();
	}
}

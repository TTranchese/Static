public class Employee {
	public String name;
	public String surname;
	public String address;

	// constructor
	public Employee(String name, String surname, String address) {
		this.name = name;
		this.surname = surname;
		this.address = address;
	}

	//prints details
	public String getEmployeeDetails() {
		return "Name: " + this.name + " Surname: " + this.surname + " Address: " + this.address;
	}
}

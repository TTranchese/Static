public class Tester {
	public static void main(String[] args) {
		Employee employee1 = new Employee("Tommaso",  "Tranchese", "Piazzetta San Pinco Pallino");
		Employee employee2 = new Employee("Gigi",  "Coppola", "Via Ponzio Pilato");

		Badge badge1 = new Badge(employee1);
		Badge badge2 = new Badge(employee2);

		badge1.showBadgeDetails();
		badge2.showBadgeDetails();
	}
}
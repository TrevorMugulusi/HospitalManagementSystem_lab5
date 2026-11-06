
package hospital;

public class MainDriver {

	public static void main(String[] args) {

		Doctor doctor = new Doctor(1, "John", 40, "General", 100);
		Nurse nurse = new Nurse(2, "Mary", 30, "Emergency", "Day");
		Surgeon surgeon = new Surgeon(3, "David", 45, "Surgery", 200, "Heart", 5);
		EmergencyDoctor emergency = new EmergencyDoctor(4, "Sarah", 35, "Emergency", 150);

		System.out.println("=== HOSPITAL MANAGEMENT SYSTEM ===");

		System.out.println("\n--- Doctor ---");
		doctor.displayDetails();
		doctor.diagnosePatient();
		doctor.performDuties();

		System.out.println("\n--- Nurse ---");
		nurse.displayDetails();
		nurse.assistPatient();
		nurse.performDuties();

		System.out.println("\n--- Surgeon ---");
		surgeon.displayDetails();
		surgeon.performSurgery();
		surgeon.performDuties();

		System.out.println("\n--- Emergency Doctor ---");
		emergency.displayDetails();
		emergency.handleEmergency();
		emergency.performDuties();
		emergency.prescribeMedication();
		emergency.generateBill();

		System.out.println("\n=== POLYMORPHISM ===");

		Person person;

		person = doctor;
		person.performDuties();

		person = nurse;
		person.performDuties();

		person = surgeon;
		person.performDuties();

		person = emergency;
		person.performDuties();
	}
}

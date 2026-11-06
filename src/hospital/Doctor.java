
package hospital;

public class Doctor extends Person {

	private String specialization;
	private double consultationFee;

	public Doctor(int personId, String name, int age, String specialization, double consultationFee) {

		super(personId, name, age);
		this.specialization = specialization;
		this.consultationFee = consultationFee;
	}

	public void diagnosePatient() {
		System.out.println(getName() + " is diagnosing a patient.");
		System.out.println("Specialization: " + specialization);
		System.out.println("Consultation Fee: $" + consultationFee);
	}

	@Override
	public void performDuties() {
		System.out.println(getName() + " is examining and treating patients.");
	}
}

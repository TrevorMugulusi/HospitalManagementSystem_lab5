
package hospital;

public class Surgeon extends Doctor {

	private String surgeryType;
	private int operatingRoom;

	public Surgeon(int personId, String name, int age, String specialization, double consultationFee,
			String surgeryType, int operatingRoom) {

		super(personId, name, age, specialization, consultationFee);
		this.surgeryType = surgeryType;
		this.operatingRoom = operatingRoom;
	}

	public void performSurgery() {
		System.out.println(getName() + " is performing " + surgeryType + " surgery in room " + operatingRoom);
	}

	@Override
	public void performDuties() {
		System.out.println(getName() + " is performing surgical duties.");
	}
}

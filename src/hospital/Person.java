
package hospital;

public class Person {
	private int personId;
	private String name;
	private int age;

	public Person(int personId, String name, int age) {
		this.personId = personId;
		this.name = name;
		this.age = age;
	}

	public void displayDetails() {
		System.out.println("Person ID: " + personId);
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}

	public void performDuties() {
		System.out.println(name + " is performing hospital duties.");
	}

	public String getName() {
		return name;
	}
}

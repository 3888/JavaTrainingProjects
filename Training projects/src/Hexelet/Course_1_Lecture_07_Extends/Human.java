package Hexelet.Course_1_Lecture_07_Extends;
public class Human {

	//private static final String N_A = "N/A";
	private final String name;
	private int age = 0;

//	public Human() {
	//	name = N_A;
		//System.out.println("In default constructor");
//	}

	public Human(String name) {
		this.name = name;
		System.out.println("In Human");
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void birthDay() {
		age++;

	}
}
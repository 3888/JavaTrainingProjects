package Hexelet.Course_1_Lecture_06_Constructors;
public class Main {

	public static void main(String[] args) {
		Field field = new Field();
		field.eraseField();
		field.showField();
		field.showField();

		field = new Field(5);
		field.eraseField();
		field.showField();
		field.showField();
	}
}
// field.setFieldSize(10);
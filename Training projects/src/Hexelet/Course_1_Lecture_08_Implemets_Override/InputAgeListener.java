package Hexelet.Course_1_Lecture_08_Implemets_Override;
import Hexelet.Course_1_Lecture_08_ui.IOnStringInput;


public class InputAgeListener implements IOnStringInput {

	@Override
	public void onStringInput(String input) {
		// TODO Auto-generated method stub
		System.out.println("Your age is:" + input);
	}

}

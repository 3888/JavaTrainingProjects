package hexeletUniversity.Course_1_Lecture_08_Implemets_Override;
import hexeletUniversity.Course_1_Lecture_08_ui.IOnStringInput;


public class StringListener implements IOnStringInput {
   
	@Override
	public void onStringInput(String input) {
		
		System.out.println("User input:" + input);
	}

}

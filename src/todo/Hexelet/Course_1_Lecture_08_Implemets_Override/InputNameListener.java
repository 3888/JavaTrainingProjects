package todo.Hexelet.Course_1_Lecture_08_Implemets_Override;


import todo.Hexelet.Course_1_Lecture_08_ui.IOnStringInput;

public class InputNameListener  implements IOnStringInput {

	@Override
	public void onStringInput(String input) {
System.out.println("Your name is:" + input);
		
	}

}

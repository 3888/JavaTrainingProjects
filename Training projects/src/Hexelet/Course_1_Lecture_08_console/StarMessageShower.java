package Hexelet.Course_1_Lecture_08_console;
import Hexelet.Course_1_Lecture_08_ui.IOnStringInput;

public class StarMessageShower extends ConsoleMessageShower {

	private static final char SYMBOL = '*';

	public StarMessageShower(String message, IOnStringInput onStringInput) {
		super(message, SYMBOL, onStringInput );
	}   

//	@Override
//	public void show() {
//		showLine(); 
//		super.show();
//		showLine();
//	}
//
//	// System.out.println(getMessage());
//	// System.out.println (getMessage());
//
//	private void showLine() {
//		for (int i = 0; i < getMessage().length(); i++)
//		 	System.out.print(SYMBOL);
//		System.out.println();
//	}
}

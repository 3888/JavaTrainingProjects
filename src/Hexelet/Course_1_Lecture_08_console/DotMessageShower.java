package Hexelet.Course_1_Lecture_08_console;


import Hexelet.Course_1_Lecture_08_ui.IOnStringInput;

public class DotMessageShower extends ConsoleMessageShower {
	private static final char SYMBOL = '.';
	public DotMessageShower(String message, IOnStringInput onStringInput) {
		super(message, SYMBOL, onStringInput);
	}
}
//	}	@Override 
//	public void show(){
//	System.out.println(".......");
//	super.show();
//	//System.out.println(getMessage());
//	System.out.println(".......");
//	}
//}
	
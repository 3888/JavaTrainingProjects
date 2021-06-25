package todo.Hexelet.Course_1_Lecture_08_Implemets_Override;

import todo.Hexelet.Course_1_Lecture_08_console.DotMessageShower;
import todo.Hexelet.Course_1_Lecture_08_console.StarMessageShower;
import todo.Hexelet.Course_1_Lecture_08_ui.MessageShower;

public class Main {
	public static void main(String[] args) {
	 
		//new MessageShower("Hello Java!").showStars();
		//MessageShower messageShower = new StarMessageShower("Hello hello Java");
		//messageShower.show();
		StringListener stringListener = new StringListener();
		showMessage(new StarMessageShower("What is your name?", new InputNameListener()));
		showMessage(new DotMessageShower("What is your age?", new InputAgeListener()));
		//showMessage(new MessageShower("Hello Java"));
		//showMessage(new DotMessageShower("Hello hello Java@@@@@@"));
	//	showMessage(new MessageShower("Hello Java"));
	}
	
	
	private static void showMessage(MessageShower ms){
		ms.show();
	//private void showMessage(MessageShower messageShower) {
	//	messageShower.show();
	}
}


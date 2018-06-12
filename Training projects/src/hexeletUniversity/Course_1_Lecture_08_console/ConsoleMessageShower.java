package hexeletUniversity.Course_1_Lecture_08_console;

import hexeletUniversity.Course_1_Lecture_08_ui.IOnStringInput;
import hexeletUniversity.Course_1_Lecture_08_ui.MessageShower;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class ConsoleMessageShower extends MessageShower {

	private final char symbol;

	public ConsoleMessageShower(String message, char symbol,
			IOnStringInput onStringInput) {
		super(onStringInput, message);
		this.symbol = symbol;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void show() {
		showLine();
		System.out.println(getMessage());
		showLine();
		inputString();
	}

	private void inputString() {
		InputStreamReader bufferedInputReader = new InputStreamReader(in);
		BufferedReader bufferedReader = new BufferedReader(bufferedInputReader);
		try {
			String stringFromUser = bufferedReader.readLine();
			getOnStringInput().onStringInput(stringFromUser);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void showLine() {
		for (int i = 0; i < getMessage().length(); i++)
			System.out.print(symbol);
		System.out.println();
	}
}

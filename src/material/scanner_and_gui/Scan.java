package material.scanner;

import java.util.Scanner;

public class Scan {
	int x;

	public void Scan() {
		System.out.println("Если Майкл весит");
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		System.out.println("Тогда Джордж весит " + (x + 1) + " кг");

	}

}

package gui;
public class Main {
	public static void main(String args[]) {
		GUI o = new GUI();
		o.Scan();
		int y;
		y = o.x + 1;
		System.out.println("Если их не кормить: ");
		o.x = count(o.x);
		
		System.out.println("Вес Майкла = " + o.x + " кг");
		y = count(y);
		System.out.println("Вес Джорджа =  " + y + " кг");

	}

	private static int count(int z) {
		z = z - 1;
		return z;
	}
}


package TrainingProjects.gui;
public class Main {
	public static void main(String args[]) {
		GUI o = new GUI();
		o.Scan();
		int y;
		y = o.x + 1;
		System.out.println("���� �� �� �������: ");
		o.x = count(o.x);
		
		System.out.println("��� ������ = " + o.x + " ��");
		y = count(y);
		System.out.println("��� ������� =  " + y + " ��");

	}

	private static int count(int z) {
		z = z - 1;
		return z;
	}
}


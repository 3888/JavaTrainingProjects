package todo.TrainingProjects.gui;
import javax.swing.JOptionPane;

public class GUI {
	int x;
String a;
	public void Scan() {
		a = JOptionPane.showInputDialog("���� ����� �����");
		x = Integer.parseInt(a);
		JOptionPane.showMessageDialog(null, "����� ������ ����� " + (x + 1) + " ��");
		}

}

package gui;
import javax.swing.JOptionPane;

public class GUI {
	int x;
String a;
	public void Scan() {
		a = JOptionPane.showInputDialog("Если Майкл весит");
		x = Integer.parseInt(a);
		JOptionPane.showMessageDialog(null, "Тогда Джордж весит " + (x + 1) + " кг");
		}

}

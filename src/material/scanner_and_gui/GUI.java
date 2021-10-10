package material.scanner_and_gui;

import javax.swing.*;

public class GUI {
	int x;
String a;
	public void Scan() {
		a = JOptionPane.showInputDialog("���� ����� �����");
		x = Integer.parseInt(a);
		JOptionPane.showMessageDialog(null, "����� ������ ����� " + (x + 1) + " ��");
		}

}

import javax.swing.*;
import java.awt.event.*;
import javax.swing.*;

import java.awt.event.*;	//�̺�Ʈ ó���� ���� ��Ű�� 

class MyFrame3 extends JFrame implements ActionListener {
	private JButton button;
	private JLabel label;

	public MyFrame3() {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("�̺�Ʈ ����");

		JPanel panel = new JPanel();
		button = new JButton("��ư�� �����ÿ�");
		label = new JLabel("���� ��ư�� �������� �ʾҽ��ϴ�");
		button.addActionListener(this);	
		panel.add(button);
		panel.add(label);

		this.add(panel);
		this.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			label.setText("��ħ�� ��ư�� ���������ϴ�.");
		}
	}
	
}

public class ActionEventTest3 {
	public static void main(String[] args) {
		MyFrame3 t = new MyFrame3();
	}
}

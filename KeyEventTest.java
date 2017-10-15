import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class KeyEventTest extends JFrame implements KeyListener {
	private JPanel panel;
	private JTextField field;
	private JTextArea area;
	public KeyEventTest() {
		panel = new JPanel(new GridLayout(0, 2));
		panel.add(new JLabel("���ڸ� �Է��Ͻÿ�: "));
		field = new JTextField(10);
		panel.add(field);
		area = new JTextArea(3, 30);
		add(panel, BorderLayout.NORTH);
		add(area, BorderLayout.CENTER);
		field.addKeyListener(this);
		setTitle("KeyEvent Test");
		setSize(400, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new KeyEventTest(); 
	}
	public void keyTyped(KeyEvent e) { // (3)
		display(e, "Key Typed ");
	}
	public void keyPressed(KeyEvent e) {
		display(e, "Key Pressed ");
	}
	public void keyReleased(KeyEvent e) {
		display(e, "Key Released ");
	}
	protected void display(KeyEvent e, String s) {
		char c = e.getKeyChar();
		int keyCode = e.getKeyCode();
		String modifiers = "Alt: " + e.isAltDown() + "Ctrl: "
				+ e.isControlDown() + "Shift: " + e.isShiftDown();
		area.append("" + s + "���� " + c + "(�ڵ�: " + keyCode + ") " + modifiers
				+ "\n");
	}

public void keyTyped1(KeyEvent e) { // (3)
    display(e, "KeyTyped ");
}

public void keyPressed1(KeyEvent e) {
    display(e, "KeyPressed ");
}

public void keyReleased1(KeyEvent e) {
    display(e, "Key Pressed ");
}

protected void display1(KeyEvent e, String s) {
    char c = e.getKeyChar();
    int keyCode = e.getKeyCode();
    String modifiers = e.isAltDown() + " " + e.isControlDown() + " "
                  + e.isShiftDown();
    System.out.println(s + " " + c + " " + keyCode + " " + modifiers);
}
}



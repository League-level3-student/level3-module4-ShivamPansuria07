package _03_Hangman;

import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Hangman implements KeyListener{
	JLabel label = new JLabel();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	char key;
	public static void main(String[] args) {
		new Hangman().run();
	}

	void run() {
		int count = 0;
		Stack<String> dict = new Stack<String>();
		String num = JOptionPane.showInputDialog("Enter a number");
		int aws = Integer.parseInt(num);
		frame.add(panel);
		frame.add(label);
		frame.setVisible(true);
		frame.setSize(300, 200);
		label.setHorizontalAlignment(JLabel.CENTER);
		while (count < aws) {
			String str = Utilities.readRandomLineFromFile("dictionary.txt");
			dict.push(str);
			count += 1;
			System.out.println("running" + count);
		}
		String underscore = "";
		String underscoreF = "";
		String strpop = dict.pop();
		System.out.println(strpop);
		for (int i = 0; i < strpop.length(); i++) {
			underscore += i;
		}
		for (int i = 0; i < strpop.length(); i++) {
			if (!Character.isAlphabetic(underscore.indexOf(i))) {
				underscoreF+= "_" + " ";
			}
		}
		label.setText(underscoreF);
		for (int i = 0; i < strpop.length(); i++) {
			String strkey = Character.toString(key);  
			if(strpop.contains(strkey)) {
				System.out.println("pressed");
			}
		}
	}
//jkdsfzXC
	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		key = e.getKeyChar();
		
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}

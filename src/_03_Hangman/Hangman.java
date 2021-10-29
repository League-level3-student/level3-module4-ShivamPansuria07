package _03_Hangman;

import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Hangman implements KeyListener {
	JLabel label = new JLabel();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	String str;
	char key;

	public static void main(String[] args) {
		new Hangman().run();
	}
	//lsdafsadfasdf
	String strpop;
	String underscoreF;
	String underscore;
	String correctWord;
	String strkey;
	int lives =3;
	void run() {
		int count = 0;
		Stack<String> dict = new Stack<String>();
		String num = JOptionPane.showInputDialog("Enter a number");
		System.out.println("You have 3 lives, Good luck!");
		int aws = Integer.parseInt(num);
		frame.add(panel);
		frame.add(label);
		frame.setVisible(true);
		frame.setSize(300, 200);
		label.setHorizontalAlignment(JLabel.CENTER);
		frame.addKeyListener(this);
		while (count < aws) {
			String str = Utilities.readRandomLineFromFile("dictionary.txt");
			dict.push(str);
			count += 1;
		}
		underscore = "";
		underscoreF = "";
		strpop = dict.pop();
		System.out.println(strpop);
		for (int i = 0; i < strpop.length(); i++) {
			underscore += i;
		}
		for (int i = 0; i < strpop.length(); i++) {
			if (!Character.isAlphabetic(underscore.indexOf(i))) {
				underscoreF += "_";

			}
		}
		label.setText(underscoreF);

	}

//jkdsfzXC
	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		key = e.getKeyChar();
		strkey = Character.toString(key);
		if (strpop.contains(strkey)) {
			for (int j = 0; j < strpop.length(); j++) {
				
				if (strpop.charAt(j)==strkey.charAt(0)) {
					underscoreF = underscoreF.substring(0, j) + strkey + underscoreF.substring(j+1);
					label.setText(underscoreF);

				} 
				

			}
		}else if (!strpop.contains(strkey)){
			if(lives>=1) {
				lives=lives-1;
			}
			
			System.out.println("You now have " + lives +" lives!");
			for (int i = 0; i < strpop.length(); i++) {
				if (lives<=0) {
					System.out.println("You Lose!");
				}
					

				}
			
		}
		

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}

package _00_IntroToStacks;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class _02_TextUndoRedo implements ActionListener, KeyListener, InputMethodListener {
	
    /* 
     * Create a JFrame with a JPanel and a JLabel.
     * 
     *
     * Every time a key is pressed, add that character to the JLabel. It should
     * look like a basic text editor.
     * 
     * Make it so that every time the BACKSPACE key is pressed, the last
     * character is erased from the JLabel.
     * 
     * Save that deleted character onto a Stack of Characters.
     * 
     * Choose a key to be the Undo key. Make it so that when that key is
     * pressed, the top Character is popped  off the Stack and added back to
     * the JLabel.
     */
	public static void main(String[] args) {
		
		new _02_TextUndoRedo().run();
	}
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	String str = "";
	String s = "";
	String s2 = "";
	String s3 = "";
	String s4 = "";
	String laststr = "";
	int num = 0;
	void run(){
		
		frame.add(panel);
		frame.add(label);
		frame.setSize(300, 200);
		frame.setVisible(true);
		label.setVisible(true);
		frame.addKeyListener(this);
		label.setVisible(true);
		label.addKeyListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
	
	num+=1;
	if(num==1) {
		laststr = "" + e.getKeyChar();
		s = s + e.getKeyChar();
		s = s + str;
		label.setText(s);
	}else if(num == 2){
		laststr = "" + e.getKeyChar();
		s2  = s + e.getKeyChar();
		label.setText(s2); 
	}else if (num == 3) {
		laststr = "" + e.getKeyChar();
		s3  = s2 + e.getKeyChar();
		label.setText(s3); 
	}else {
		laststr = "" + e.getKeyChar();
		s4  = s3 + e.getKeyChar();
		label.setText(s4); 
	}
	if(e.getKeyCode()==8) {

		if (num == 1) {
			s.substring(s.length());
		}
		if (num == 2) {
			s2.substring(s.length());
		}
		if (num == 3) {
			s3.substring(s.length());
		}
		if (num == 4) {
			s4.substring(s.length());
		}
		
		System.out.println("f");
		
		Stack<String> flavors = new Stack<String>();
	}
	
	
	
	
		}
		
		
	
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void inputMethodTextChanged(InputMethodEvent event) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void caretPositionChanged(InputMethodEvent event) {
		// TODO Auto-generated method stub
		
	}

}

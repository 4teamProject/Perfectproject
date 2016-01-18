package project;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;

public class ClientMainForm extends JFrame implements ActionListener{
	Login login = new Login(); 
	WaitRoom wr = new WaitRoom();
	SignIn si = new SignIn();
	
	CardLayout card = new CardLayout();

	ClientMainForm () {
		setLayout(card); // default : borderLayout
		
		add("log", login);
		add("si", si);
		add("wr", wr);
		
		setSize(800,600);
		setTitle("To find the same picture");
		setVisible(true);
		setLocationRelativeTo(null);
		
		login.b1.addActionListener(this);
		login.b2.addActionListener(this);
		login.b3.addActionListener(this);
		
		si.b1.addActionListener(this);
		si.b2.addActionListener(this);
		
		wr.b6.addActionListener(this);
	}
	
	public static void main(String[] args){
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		} catch (Exception e){
			
		}
		
		new ClientMainForm ();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == login.b1){
            card.show(getContentPane(), "wr");
		} else if (e.getSource() == login.b2){
			System.exit(0);
		} else if (e.getSource() == login.b3){
			card.show(getContentPane(), "si");
		} else if (e.getSource() == si.b2) {
			card.show(getContentPane(), "log");
		} else if (e.getSource() == wr.b6){
			System.exit(0);
		} else if (e.getSource() == si.b1){
			boolean check = si.checkJoin();
			if (check){
				card.show(getContentPane(), "log");
			} else {

			}
		} 
	}
}

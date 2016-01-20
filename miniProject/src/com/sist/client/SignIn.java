package com.sist.client;

import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import javax.swing.*;
import java.io.*;

public class SignIn extends JPanel implements ActionListener{
	JLabel la1;
	JLabel la2;
	JLabel la3;
	JLabel la4;
	JLabel la5;
	
	JTextField tf1;
	JTextField tf2;
	
	JPasswordField pf1;
	JPasswordField pf2;
	
	JComboBox cb;
	
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	
	JPanel p1;
	JPanel p2;
	JPanel p3;
	
	String[] gender = {"MAN", "WOMAN"};
	Image img;
	
	boolean checkID = false;
	boolean checkPWD = false;

	
	SignIn(){
		img=Toolkit.getDefaultToolkit().getImage("images\\back1.jpg");
		
		la1 = new JLabel("NAME");
		la2 = new JLabel("ID");
		la3 = new JLabel("PWD");
		la4 = new JLabel("re_PWD");
		la5 = new JLabel("GENDER");
		
		la1.setForeground(Color.white);
		la2.setForeground(Color.white);
		la3.setForeground(Color.white);
		la4.setForeground(Color.white);
		la5.setForeground(Color.white);
		
		tf1 = new JTextField();
		tf2 = new JTextField();
		
		pf1 = new JPasswordField();
		pf2 = new JPasswordField();
		
		cb = new JComboBox(gender);
		
		b1 = new JButton("JOIN");
		b2 = new JButton("CANCEL");
		b3 = new JButton("CHECK");
		b4 = new JButton("CHECK");
		
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		
		p1.add(b1);
		p1.add(b2);
		p1.setOpaque(false); 
		
		p2.setLayout(new GridLayout(3,1));
		p2.add(b3);
		p2.add(p3);
		p2.add(b4);
		p2.setOpaque(false); 
		p3.setOpaque(false); 
		
		setLayout(null);
		
		la1.setBounds(150,110,100,30);
		la2.setBounds(150,145,100,30);
		la3.setBounds(150,180,100,30);
		la4.setBounds(150,215,100,30);
		la5.setBounds(150,250,100,30);
		
		tf1.setBounds(255, 110, 150, 30);
		tf2.setBounds(255, 145, 150, 30);
		
		pf1.setBounds(255, 180, 150, 30);
		pf2.setBounds(255, 215, 150, 30);
		
		cb.setBounds(255, 250, 150, 30);
		
		p1.setBounds(200, 285, 255, 30);
		p2.setBounds(410, 145, 80, 100);
		
		add(la1);
		add(la2);
		add(la3);
		add(la4);
		add(la5);
		add(tf1);
		add(tf2);
		add(pf1);
		add(pf2);
		add(cb);
		add(p1);
		add(p2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b3){
			String inputId = tf2.getText();
			String[] readFile = new String[50];
			int i = 0;
			
			if (inputId.equals("")){
				JOptionPane.showMessageDialog(null, "enter id");
				tf2.setText("");
			} else {
				try {
					BufferedReader br = new BufferedReader(new FileReader("c:\\img\\test.txt"));
					i = 0;
			        while(true) {
			            String line = br.readLine();
			            if (line==null) {
			            	break;
			            } else {
				            readFile[i] = line;
				            i++;
			            }
			        }
			        //br.close();
				} catch (Exception err){
					System.out.println(err);
				}
				
				for(int j = 0; j < readFile.length;  j++){
					System.out.println(readFile[j]);
				}
				
				String[] readId = new String[i];
				
		        for(int j = 0; j < readFile.length; j++){
		        	String[] str = new String[4];
		        	str = readFile[j].split(",");
		        	if(str[1].length() == 0){
		        		continue;
		        	}
		        	System.out.println(str[1]);
		        	readId[j] = str[1];
		        	
		        }
		        
		        for(int k = 0; k < readId.length; k++){		            
		        	if(inputId.equals(readId[k])){
		        		JOptionPane.showMessageDialog(null, "enter again");
		        	} else {
		        		JOptionPane.showMessageDialog(null, "continue next");
		        		checkID = true;
		        	}
		        }
			} 
		} else if (e.getSource() == b4){
			char[] pwd1 = pf1.getPassword();
			char[] pwd2 = pf2.getPassword();
			
			if (pwd1.length == 0){
				JOptionPane.showMessageDialog(null, "enter password");
			} else {
				if(pwd1 != null){
					if(Arrays.equals(pwd1, pwd2) == true){
						JOptionPane.showMessageDialog(null, "correct");
						checkPWD = true;
					} else {
						JOptionPane.showMessageDialog(null, "not correct");
					}
				}
			}
		} 
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
	}
	
	boolean checkJoin() {
		boolean check = false;

			if(tf1.getText().equals("")){
				JOptionPane.showMessageDialog(null, "enter name");
			}else if(checkID == false){
				JOptionPane.showMessageDialog(null, "check id");
			}else if(checkPWD == false){
				JOptionPane.showMessageDialog(null, "check password");
			}
			
			if (tf1.getText().length() > 0 && checkID == true && checkPWD == true ) {

				String result = tf1.getText() + "," + tf2.getText()+","+pf1.getPassword()+","+cb.getItemAt(cb.getSelectedIndex())+"\n";
				
				try {
					PrintWriter pw2 = new PrintWriter(new FileWriter("c:\\img\\test.txt", true));
					pw2.println(result);
					pw2.close();
				} catch (Exception err){
					System.out.println(err.getMessage());
				}
				check = true;
			}
			return check;
	}

}

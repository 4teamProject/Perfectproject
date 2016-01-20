package com.sist.client;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class Roomselect extends JPanel implements ActionListener{
    JLabel la1,la2,la3,la4;
    JTextField tf;
    JPasswordField pf;
    JRadioButton rb1,rb2;
    JComboBox box;
    JButton b1,b2;
    
    Image img;
    
    public Roomselect()
    {	
    	img=Toolkit.getDefaultToolkit().getImage("images\\back1.jpg");
    	
    	 la1=new JLabel("방이름");
    	 la2=new JLabel("상태");
    	 la3=new JLabel("비밀번호");
    	 la4=new JLabel("인원");
    	 la1.setForeground(Color.white);
    	 la2.setForeground(Color.white);
    	 la3.setForeground(Color.white);
    	 la4.setForeground(Color.white);
    	 
    	 tf=new JTextField();
    	 pf=new JPasswordField();
    	 
    	 rb1=new JRadioButton("공개");
    	 rb2=new JRadioButton("비공개");
    	 rb1.setOpaque(false);
    	 rb2.setOpaque(false);
    	 rb1.setForeground(Color.white);
    	 rb2.setForeground(Color.white);
    	 
    	 ButtonGroup bg=new ButtonGroup();
    	 bg.add(rb1);
    	 bg.add(rb2);
    	 
    	 rb1.setSelected(true);
    	 
    	 box=new JComboBox();
    	 for(int i=2;i<=6;i++){
    		 box.addItem(i+"명");
    	 }
    	 
    	 b1=new JButton("확인");
    	 b2=new JButton("취소");
    	 
    	 la3.setVisible(false);
    	 pf.setVisible(false);
    	 //배치
    	 setLayout(null);
    	 la1.setBounds(55, 20, 50, 20);
    	 tf.setBounds(110, 20, 150, 20);
    	 
    	 la2.setBounds(55, 45, 50, 20);
    	 rb1.setBounds(110, 45, 70, 20);
    	 rb2.setBounds(185, 45, 70, 20);
    	 
    	 la3.setBounds(105, 70, 60, 20);
    	 pf.setBounds(170, 70, 80, 20);
    	 
    	 la4.setBounds(55, 95, 50, 20);
    	 box.setBounds(110, 95, 100, 20);
    	
    	 JPanel p=new JPanel();
    	 p.add(b1);
    	 p.add(b2);
    	 
    	 p.setBounds(55, 140, 195, 35);
    	 
    	 //추가
    	 add(la1);add(tf);
    	 add(la2);add(rb1);add(rb2);
    	 add(la4);add(pf);
    	 add(la3);add(box);
    	 p.setOpaque(false);
    	 add(p);
    	 
    	 setSize(235, 195);
    	 //setVisible(true);
    	 
    	 rb1.addActionListener(this);
    	 rb2.addActionListener(this);
    }
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
       new MakeRoom();
	}*/
    
    @Override
	protected void paintComponent(Graphics g) {
		g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
	}
    
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==rb1)
		{
			la3.setVisible(false);
			pf.setVisible(false);
			pf.setText("");
		}
		if(e.getSource()==rb2)
		{
			la3.setVisible(true);
			pf.setVisible(true);
			pf.setText("");
			pf.requestFocus();
		}
	}
	
}

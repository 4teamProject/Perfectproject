package com.sist.client;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
public class WaitRoom extends JPanel implements ActionListener{
	JTable table1,table2;
	DefaultTableModel model1,model2,model4;
	JTextArea ta;
	JTextField tf;
	JComboBox box;
	JButton b1,b2,b3,b4,b5,b6;
	Image img;
	WaitRoom()
	{	
		img=Toolkit.getDefaultToolkit().getImage("images\\back1.jpg");
		
		String[] col1={"방이름","공개/비공개","인원"};
		String[][] row1=new String[0][3];
		model1=new DefaultTableModel(row1, col1);
		table1=new JTable(model1);
		JScrollPane js1=new JScrollPane(table1);
		
		String[] col2={"ID","대화명","성별","위치"};
		String[][] row2=new String[0][4];
		model2=new DefaultTableModel(row2, col2);
		table2=new JTable(model2);
		JScrollPane js2=new JScrollPane(table2);
		
		ta=new JTextArea();
		JScrollPane js3=new JScrollPane(ta);
		
		img=Toolkit.getDefaultToolkit().getImage("images\\back1.jpg");
/*		table4=new JTable(model4);
		JScrollPane js4=new JScrollPane(table4);*/
		
		tf=new JTextField();
		box=new JComboBox();
		box.addItem("black");
		box.addItem("blue");
		box.addItem("green");
		box.addItem("cyan");
		box.addItem("pink");
		
		b1=new JButton("방만들기");
		b2=new JButton("방들어가기");
		b3=new JButton("1:1게임");
		b4=new JButton("쪽지보내기");
		b5=new JButton("정보보기");
		b6=new JButton("나가기");
		b6.addActionListener(this);
		
		JPanel p=new JPanel();
		p.setLayout(new GridLayout(3, 2,5,5));//버튼
		p.add(b1);p.add(b2);
		p.add(b3);p.add(b4);
		p.add(b5);p.add(b6);
		p.setOpaque(false);
		
		setLayout(null);
		js1.setBounds(10, 160, 650, 585);
		js2.setBounds(670, 10, 300, 200);
		js3.setBounds(670, 215, 300, 280);
		tf.setBounds(670, 505, 195, 30);
		box.setBounds(870, 505, 100, 30);
		p.setBounds(670, 660, 300, 80);
		add(js1);
		add(js2);
		add(js3);
		add(tf);
		add(box);
		add(p);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b6)
			System.exit(0);
	}
	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(img, 0, 0, getWidth(),getHeight(),this);
	}
}

package project;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

public class WaitRoom extends JPanel{
	JTable table1, table2;
	DefaultTableModel model1, model2;
	JTextArea ta;
	JTextField tf;
	JComboBox box;
	JButton b1, b2, b3, b4, b5, b6;
	Image img;
	
	WaitRoom () {
		String[] col1 = {"방이름", "공개/비공개", "인원"};
		String[][] row1 = new String[0][3];
		img = Toolkit.getDefaultToolkit().getImage("C:\\img\\back1.jpg");
		
		model1 = new DefaultTableModel(row1, col1);
		table1 = new JTable(model1);
		
		JScrollPane js1 = new JScrollPane(table1);
		
		String[] col2 = {"ID", "대화명", "성별", "위치"};
		String[][] row2 = new String[0][3];
		
		model2 = new DefaultTableModel(row2, col2);
		table2 = new JTable(model2);
		
		JScrollPane js2 = new JScrollPane(table2);
		
		ta = new JTextArea();
		JScrollPane js3 = new JScrollPane(ta);
		
		tf = new JTextField();
		box = new JComboBox();
		box.addItem("black");
		box.addItem("blue");
		box.addItem("pink");
		box.addItem("green");
		box.addItem("yellow");
		
		b1 = new JButton("방만들기");
		b2 = new JButton("방입장");
		b3 = new JButton("1:1 게임");
		b4 = new JButton("쪽지보내기");
		b5 = new JButton("사용자정보");
		b6 = new JButton("나가기");
		
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(3,2,5,5));
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.setOpaque(false); 
		
		setLayout(null);
		js1.setBounds(10, 60, 500, 300);
		js2.setBounds(10, 370, 500, 180);
		js3.setBounds(515,15,270,300);
		tf.setBounds(515, 320, 160, 30);
		box.setBounds(680, 320, 100, 30);
		p.setBounds(515, 470, 265, 80);
		
		js1.setOpaque(false);
		js2.setOpaque(false);
		js3.setOpaque(false);
		
		add(js1);
		add(js2);
		add(js3);
		add(tf);
		add(box);
		add(p);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
		//g.setColor(Color.lightGray);
		//g.fillRect(0, 0, getWidth(), getHeight());

	}
}

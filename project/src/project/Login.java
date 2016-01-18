package project;

import java.awt.*;
import javax.swing.*;

public class Login extends JPanel{
	JLabel la1, la2;
	JTextField tf;
	JPasswordField pf;
	JButton b1, b2, b3;
	Image img; // 추상클래스 : 단독으로 메모리 할당 불가능
	
	// 생성자 : returnType 없고, 클래스 이름과 동일
	Login(){
		img = Toolkit.getDefaultToolkit().getImage("C:\\img\\back1.jpg");
		setLayout(null); // default : flowLayout
		
		// 메모리 할당
		la1 = new JLabel("ID");
		la2 = new JLabel("PWD");
		tf = new JTextField();
		pf = new JPasswordField();
		b1 = new JButton("LOGIN");
		b2 = new JButton("CANCEL");
		b3 = new JButton("JOIN");
		// 배치
		la1.setBounds(290, 200, 40, 30);
		//la1.setForeground(Color.white); 글자색 변경
		tf.setBounds(335, 200, 150, 30);
		
		la2.setBounds(290, 235, 40, 30);
		pf.setBounds(335, 235, 150, 30);

		
		// 레이아웃에 추가
		JPanel p = new JPanel();
		
		p.add(b1);
		p.add(b3);
		p.add(b2);
		p.setBounds(240,270,300,35);
		p.setOpaque(false); // 배경 투명
		
		add(la1);
		add(la2);
		add(tf);
		add(pf);
		add(p);
		
	}

	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
		//g.setColor(Color.lightGray);
		//g.fillRect(0, 0, getWidth(), getHeight());

	}
	
	
	
}

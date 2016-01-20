package com.sist.client;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ClientMainForm  extends JFrame implements ActionListener{
	 Login login=new Login();
	 WaitRoom wr=new WaitRoom();
	 SignIn sg = new SignIn();
	 GamePlay gp = new GamePlay();
	 Roomselect rs = new Roomselect();
	 action1 ac1 = new action1();
	 
	 CardLayout card=new CardLayout(); // �ڿ� ����ٰ� ���� �ʿ��Ҷ� ã�°�
	 
	 ClientMainForm(){
		setLocationRelativeTo(null);
		setLayout(card);// BorderLayout
		//
		add("LOG",login);
		add("WR",wr);
		add("SG", sg);
		add("GP",gp);
		add("RS", rs);
		add("action1",ac1);
		
		setSize(1000, 800);
		setVisible(true);
		
		setLocationRelativeTo(null); // �߾����� ��ġ
		login.b1.addActionListener(this); //�̺�Ʈó��
		login.b2.addActionListener(this);
		login.b3.addActionListener(this);
		sg.b1.addActionListener(this);
		sg.b2.addActionListener(this);
		wr.b2.addActionListener(this);
		wr.b1.addActionListener(this);
		rs.b1.addActionListener(this);
		rs.b2.addActionListener(this);
		gp.btn4.addActionListener(this);
		//setDefaultCloseOperation(DO_NOTHING_ON_CLOSE); // x�� ���������� ����� �Ȳ���
	}
	 
	public static void main(String[] args) {
		try
		{
			UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
		
		}catch(Exception ex){}
		new ClientMainForm();
		
	}
	
	public void actionPerformed(ActionEvent e) {
		//����ȭ�鿡�� ��ư�׼�
		if (e.getSource() == login.b1){ 
			setSize(1000,800);
			setLocationRelativeTo(null);
            card.show(getContentPane(), "WR");
		} else if (e.getSource() == login.b3){
			setSize(600,450);
			setLocationRelativeTo(null);
			card.show(getContentPane(), "SG");
		} else if (e.getSource() == login.b2){ 
			System.exit(0);
//===============================================
		//ȸ������ ��ư�׼�
		} else if (e.getSource() == sg.b1) { 
			setSize(1000,800);
			setLocationRelativeTo(null);
			card.show(getContentPane(), "LOG");
		} else if (e.getSource() == sg.b2) { 
			setSize(1000,800);
			setLocationRelativeTo(null);
			card.show(getContentPane(), "LOG");
//===============================================
		//ä�ù� ��ư�׼�
		}else if(e.getSource() == wr.b1){
			setSize(320,250);
			setLocationRelativeTo(null);
			card.show(getContentPane(), "RS");
		}else if (e.getSource() == wr.b6){ //���� ����
			System.exit(0);
//===============================================
		//��ɼ� ��ư�׼�
		}else if(e.getSource() == rs.b1) { //���ӹ� �����
			setSize(1100, 900);
			setLocationRelativeTo(null);
			card.show(getContentPane(), "GP");
		}else if (e.getSource() == rs.b2) { //��ҹ�ư �������� �ٽ� ȭ�鵹�ƿ���
			setSize(1000,800);
			setLocationRelativeTo(null);
			card.show(getContentPane(), "WR");
//===============================================
		//���ӹ� ��ư�׼�
		}else if(e.getSource() == gp.btn4){
			setSize(1000,800);
			setLocationRelativeTo(null);
			card.show(getContentPane(), "WR");
		/*else if(e.getSource() == login.b1){
			setSize(500,300);
			setLocationRelativeTo(null);
			card.show(getContentPane(), "sg");
		}
		else if(e.getSource()==wr.b1){
			card.show(getContentPane(), "GP");
		}*/
		}
	}
}

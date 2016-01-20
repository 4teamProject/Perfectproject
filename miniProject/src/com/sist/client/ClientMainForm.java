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
	 
	 CardLayout card=new CardLayout(); // 뒤에 감췄다가 내가 필요할때 찾는거
	 
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
		
		setLocationRelativeTo(null); // 중앙으로 위치
		login.b1.addActionListener(this); //이벤트처리
		login.b2.addActionListener(this);
		login.b3.addActionListener(this);
		sg.b1.addActionListener(this);
		sg.b2.addActionListener(this);
		wr.b2.addActionListener(this);
		wr.b1.addActionListener(this);
		rs.b1.addActionListener(this);
		rs.b2.addActionListener(this);
		gp.btn4.addActionListener(this);
		//setDefaultCloseOperation(DO_NOTHING_ON_CLOSE); // x를 눌렀을떄도 절대로 안꺼짐
	}
	 
	public static void main(String[] args) {
		try
		{
			UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
		
		}catch(Exception ex){}
		new ClientMainForm();
		
	}
	
	public void actionPerformed(ActionEvent e) {
		//메인화면에서 버튼액션
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
		//회원가입 버튼액션
		} else if (e.getSource() == sg.b1) { 
			setSize(1000,800);
			setLocationRelativeTo(null);
			card.show(getContentPane(), "LOG");
		} else if (e.getSource() == sg.b2) { 
			setSize(1000,800);
			setLocationRelativeTo(null);
			card.show(getContentPane(), "LOG");
//===============================================
		//채팅방 버튼액션
		}else if(e.getSource() == wr.b1){
			setSize(320,250);
			setLocationRelativeTo(null);
			card.show(getContentPane(), "RS");
		}else if (e.getSource() == wr.b6){ //대기방 종료
			System.exit(0);
//===============================================
		//방옵션 버튼액션
		}else if(e.getSource() == rs.b1) { //게임방 만들기
			setSize(1100, 900);
			setLocationRelativeTo(null);
			card.show(getContentPane(), "GP");
		}else if (e.getSource() == rs.b2) { //취소버튼 눌렀을때 다시 화면돌아오기
			setSize(1000,800);
			setLocationRelativeTo(null);
			card.show(getContentPane(), "WR");
//===============================================
		//게임방 버튼액션
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

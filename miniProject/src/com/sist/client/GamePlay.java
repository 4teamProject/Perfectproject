package com.sist.client;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.*;
//import javafx.scene.shape.MoveTo;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;


public class GamePlay extends JPanel implements ActionListener{
	//JPanel p1,p2,p3,p4;
	JButton a0,a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15, //상대편카드 나열
				b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15, // 내카드 나열
				ct0,ct1,ct2,ct3,ct4,ct5,ct6,ct7,ct8,ct9,ct10,ct11,ct12,ct13,ct14,ct15,
				 btn1, btn2, btn3, btn4;//센터이미지
	boolean[] btnChk = new boolean[16];
	JTextArea ta;
	JTextField tf;
	JComboBox box;
	
	Timer timer = new Timer();
	Image img;
	
	GamePlay(){
		img=Toolkit.getDefaultToolkit().getImage("C:\\images\\back1.jpg");
		
		//abel p1id,p1nick,p1card;
		//상대방 정보 표시
		JPanel p1 = new JPanel();
		JLabel p1id = new JLabel("ID");
		JLabel p1nick = new JLabel("Nickname");
		
		ImageIcon c1 = new ImageIcon("c:\\image\\c1.png");
		ImageIcon cardBack = new ImageIcon("c:\\image\\cardback.jpg");
		JLabel p1avata = new JLabel(c1);
		JLabel p1card = new JLabel(cardBack);
		p1.setBackground(Color.LIGHT_GRAY);
		p1.setLayout(null);
		p1avata.setBounds(20, 20, 50, 50);
		p1id.setBounds(20,85,50,17);
		p1nick.setBounds(20,110,50,17);
		p1card.setBounds(90,20,77,120);
		p1.add(p1avata);
		p1.add(p1id);
		p1.add(p1nick);
		p1.add(p1card);
		
		add(p1);
		p1.setBounds(850, 40, 210, 150);
	
//=====================================================
		//내 정보 보여주는곳
		JPanel p2 = new JPanel();
		JLabel p2id = new JLabel("ID");
		JLabel p2nick = new JLabel("Nickname");
		
		
		ImageIcon c2 = new ImageIcon("c:\\image\\c1.png");
		ImageIcon cardBack2 = new ImageIcon("c:\\image\\cardback.jpg");
		JLabel p2avata = new JLabel(c1);
		JLabel p2card = new JLabel(cardBack);
		p2.setBackground(Color.LIGHT_GRAY);
		p2.setLayout(null);
		p2avata.setBounds(20, 20, 50, 50);
		p2id.setBounds(20,85,50,17);
		p2nick.setBounds(20,110,50,17);
		p2card.setBounds(90,20,77,120);
		p2.add(p2avata);
		p2.add(p2id);
		p2.add(p2nick);
		p2.add(p2card);
		
		add(p2);
		p2.setBounds(850, 580, 210, 150);
		
//======================================================
		//채팅창 입력, 크기 조정, 버튼만들기
		
		ta=new JTextArea(); //채팅들어가는 부분
		JScrollPane js=new JScrollPane(ta);
		
		tf=new JTextField(); //채팅창 입력부분
		box=new JComboBox(); // 글씨색바꾸는부분
		box.addItem("black");
		box.addItem("blue");
		box.addItem("pink");
		box.addItem("yellow");
		box.addItem("green");
		
		btn1 = new JButton("카드 제출");
		btn3 = new JButton("턴 넘기기");
		btn2 = new JButton("쪽지보내기");
		btn4 = new JButton("나가기");
		
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(2, 2, 3 ,3));
		p.add(btn1);p.add(btn2);p.add(btn3);p.add(btn4);
		p.setOpaque(false);
		
		add(js);
		add(tf);
		add(box);
		add(p);
		js.setBounds(850,195,210,350);
		tf.setBounds(850, 550, 150, 25);
		box.setBounds(1005,550,55,25);
		p.setBounds(850,735,210,70);
//======================================================
		// 카드 배열(앞)
		String[] arrImg = new String[16];
		for(int i = 0; i < arrImg.length; i++){
			arrImg[i] = "images\\b"+i+".jpg";
		}
		
		// 카드 배열(뒤)
		String[] arrImg1 = new String[16];
		for(int i = 0; i < arrImg1.length; i++){
			arrImg1[i] = "images\\a"+i+".jpg";
		}
				
		// 랜덤 인덱스 (내 카드)
		int[] numArr1 = new int[16];
		boolean check1;
		int su1 = 0;
		
		for(int i = 0; i < numArr1.length; i++){
			check1 = true;
			while(check1){
				su1 = (int)(Math.random()*16);
				
				check1 = false;
				for(int j = 0; j < i; j++){
					if (numArr1[j] == su1){
						check1 = true;
						break;
					}
				}
			}
			numArr1[i] = su1;
		}

		// 랜덤 인덱스 (상대 카드)
		int[] numArr2 = new int[16];
		boolean check2;
		int su2 = 0;
		
		for(int i = 0; i < numArr2.length; i++){
			check2 = true;
			while(check2){
				su2 = (int)(Math.random()*16);
				
				check2 = false;
				for(int j = 0; j < i; j++){
					if (numArr2[j] == su2){
						check2 = true;
						break;
					}
				}
			}
			numArr2[i] = su2;
		}
		
		// 랜덤 인덱스 (가운데 카드)
		int[] numArr3 = new int[16];
		boolean check3;
		int su3 = 0;
		
		for(int i = 0; i < numArr3.length; i++){
			check3 = true;
			while(check3){
				su3 = (int)(Math.random()*16);
				
				check3 = false;
				for(int j = 0; j < i; j++){
					if (numArr3[j] == su3){
						check3 = true;
						break;
					}
				}
			}
			numArr3[i] = su3;
		}
		
		// 이미지 생성 (내카드)
		ImageIcon i0 = new ImageIcon(arrImg1[numArr1[0]]);
		ImageIcon i1 = new ImageIcon(arrImg1[numArr1[1]]);
		ImageIcon i2 = new ImageIcon(arrImg1[numArr1[2]]);
		ImageIcon i3 = new ImageIcon(arrImg1[numArr1[3]]);
		ImageIcon i4 = new ImageIcon(arrImg1[numArr1[4]]);
		ImageIcon i5 = new ImageIcon(arrImg1[numArr1[5]]);
		ImageIcon i6 = new ImageIcon(arrImg1[numArr1[6]]);
		ImageIcon i7 = new ImageIcon(arrImg1[numArr1[7]]);
		ImageIcon i8 = new ImageIcon(arrImg1[numArr1[8]]);
		ImageIcon i9 = new ImageIcon(arrImg1[numArr1[9]]);
		ImageIcon i10 = new ImageIcon(arrImg1[numArr1[10]]);
		ImageIcon i11 = new ImageIcon(arrImg1[numArr1[11]]);
		ImageIcon i12 = new ImageIcon(arrImg1[numArr1[12]]);
		ImageIcon i13 = new ImageIcon(arrImg1[numArr1[13]]);
		ImageIcon i14 = new ImageIcon(arrImg1[numArr1[14]]);
		ImageIcon i15 = new ImageIcon(arrImg1[numArr1[15]]);
		
		// 이미지 생성 (상대카드)
		ImageIcon j0 = new ImageIcon(arrImg1[numArr2[0]]);
		ImageIcon j1 = new ImageIcon(arrImg1[numArr2[1]]);
		ImageIcon j2 = new ImageIcon(arrImg1[numArr2[2]]);
		ImageIcon j3 = new ImageIcon(arrImg1[numArr2[3]]);
		ImageIcon j4 = new ImageIcon(arrImg1[numArr2[4]]);
		ImageIcon j5 = new ImageIcon(arrImg1[numArr2[5]]);
		ImageIcon j6 = new ImageIcon(arrImg1[numArr2[6]]);
		ImageIcon j7 = new ImageIcon(arrImg1[numArr2[7]]);
		ImageIcon j8 = new ImageIcon(arrImg1[numArr2[8]]);
		ImageIcon j9 = new ImageIcon(arrImg1[numArr2[9]]);
		ImageIcon j10 = new ImageIcon(arrImg1[numArr2[10]]);
		ImageIcon j11 = new ImageIcon(arrImg1[numArr2[11]]);
		ImageIcon j12 = new ImageIcon(arrImg1[numArr2[12]]);
		ImageIcon j13 = new ImageIcon(arrImg1[numArr2[13]]);
		ImageIcon j14 = new ImageIcon(arrImg1[numArr2[14]]);
		ImageIcon j15 = new ImageIcon(arrImg1[numArr2[15]]);
		
		// 이미지 생성 (가운데 카드)
		
		ImageIcon k0 = new ImageIcon(arrImg[numArr3[0]]);
		ImageIcon k1 = new ImageIcon(arrImg[numArr3[1]]);
		ImageIcon k2 = new ImageIcon(arrImg[numArr3[2]]);
		ImageIcon k3 = new ImageIcon(arrImg[numArr3[3]]);
		ImageIcon k4 = new ImageIcon(arrImg[numArr3[4]]);
		ImageIcon k5 = new ImageIcon(arrImg[numArr3[5]]);
		ImageIcon k6 = new ImageIcon(arrImg[numArr3[6]]);
		ImageIcon k7 = new ImageIcon(arrImg[numArr3[7]]);
		ImageIcon k8 = new ImageIcon(arrImg[numArr3[8]]);
		ImageIcon k9 = new ImageIcon(arrImg[numArr3[9]]);
		ImageIcon k10 = new ImageIcon(arrImg[numArr3[10]]);
		ImageIcon k11 = new ImageIcon(arrImg[numArr3[11]]);
		ImageIcon k12 = new ImageIcon(arrImg[numArr3[12]]);
		ImageIcon k13 = new ImageIcon(arrImg[numArr3[13]]);
		ImageIcon k14 = new ImageIcon(arrImg[numArr3[14]]);
		ImageIcon k15 = new ImageIcon(arrImg[numArr3[15]]);

		setLayout(null);
		Border thickBorder = new LineBorder(Color.RED, 5); // 버튼에 빨간색 굵기 표시
		

		
//======================================================
		//상대방 카드 버튼으로 추가
		a0 = new JButton(j0);
		a1 = new JButton(j1);
		a2 = new JButton(j2);
		a3 = new JButton(j3);
		a4 = new JButton(j4);
		a5 = new JButton(j5);
		a6 = new JButton(j6);
		a7 = new JButton(j7);
		a8 = new JButton(j8);
		a9 = new JButton(j9);
		a10 = new JButton(j10);
		a11 = new JButton(j11);
		a12 = new JButton(j12);
		a13 = new JButton(j13);
		a14 = new JButton(j14);
		a15 = new JButton(j15);
		a0.setBorder(thickBorder); // 시작지점 빨간색
//======================================================
		//내 카드 버튼으로 추가
		b0= new JButton(i0);
		b1 = new JButton(i1);
		b2 = new JButton(i2);
		b3 = new JButton(i3);
		b4 = new JButton(i4);
		b5 = new JButton(i5);
		b6 = new JButton(i6);
		b7 = new JButton(i7);
		b8 = new JButton(i8);
		b9 = new JButton(i9);
		b10 = new JButton(i10);
		b11 = new JButton(i11);
		b12 = new JButton(i12);
		b13 = new JButton(i13);
		b14 = new JButton(i14);
		b15 = new JButton(i15);
		b0.setBorder(thickBorder);
//======================================================
		//중앙 9개 뿌려주기
		ct0 = new JButton(k0);
		ct1 = new JButton(k1);
		ct2 = new JButton(k2);
		ct3 = new JButton(k3);
		ct4 = new JButton(k4);
		ct5 = new JButton(k5);
		ct6 = new JButton(k6);
		ct7 = new JButton(k7);
		ct8 = new JButton(k8);
		ct9 = new JButton(k9);
		ct10 = new JButton(k10);
		ct11 = new JButton(k11);
		ct12 = new JButton(k12);
		ct13 = new JButton(k13);
		ct14 = new JButton(k14);
		ct15 = new JButton(k15);
//======================================================
		//카드추가
		add(a15);
		add(a14);
		add(a13);
		add(a12);
		add(a11);
		add(a10);
		add(a9);
		add(a8);
		add(a7);
		add(a6);
		add(a5);
		add(a4);
		add(a3);
		add(a2);
		add(a1);
		add(a0);
		
		add(b15);
		add(b14);
		add(b13);
		add(b12);
		add(b11);
		add(b10);
		add(b9);
		add(b8);
		add(b7);
		add(b6);
		add(b5);
		add(b4);
		add(b3);
		add(b2);
		add(b1);
		add(b0);
		
		add(ct0);
		add(ct1);
		add(ct2);
		add(ct3);
		add(ct4);
		add(ct5);
		add(ct6);
		add(ct7);
		add(ct8);
		add(ct9);
		add(ct10);
		add(ct11);
		add(ct12);
		add(ct13);
		add(ct14);
		add(ct15);
//======================================================
		//상대 카드 위치 조정
		a0.setBounds(5,40,70,100);
		a1.setBounds(80, 40, 70, 100);
		a2.setBounds(155,40,70,100);
		a3.setBounds(230,40,70,100);
		a4.setBounds(305,40,70,100);
		a5.setBounds(380,40,70,100);
		a6.setBounds(455,40,70,100);
		a7.setBounds(530,40,70,100);
		a8.setBounds(605,40,70,100);
		a9.setBounds(680,40,70,100);
		/*a10.setBounds(505,40,100,100);
		a11.setBounds(555,40,100,100);
		a12.setBounds(605,40,100,100);
		a13.setBounds(655,40,100,100);
		a14.setBounds(705,40,100,100);
		*/
//======================================================
		//내카드 위치조정
		
		b0.setBounds(5,730,70,100);
		b1.setBounds(80, 730, 70, 100);
		b2.setBounds(155,730,70,100);
		b3.setBounds(230,730,70,100);
		b4.setBounds(305,730,70,100);
		b5.setBounds(380,730,70,100);
		b6.setBounds(455,730,70,100);
		b7.setBounds(530,730,70,100);
		b8.setBounds(605,730,70,100);
		b9.setBounds(680,730,70,100);
		/*b10.setBounds(505,670,100,155);
		b11.setBounds(555,670,100,155);
		b12.setBounds(605,670,100,155);
		b13.setBounds(655,670,100,155);
		b14.setBounds(705,670,100,155);*/
//======================================================
		//센터 카드 위치조정
		ct0.setBounds(100,170,150,130);
		ct1.setBounds(255,170,150,130);
		ct2.setBounds(410,170,150,130);
		ct3.setBounds(565,170,150,130);
		
		ct4.setBounds(100,305,150,130);
		ct5.setBounds(255,305,150,130);
		ct6.setBounds(410,305,150,130);
		ct7.setBounds(565,305,150,130);
		
		ct8.setBounds(100,440,150,130);
		ct9.setBounds(255,440,150,130);
		ct10.setBounds(410,440,150,130);
		ct11.setBounds(565,440,150,130);
		
		ct12.setBounds(100,575,150,130);
		ct13.setBounds(255,575,150,130);
		ct14.setBounds(410,575,150,130);
		ct15.setBounds(565,575,150,130);
		
		
		//여기까지
//======================================================
		
		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
		b15.addActionListener(this);
		
	}
	public void moveBtn(JButton btn,int i){
		if(btnChk[i]==true){
			btn.setLocation(5+50*i,400);
			btnChk[i]=false;
		}
		else{
			btn.setLocation(5+50*i, 350);
			btnChk[i]=true;
		}
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b0 ){
			//timer.schedule(moveBtn(b0,0), 0, 1000);
		}
		else if(e.getSource()==b1){
			moveBtn(b1,1);
		}
		else if(e.getSource()==b2){
			moveBtn(b2,2);
		}
		else if(e.getSource()==b3){
			moveBtn(b3,3);
		}
		else if(e.getSource()==b4){
			moveBtn(b4,4);
		}
		else if(e.getSource()==b5){
			moveBtn(b5,5);
		}
		else if(e.getSource()==b6){
			moveBtn(b6,6);
		}
		else if(e.getSource()==b7){
			moveBtn(b7,7);
		}
		else if(e.getSource()==b8){
			moveBtn(b8,8);
		}
		else if(e.getSource()==b9){
			moveBtn(b9,9);
		}
		else if(e.getSource()==b10){
			moveBtn(b10,10);
		}
		else if(e.getSource()==b11){
			moveBtn(b11,11);
		}
		else if(e.getSource()==b12){
			moveBtn(b12,12);
		}
		else if(e.getSource()==b13){
			moveBtn(b13,13);
		}
		else if(e.getSource()==b14){
			moveBtn(b14,14);
		}
		else if(e.getSource()==b15){
			moveBtn(b15,15);
			
		}
	
	}
}

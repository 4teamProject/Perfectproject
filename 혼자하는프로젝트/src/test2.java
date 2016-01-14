import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import 혼자하는프로젝트.test3_패널위에이미지삽입;

import javax.swing.JInternalFrame;
import java.awt.Dimension;

public class test2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test2 frame = new test2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public test2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 693, 771);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel(){
			public void paintComponent(Graphics g){
				Image img = Toolkit.getDefaultToolkit().getImage(test3_패널위에이미지삽입.class.getResource("/img/panel1.jpg"));
				g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
			}
		};
		contentPane.add(panel, BorderLayout.NORTH);
		
		JPanel panel_7 = new JPanel();
		panel_7.setSize(new Dimension(50, 50));
		panel_7.setPreferredSize(new Dimension(60, 60));
		panel.add(panel_7);
		
		JPanel panel_8 = new JPanel();
		panel_8.setSize(new Dimension(50, 50));
		panel_8.setPreferredSize(new Dimension(60, 60));
		panel.add(panel_8);
		
		JPanel panel_11 = new JPanel();
		panel_11.setSize(new Dimension(50, 50));
		panel_11.setPreferredSize(new Dimension(60, 60));
		panel.add(panel_11);
		
		JPanel panel_10 = new JPanel();
		panel_10.setSize(new Dimension(50, 50));
		panel_10.setPreferredSize(new Dimension(60, 60));
		panel.add(panel_10);
		
		JPanel panel_9 = new JPanel();
		panel_9.setSize(new Dimension(50, 50));
		panel_9.setPreferredSize(new Dimension(60, 60));
		panel.add(panel_9);
		
		JPanel panel_6 = new JPanel();
		panel_6.setSize(new Dimension(50, 50));
		panel_6.setPreferredSize(new Dimension(60, 60));
		panel.add(panel_6);
		
		JPanel panel_5 = new JPanel();
		panel_5.setSize(new Dimension(50, 50));
		panel_5.setPreferredSize(new Dimension(60, 60));
		panel.add(panel_5);
		
		JPanel panel_4 = new JPanel();
		panel_4.setSize(new Dimension(50, 50));
		panel_4.setPreferredSize(new Dimension(60, 60));
		panel.add(panel_4);
		
		JPanel panel_3 = new JPanel();
		panel_3.setSize(new Dimension(50, 50));
		panel_3.setPreferredSize(new Dimension(60, 60));
		panel.add(panel_3);
		
		JPanel panel_1 = new JPanel(){
			public void paintComponent(Graphics g){
				Image img = Toolkit.getDefaultToolkit().getImage(test3_패널위에이미지삽입.class.getResource("/img/panel1.jpg"));
				g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
			}
		};
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JPanel panel_12 = new JPanel();
		panel_12.setSize(new Dimension(50, 50));
		panel_12.setPreferredSize(new Dimension(60, 60));
		panel_1.add(panel_12);
		
		JPanel panel_13 = new JPanel();
		panel_13.setSize(new Dimension(50, 50));
		panel_13.setPreferredSize(new Dimension(60, 60));
		panel_1.add(panel_13);
		
		JPanel panel_14 = new JPanel();
		panel_14.setSize(new Dimension(50, 50));
		panel_14.setPreferredSize(new Dimension(60, 60));
		panel_1.add(panel_14);
		
		JPanel panel_15 = new JPanel();
		panel_15.setSize(new Dimension(50, 50));
		panel_15.setPreferredSize(new Dimension(60, 60));
		panel_1.add(panel_15);
		
		JPanel panel_16 = new JPanel();
		panel_16.setSize(new Dimension(50, 50));
		panel_16.setPreferredSize(new Dimension(60, 60));
		panel_1.add(panel_16);
		
		JPanel panel_17 = new JPanel();
		panel_17.setSize(new Dimension(50, 50));
		panel_17.setPreferredSize(new Dimension(60, 60));
		panel_1.add(panel_17);
		
		JPanel panel_18 = new JPanel();
		panel_18.setSize(new Dimension(50, 50));
		panel_18.setPreferredSize(new Dimension(60, 60));
		panel_1.add(panel_18);
		
		JPanel panel_19 = new JPanel();
		panel_19.setSize(new Dimension(50, 50));
		panel_19.setPreferredSize(new Dimension(60, 60));
		panel_1.add(panel_19);
		
		JPanel panel_20 = new JPanel();
		panel_20.setSize(new Dimension(50, 50));
		panel_20.setPreferredSize(new Dimension(60, 60));
		panel_1.add(panel_20);
		
		JPanel panel_2 = new JPanel(){
			public void paintComponent(Graphics g){
				Image img = Toolkit.getDefaultToolkit().getImage(test3_패널위에이미지삽입.class.getResource("/img/panel1.jpg"));
				g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
			}
		};
		contentPane.add(panel_2, BorderLayout.CENTER);
		
		JPanel panel_36 = new JPanel(){
			public void paintComponent(Graphics g){
				Image img = Toolkit.getDefaultToolkit().getImage(test3_패널위에이미지삽입.class.getResource("/img/ch1.jpg"));
				g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
			}
		};
		panel_36.setPreferredSize(new Dimension(130, 130));
		panel_2.add(panel_36);
		
		JPanel panel_35 = new JPanel();
		panel_35.setPreferredSize(new Dimension(130, 130));
		panel_2.add(panel_35);
		
		JPanel panel_34 = new JPanel();
		panel_34.setPreferredSize(new Dimension(130, 130));
		panel_2.add(panel_34);
		
		JPanel panel_33 = new JPanel();
		panel_33.setPreferredSize(new Dimension(130, 130));
		panel_2.add(panel_33);
		
		JPanel panel_32 = new JPanel();
		panel_32.setPreferredSize(new Dimension(130, 130));
		panel_2.add(panel_32);
		
		JPanel panel_31 = new JPanel();
		panel_31.setPreferredSize(new Dimension(130, 130));
		panel_2.add(panel_31);
		
		JPanel panel_30 = new JPanel();
		panel_30.setPreferredSize(new Dimension(130, 130));
		panel_2.add(panel_30);
		
		JPanel panel_29 = new JPanel();
		panel_29.setPreferredSize(new Dimension(130, 130));
		panel_2.add(panel_29);
		
		JPanel panel_28 = new JPanel();
		panel_28.setPreferredSize(new Dimension(130, 130));
		panel_2.add(panel_28);
		
		JPanel panel_27 = new JPanel();
		panel_27.setPreferredSize(new Dimension(130, 130));
		panel_2.add(panel_27);
		
		JPanel panel_26 = new JPanel();
		panel_26.setPreferredSize(new Dimension(130, 130));
		panel_2.add(panel_26);
		
		JPanel panel_25 = new JPanel();
		panel_25.setPreferredSize(new Dimension(130, 130));
		panel_2.add(panel_25);
		
		JPanel panel_24 = new JPanel();
		panel_24.setPreferredSize(new Dimension(130, 130));
		panel_2.add(panel_24);
		
		JPanel panel_23 = new JPanel();
		panel_23.setPreferredSize(new Dimension(130, 130));
		panel_2.add(panel_23);
		
		JPanel panel_22 = new JPanel();
		panel_22.setPreferredSize(new Dimension(130, 130));
		panel_2.add(panel_22);
		
		JPanel panel_21 = new JPanel();
		panel_21.setPreferredSize(new Dimension(130, 130));
		panel_2.add(panel_21);
	}

}

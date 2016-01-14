import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.image.*;
import java.awt.Toolkit;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Point;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.JInternalFrame;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.Toolkit;
import java.awt.Dimension;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Canvas;
import java.awt.Color;
import javax.swing.JLabel;

public class test extends JFrame {

	private JPanel contentPane;
	/**
	 * @wbp.nonvisual location=-10,-11
	 */
	private final JLabel label = new JLabel("New label");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test frame = new test();
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
	public test() {
		setResizable(false);
		setForeground(Color.PINK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 671, 736);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel OtherCard = new JPanel();
		contentPane.add(OtherCard, BorderLayout.NORTH);
		
		ScrollPane scrollPane_29 = new ScrollPane();
		scrollPane_29.setSize(new Dimension(50, 50));
		OtherCard.add(scrollPane_29);
		
		ScrollPane scrollPane_28 = new ScrollPane();
		scrollPane_28.setSize(new Dimension(50, 50));
		OtherCard.add(scrollPane_28);
		
		ScrollPane scrollPane_16 = new ScrollPane();
		scrollPane_16.setSize(new Dimension(50, 50));
		OtherCard.add(scrollPane_16);
		
		ScrollPane scrollPane_17 = new ScrollPane();
		scrollPane_17.setSize(new Dimension(50, 50));
		OtherCard.add(scrollPane_17);
		
		ScrollPane scrollPane_18 = new ScrollPane();
		scrollPane_18.setSize(new Dimension(50, 50));
		OtherCard.add(scrollPane_18);
		
		ScrollPane scrollPane_19 = new ScrollPane();
		scrollPane_19.setSize(new Dimension(50, 50));
		OtherCard.add(scrollPane_19);
		
		ScrollPane scrollPane_20 = new ScrollPane();
		scrollPane_20.setSize(new Dimension(50, 50));
		OtherCard.add(scrollPane_20);
		
		ScrollPane scrollPane_21 = new ScrollPane();
		scrollPane_21.setSize(new Dimension(50, 50));
		OtherCard.add(scrollPane_21);
		
		ScrollPane scrollPane_26 = new ScrollPane();
		scrollPane_26.setSize(new Dimension(50, 50));
		OtherCard.add(scrollPane_26);
		
		ScrollPane scrollPane_25 = new ScrollPane();
		scrollPane_25.setSize(new Dimension(50, 50));
		OtherCard.add(scrollPane_25);
		
		ScrollPane scrollPane_27 = new ScrollPane();
		scrollPane_27.setSize(new Dimension(50, 50));
		OtherCard.add(scrollPane_27);
		
		ScrollPane scrollPane_24 = new ScrollPane();
		scrollPane_24.setSize(new Dimension(50, 50));
		OtherCard.add(scrollPane_24);
		
		ScrollPane scrollPane_23 = new ScrollPane();
		scrollPane_23.setSize(new Dimension(50, 50));
		OtherCard.add(scrollPane_23);
		
		ScrollPane scrollPane_22 = new ScrollPane();
		scrollPane_22.setSize(new Dimension(50, 50));
		OtherCard.add(scrollPane_22);
		
		JLayeredPane MainCard = new JLayeredPane();
		MainCard.setLocation(new Point(500, 300));
		contentPane.add(MainCard, BorderLayout.CENTER);
		MainCard.setLayout(new CardLayout(0, 0));
		
		Panel panel = new Panel();
		panel.setSize(new Dimension(130, 130));
		MainCard.add(panel, "name_182762144570028");
		
		JPanel panel_13 = new JPanel(){
			public void paintComponent(Graphics g){
				Image img = Toolkit.getDefaultToolkit().getImage(test.class.getResource("/img/back.jpg"));
				g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
			}
		};
		panel_13.setPreferredSize(new Dimension(130, 130));
		panel.add(panel_13);
		
		Panel panel_12 = new Panel();
		panel_12.setSize(new Dimension(130, 130));
		panel_12.setPreferredSize(new Dimension(130, 130));
		panel.add(panel_12);
		
		Panel panel_11 = new Panel();
		panel_11.setSize(new Dimension(130, 130));
		panel_11.setPreferredSize(new Dimension(130, 130));
		panel.add(panel_11);
		
		Panel panel_10 = new Panel();
		panel_10.setSize(new Dimension(130, 130));
		panel_10.setPreferredSize(new Dimension(130, 130));
		panel.add(panel_10);
		
		Panel panel_16 = new Panel();
		panel_16.setSize(new Dimension(130, 130));
		panel_16.setPreferredSize(new Dimension(130, 130));
		panel.add(panel_16);
		
		Panel panel_15 = new Panel();
		panel_15.setSize(new Dimension(130, 130));
		panel_15.setPreferredSize(new Dimension(130, 130));
		panel.add(panel_15);
		
		Panel panel_14 = new Panel();
		panel_14.setSize(new Dimension(130, 130));
		panel_14.setPreferredSize(new Dimension(130, 130));
		panel.add(panel_14);
		
		Panel panel_9 = new Panel();
		panel_9.setSize(new Dimension(130, 130));
		panel_9.setPreferredSize(new Dimension(130, 130));
		panel.add(panel_9);
		
		Panel panel_8 = new Panel();
		panel_8.setSize(new Dimension(130, 130));
		panel_8.setPreferredSize(new Dimension(130, 130));
		panel.add(panel_8);
		
		Panel panel_7 = new Panel();
		panel_7.setSize(new Dimension(130, 130));
		panel_7.setPreferredSize(new Dimension(130, 130));
		panel.add(panel_7);
		
		Panel panel_6 = new Panel();
		panel_6.setSize(new Dimension(130, 130));
		panel_6.setPreferredSize(new Dimension(130, 130));
		panel.add(panel_6);
		
		Panel panel_5 = new Panel();
		panel_5.setSize(new Dimension(130, 130));
		panel_5.setPreferredSize(new Dimension(130, 130));
		panel.add(panel_5);
		
		Panel panel_3 = new Panel();
		panel.add(panel_3);
		panel_3.setSize(new Dimension(130, 130));
		panel_3.setPreferredSize(new Dimension(130, 130));
		
		Panel panel_4 = new Panel();
		panel_4.setSize(new Dimension(130, 130));
		panel_4.setPreferredSize(new Dimension(130, 130));
		panel.add(panel_4);
		
		Panel panel_2 = new Panel();
		panel_2.setSize(new Dimension(130, 130));
		panel_2.setPreferredSize(new Dimension(130, 130));
		panel.add(panel_2);
		
		Panel panel_1 = new Panel();
		panel_1.setPreferredSize(new Dimension(130, 130));
		panel_1.setSize(new Dimension(130, 130));
		panel.add(panel_1);
		
		JPanel MyCard = new JPanel();
		contentPane.add(MyCard, BorderLayout.SOUTH);
		
		ScrollPane scrollPane_40 = new ScrollPane();
		scrollPane_40.setSize(new Dimension(50, 50));
		MyCard.add(scrollPane_40);
		
		ScrollPane scrollPane_39 = new ScrollPane();
		scrollPane_39.setSize(new Dimension(50, 50));
		MyCard.add(scrollPane_39);
		
		ScrollPane scrollPane_38 = new ScrollPane();
		scrollPane_38.setSize(new Dimension(50, 50));
		MyCard.add(scrollPane_38);
		
		ScrollPane scrollPane_37 = new ScrollPane();
		scrollPane_37.setSize(new Dimension(50, 50));
		MyCard.add(scrollPane_37);
		
		ScrollPane scrollPane_36 = new ScrollPane();
		scrollPane_36.setSize(new Dimension(50, 50));
		MyCard.add(scrollPane_36);
		
		ScrollPane scrollPane_35 = new ScrollPane();
		scrollPane_35.setSize(new Dimension(50, 50));
		MyCard.add(scrollPane_35);
		
		ScrollPane scrollPane_34 = new ScrollPane();
		scrollPane_34.setSize(new Dimension(50, 50));
		MyCard.add(scrollPane_34);
		
		ScrollPane scrollPane_33 = new ScrollPane();
		scrollPane_33.setSize(new Dimension(50, 50));
		MyCard.add(scrollPane_33);
		
		ScrollPane scrollPane_32 = new ScrollPane();
		scrollPane_32.setSize(new Dimension(50, 50));
		MyCard.add(scrollPane_32);
		
		ScrollPane scrollPane_31 = new ScrollPane();
		scrollPane_31.setSize(new Dimension(50, 50));
		MyCard.add(scrollPane_31);
		
		ScrollPane scrollPane_30 = new ScrollPane();
		scrollPane_30.setSize(new Dimension(50, 50));
		MyCard.add(scrollPane_30);
	}

}

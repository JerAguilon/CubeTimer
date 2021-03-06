package cubetimer;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Component;
import javax.swing.Box;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SwingConstants;
import java.awt.Color;

public class ScrambleShower extends JFrame {
	JPanel panel1 = new JPanel();
	JPanel panel0 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JPanel panel4 = new JPanel();
	JPanel panel5 = new JPanel();
	
	
	JLabel stickers[][] = new JLabel[6][9];
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					ScrambleShower frame = new ScrambleShower();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public ScrambleShower() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 666, 494);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		populateStickers();
		
		
	} private void populateStickers() {
		panel1.setBounds(62, 152, 120, 120);
		contentPane.add(panel1);
		panel1.setLayout(null);
		
		JLabel cube11 = new JLabel("1");
		cube11.setOpaque(true);
		cube11.setHorizontalAlignment(SwingConstants.CENTER);
		cube11.setBounds(45, 5, 30, 30);
		panel1.add(cube11);
		
		JLabel cube10 = new JLabel("1");
		cube10.setOpaque(true);
		cube10.setHorizontalAlignment(SwingConstants.CENTER);
		cube10.setBounds(5, 5, 30, 30);
		panel1.add(cube10);
		
		JLabel cube12 = new JLabel("1");
		cube12.setOpaque(true);
		cube12.setHorizontalAlignment(SwingConstants.CENTER);
		cube12.setBounds(85, 5,30, 30);
		panel1.add(cube12);
		
		JLabel cube16 = new JLabel("1");
		cube16.setOpaque(true);
		cube16.setHorizontalAlignment(SwingConstants.CENTER);
		cube16.setBounds(5, 85, 30, 30);
		panel1.add(cube16);
		
		JLabel cube13 = new JLabel("1");
		cube13.setOpaque(true);
		cube13.setHorizontalAlignment(SwingConstants.CENTER);
		cube13.setBounds(5, 45, 30, 30);
		panel1.add(cube13);
		
		JLabel cube17 = new JLabel("1");
		cube17.setOpaque(true);
		cube17.setHorizontalAlignment(SwingConstants.CENTER);
		cube17.setBounds(45, 85, 30, 30);
		panel1.add(cube17);
		
		JLabel cube18 = new JLabel("1");
		cube18.setOpaque(true);
		cube18.setHorizontalAlignment(SwingConstants.CENTER);
		cube18.setBounds(85, 85, 30, 30);
		panel1.add(cube18);
		
		JLabel cube15 = new JLabel("1");
		cube15.setOpaque(true);
		cube15.setHorizontalAlignment(SwingConstants.CENTER);
		cube15.setBounds(85, 45, 30, 30);
		panel1.add(cube15);
		
		JLabel cube14 = new JLabel("1");
		cube14.setOpaque(true);
		cube14.setHorizontalAlignment(SwingConstants.CENTER);
		cube14.setBounds(45, 45, 30, 30);
		panel1.add(cube14);
		
		panel2.setLayout(null);
		panel2.setBounds(197, 152, 120, 120);
		contentPane.add(panel2);
		
		JLabel cube21 = new JLabel("2");
		cube21.setOpaque(true);
		cube21.setHorizontalAlignment(SwingConstants.CENTER);
		cube21.setBounds(45, 5, 30, 30);
		panel2.add(cube21);
		
		JLabel cube20 = new JLabel("2");
		cube20.setOpaque(true);
		cube20.setHorizontalAlignment(SwingConstants.CENTER);
		cube20.setBounds(5, 5, 30, 30);
		panel2.add(cube20);
		
		JLabel cube22 = new JLabel("2");
		cube22.setOpaque(true);
		cube22.setHorizontalAlignment(SwingConstants.CENTER);
		cube22.setBounds(85, 5, 30, 30);
		panel2.add(cube22);
		
		JLabel cube26 = new JLabel("2");
		cube26.setOpaque(true);
		cube26.setHorizontalAlignment(SwingConstants.CENTER);
		cube26.setBounds(5, 85, 30, 30);
		panel2.add(cube26);
		
		JLabel cube23 = new JLabel("2");
		cube23.setOpaque(true);
		cube23.setHorizontalAlignment(SwingConstants.CENTER);
		cube23.setBounds(5, 45, 30, 30);
		panel2.add(cube23);
		
		JLabel cube27 = new JLabel("2");
		cube27.setOpaque(true);
		cube27.setHorizontalAlignment(SwingConstants.CENTER);
		cube27.setBounds(45, 85, 30, 30);
		panel2.add(cube27);
		
		JLabel cube28 = new JLabel("2");
		cube28.setOpaque(true);
		cube28.setHorizontalAlignment(SwingConstants.CENTER);
		cube28.setBounds(85, 85, 30, 30);
		panel2.add(cube28);
		
		JLabel cube25 = new JLabel("2");
		cube25.setOpaque(true);
		cube25.setHorizontalAlignment(SwingConstants.CENTER);
		cube25.setBounds(85, 45, 30, 30);
		panel2.add(cube25);
		
		JLabel cube24 = new JLabel("2");
		cube24.setOpaque(true);
		cube24.setHorizontalAlignment(SwingConstants.CENTER);
		cube24.setBounds(45, 45, 30, 30);
		panel2.add(cube24);
		
		panel3.setLayout(null);
		panel3.setBounds(332, 152, 120, 120);
		contentPane.add(panel3);
		
		JLabel cube31 = new JLabel("3");
		cube31.setOpaque(true);
		cube31.setHorizontalAlignment(SwingConstants.CENTER);
		cube31.setBounds(45, 5, 30, 30);
		panel3.add(cube31);
		
		JLabel cube30 = new JLabel("3");
		cube30.setOpaque(true);
		cube30.setHorizontalAlignment(SwingConstants.CENTER);
		cube30.setBounds(5, 5, 30, 30);
		panel3.add(cube30);
		
		JLabel cube32 = new JLabel("3");
		cube32.setOpaque(true);
		cube32.setHorizontalAlignment(SwingConstants.CENTER);
		cube32.setBounds(85, 5, 30, 30);
		panel3.add(cube32);
		
		JLabel cube36 = new JLabel("3");
		cube36.setOpaque(true);
		cube36.setHorizontalAlignment(SwingConstants.CENTER);
		cube36.setBounds(5, 85, 30, 30);
		panel3.add(cube36);
		
		JLabel cube33 = new JLabel("3");
		cube33.setOpaque(true);
		cube33.setHorizontalAlignment(SwingConstants.CENTER);
		cube33.setBounds(5, 45, 30, 30);
		panel3.add(cube33);
		
		JLabel cube37 = new JLabel("3");
		cube37.setOpaque(true);
		cube37.setHorizontalAlignment(SwingConstants.CENTER);
		cube37.setBounds(45, 85, 30, 30);
		panel3.add(cube37);
		
		JLabel cube38 = new JLabel("3");
		cube38.setOpaque(true);
		cube38.setHorizontalAlignment(SwingConstants.CENTER);
		cube38.setBounds(85, 85, 30, 30);
		panel3.add(cube38);

		JLabel cube35 = new JLabel("3");
		cube35.setOpaque(true);
		cube35.setHorizontalAlignment(SwingConstants.CENTER);
		cube35.setBounds(85, 45, 30, 30);
		panel3.add(cube35);
		
		JLabel cube34 = new JLabel("3");
		cube34.setOpaque(true);
		cube34.setHorizontalAlignment(SwingConstants.CENTER);
		cube34.setBounds(45, 45, 30, 30);
		panel3.add(cube34);
		
		panel4.setLayout(null);
		panel4.setBounds(467, 152, 120, 120);
		contentPane.add(panel4);
		
		JLabel cube41 = new JLabel("4");
		cube41.setOpaque(true);
		cube41.setHorizontalAlignment(SwingConstants.CENTER);
		cube41.setBounds(45, 5, 30, 30);
		panel4.add(cube41);
		
		JLabel cube40 = new JLabel("4");
		cube40.setOpaque(true);
		cube40.setHorizontalAlignment(SwingConstants.CENTER);
		cube40.setBounds(5, 5, 30, 30);
		panel4.add(cube40);
		
		JLabel cube42 = new JLabel("4");
		cube42.setOpaque(true);
		cube42.setHorizontalAlignment(SwingConstants.CENTER);
		cube42.setBounds(85, 5, 30, 30);
		panel4.add(cube42);
		
		JLabel cube46 = new JLabel("4");
		cube46.setOpaque(true);
		cube46.setHorizontalAlignment(SwingConstants.CENTER);
		cube46.setBounds(5, 85, 30, 30);
		panel4.add(cube46);
		
		JLabel cube43 = new JLabel("4");
		cube43.setOpaque(true);
		cube43.setHorizontalAlignment(SwingConstants.CENTER);
		cube43.setBounds(5, 45, 30, 30);
		panel4.add(cube43);
		
		JLabel cube47 = new JLabel("4");
		cube47.setOpaque(true);
		cube47.setHorizontalAlignment(SwingConstants.CENTER);
		cube47.setBounds(45, 85, 30, 30);
		panel4.add(cube47);
		
		JLabel cube48 = new JLabel("4");
		cube48.setOpaque(true);
		cube48.setHorizontalAlignment(SwingConstants.CENTER);
		cube48.setBounds(85, 85, 30, 30);
		panel4.add(cube48);
		
		JLabel cube45 = new JLabel("4");
		cube45.setOpaque(true);
		cube45.setHorizontalAlignment(SwingConstants.CENTER);
		cube45.setBounds(85, 45, 30, 30);
		panel4.add(cube45);
		
		JLabel cube44 = new JLabel("4");
		cube44.setOpaque(true);
		cube44.setHorizontalAlignment(SwingConstants.CENTER);
		cube44.setBounds(45, 45, 30, 30);
		panel4.add(cube44);
		
		panel0.setLayout(null);
		panel0.setBounds(197, 16, 120, 120);
		contentPane.add(panel0);
		
		JLabel cube01 = new JLabel("0");
		cube01.setOpaque(true);
		cube01.setHorizontalAlignment(SwingConstants.CENTER);
		cube01.setBounds(45, 5, 30, 30);
		panel0.add(cube01);
		
		JLabel cube00 = new JLabel("0");
		cube00.setOpaque(true);
		cube00.setHorizontalAlignment(SwingConstants.CENTER);
		cube00.setBounds(5, 5, 30, 30);
		panel0.add(cube00);
		
		JLabel cube02 = new JLabel("0");
		cube02.setOpaque(true);
		cube02.setHorizontalAlignment(SwingConstants.CENTER);
		cube02.setBounds(85, 5, 30, 30);
		panel0.add(cube02);
		
		JLabel cube06 = new JLabel("0");
		cube06.setOpaque(true);
		cube06.setHorizontalAlignment(SwingConstants.CENTER);
		cube06.setBounds(5, 85, 30, 30);
		panel0.add(cube06);
		
		JLabel cube03 = new JLabel("0");
		cube03.setOpaque(true);
		cube03.setHorizontalAlignment(SwingConstants.CENTER);
		cube03.setBounds(5, 45, 30, 30);
		panel0.add(cube03);
		
		JLabel cube07 = new JLabel("0");
		cube07.setOpaque(true);
		cube07.setHorizontalAlignment(SwingConstants.CENTER);
		cube07.setBounds(45, 85, 30, 30);
		panel0.add(cube07);
		
		JLabel cube08 = new JLabel("0");
		cube08.setOpaque(true);
		cube08.setHorizontalAlignment(SwingConstants.CENTER);
		cube08.setBounds(85, 85, 30, 30);
		panel0.add(cube08);
		
		JLabel cube05 = new JLabel("0");
		cube05.setHorizontalAlignment(SwingConstants.CENTER);
		cube05.setBounds(85, 45, 30, 30);
		cube05.setOpaque(true);
		panel0.add(cube05);
		
		JLabel cube04 = new JLabel("0");
		cube04.setOpaque(true);
		cube04.setHorizontalAlignment(SwingConstants.CENTER);
		cube04.setBounds(45, 45, 30, 30);
		panel0.add(cube04);
		
		panel5.setLayout(null);
		panel5.setBounds(197, 288, 120, 120);
		contentPane.add(panel5);
		
		JLabel cube51 = new JLabel("5");
		cube51.setOpaque(true);
		cube51.setHorizontalAlignment(SwingConstants.CENTER);
		cube51.setBounds(45, 5, 30, 30);
		panel5.add(cube51);
		
		JLabel cube50 = new JLabel("5");
		cube50.setOpaque(true);
		cube50.setHorizontalAlignment(SwingConstants.CENTER);
		cube50.setBounds(5, 5, 30, 30);
		panel5.add(cube50);
		
		JLabel cube52 = new JLabel("5");
		cube52.setOpaque(true);
		cube52.setHorizontalAlignment(SwingConstants.CENTER);
		cube52.setBounds(85, 5, 30, 30);
		panel5.add(cube52);
		
		JLabel cube56 = new JLabel("5");
		cube56.setOpaque(true);
		cube56.setHorizontalAlignment(SwingConstants.CENTER);
		cube56.setBounds(5, 85, 30, 30);
		panel5.add(cube56);
		
		JLabel cube53 = new JLabel("5");
		cube53.setOpaque(true);
		cube53.setHorizontalAlignment(SwingConstants.CENTER);
		cube53.setBounds(5, 45, 30, 30);
		panel5.add(cube53);
		
		JLabel cube57 = new JLabel("5");
		cube57.setOpaque(true);
		cube57.setHorizontalAlignment(SwingConstants.CENTER);
		cube57.setBounds(45, 85, 30, 30);
		panel5.add(cube57);
		
		JLabel cube58 = new JLabel("5");
		cube58.setOpaque(true);
		cube58.setHorizontalAlignment(SwingConstants.CENTER);
		cube58.setBounds(85, 85, 30, 30);
		panel5.add(cube58);
		
		JLabel cube55 = new JLabel("5");
		cube55.setOpaque(true);
		cube55.setHorizontalAlignment(SwingConstants.CENTER);
		cube55.setBounds(85, 45, 30, 30);
		panel5.add(cube55);
		
		JLabel cube54 = new JLabel("5");
		cube54.setOpaque(true);
		cube54.setHorizontalAlignment(SwingConstants.CENTER);
		cube54.setBounds(45, 45, 30, 30);
		panel5.add(cube54);
		
		JLabel[][] tempStickers = {{cube00, cube01,cube02,cube03,cube04,cube05,cube06,cube07,cube08},
								   {cube10, cube11,cube12,cube13,cube14,cube15,cube16,cube17,cube18},
								   {cube20, cube21,cube22,cube23,cube24,cube25,cube26,cube27,cube28},
								   {cube30, cube31,cube32,cube33,cube34,cube35,cube36,cube37,cube38},
								   {cube40, cube41,cube42,cube43,cube44,cube45,cube46,cube47,cube48},
								   {cube50, cube51,cube52,cube53,cube54,cube55,cube56,cube57,cube58}};
		stickers = tempStickers;
	}

	public void arrangeStickers(String scramble){
//		populateStickers();
		
		CubeTwister ct = new CubeTwister(scramble);
		int[][] colorCode = ct.getCube();
		
		for(int[] i : colorCode){
			for(int j : i){
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		for(int i = 0; i<=5;i++){
			for(int j = 0; j<=8;j++){
				switch (colorCode[i][j]){
					case 0: stickers[i][j].setBackground(Color.WHITE);stickers[i][j].setText("");
							break;
					case 1: stickers[i][j].setBackground(Color.ORANGE);stickers[i][j].setText("");
							break;
					case 2: stickers[i][j].setBackground(Color.GREEN);stickers[i][j].setText("");
							break;
					case 3: stickers[i][j].setBackground(Color.RED);stickers[i][j].setText("");
							break;
					case 4: stickers[i][j].setBackground(Color.BLUE);stickers[i][j].setText("");
							break;
					case 5: stickers[i][j].setBackground(Color.YELLOW);stickers[i][j].setText("");
							break;
				}
			}
		}
		
		for (int i = 0; i <=8;i++){
			panel0.add(stickers[0][i]);
			panel1.add(stickers[1][i]);
			panel2.add(stickers[2][i]);
			panel3.add(stickers[3][i]);
			panel4.add(stickers[4][i]);
			panel5.add(stickers[5][i]);
		}
		
		
	}
}

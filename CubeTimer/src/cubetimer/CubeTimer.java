package cubetimer;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

import java.awt.Font;
import java.awt.event.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JSplitPane;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JList;
public class CubeTimer extends JFrame {
	ScrambleShower ss = new ScrambleShower();
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CubeTimer frame = new CubeTimer();
					frame.setVisible(true);
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CubeTimer() {
		//Open companion ScrambleShowerWindow
		setResizable(false);
		ss.setVisible(true);
		
		//set Frame
		setFont(new Font("Dialog", Font.PLAIN, 39));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1337, 861);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{418, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{22, 0, 192, 20, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		
		JTextArea txtCalculations = new JTextArea();
		txtCalculations.setText("Avg: N/A\r\n  \r\nAo5: N/A\r\n    \r\nAo12: N/A\r\n   \r\nPB: N/A \r\n");
		GridBagConstraints gbc_txtCalculations = new GridBagConstraints();
		gbc_txtCalculations.insets = new Insets(0, 0, 5, 0);
		gbc_txtCalculations.fill = GridBagConstraints.BOTH;
		gbc_txtCalculations.gridx = 3;
		gbc_txtCalculations.gridy = 2;
		contentPane.add(txtCalculations, gbc_txtCalculations);
		
		DefaultListModel<String> timeModel = new DefaultListModel();
		JList timeList = new JList(timeModel);
		GridBagConstraints gbc_timeList = new GridBagConstraints();
		gbc_timeList.insets = new Insets(0, 0, 5, 5);
		gbc_timeList.fill = GridBagConstraints.BOTH;
		gbc_timeList.gridx = 1;
		gbc_timeList.gridy = 2;
		contentPane.add(timeList, gbc_timeList);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.anchor = GridBagConstraints.WEST;
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.gridx = 2;
		gbc_panel.gridy = 2;
		contentPane.add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JButton btnDNF = new JButton("DNF");
		btnDNF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = timeList.getSelectedIndex();
				
				
				timeModel.setElementAt("DNF", index);
				
				Calculator c;
				Object[] obj = timeModel.toArray();
				String[] str = new String[obj.length];
				  
				for(int i = 0; i < obj.length ; i++){
					str[i] = (String) obj[i];
				}
				  
				c = new Calculator(str);
				txtCalculations.setText(c.getOutput());
			
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 0;
		panel.add(btnDNF, gbc_btnNewButton);
		
		JButton plus2 = new JButton("+2");
		plus2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int index = timeList.getSelectedIndex();
				String item = (String) timeList.getSelectedValue();
				
				timeModel.setElementAt(Double.toString(Double.parseDouble(item)+2), index);
				
			}
		});
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1.gridx = 0;
		gbc_btnNewButton_1.gridy = 1;
		panel.add(plus2, gbc_btnNewButton_1);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = timeList.getSelectedIndex();
				timeModel.remove(index);
				
				Calculator c;
				Object[] obj = timeModel.toArray();
				String[] str = new String[obj.length];
				  
				for(int i = 0; i < obj.length ; i++){
					str[i] = (String) obj[i];
				}
				  
				c = new Calculator(str);
			txtCalculations.setText(c.getOutput());
			
			}
		});
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_2.gridx = 0;
		gbc_btnNewButton_2.gridy = 2;
		panel.add(btnDelete, gbc_btnNewButton_2);
		
		
		//Scrambler Setup
		JLabel lblScramble = new JLabel("temp");
		GridBagConstraints gbc_lblScramble = new GridBagConstraints();
		gbc_lblScramble.insets = new Insets(0, 0, 0, 5);
		gbc_lblScramble.anchor = GridBagConstraints.NORTH;
		gbc_lblScramble.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblScramble.gridx = 0;
		gbc_lblScramble.gridy = 3;
		contentPane.add(lblScramble, gbc_lblScramble);
		
		//comboBox setup
		JComboBox<String> puzzleList = new JComboBox();
		puzzleList.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				lblScramble.setText(scramble(puzzleList.getSelectedItem().toString()));
			}
		});
		GridBagConstraints gbc_puzzleList = new GridBagConstraints();
		gbc_puzzleList.insets = new Insets(0, 0, 5, 5);
		gbc_puzzleList.fill = GridBagConstraints.HORIZONTAL;
		gbc_puzzleList.gridx = 0;
		gbc_puzzleList.gridy = 1;
		contentPane.add(puzzleList, gbc_puzzleList);
		puzzleList.addItem("3x3");
		puzzleList.addItem("Temp");
		
		//Timer
		JLabel lblTime = new JLabel("0.00");
		lblTime.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblTime = new GridBagConstraints();
		gbc_lblTime.fill = GridBagConstraints.BOTH;
		gbc_lblTime.insets = new Insets(0, 0, 5, 5);
		gbc_lblTime.gridx = 0;
		gbc_lblTime.gridy = 2;
		contentPane.add(lblTime, gbc_lblTime);
		
		Timer tm = new Timer(10, new ActionListener() {
			public void actionPerformed(ActionEvent e){
				double dblTime = Double.parseDouble(lblTime.getText()) + .01;
				DecimalFormat df = new DecimalFormat("##.##");
				dblTime = Double.valueOf(df.format(dblTime));
				String newTime = Double.toString(dblTime);
				lblTime.setText(newTime);
			}
		});
		
		//Ghost Activator
		JTextArea ghostSpace=new JTextArea();
		ghostSpace.setEditable(false);
		GridBagConstraints gbc_ghostSpace = new GridBagConstraints();
		gbc_ghostSpace.anchor = GridBagConstraints.NORTH;
		gbc_ghostSpace.fill = GridBagConstraints.HORIZONTAL;
		gbc_ghostSpace.insets = new Insets(0, 0, 5, 5);
		gbc_ghostSpace.gridx = 0;
		gbc_ghostSpace.gridy = 0;
		contentPane.add(ghostSpace, gbc_ghostSpace);
		ghostSpace.setOpaque(false);
		
		
		//Add Timer Functionality
		ghostSpace.addKeyListener(new KeyListener(){ 
			
			int timeCheck = 0;
			Calculator c;
			public void keyPressed(KeyEvent ke){ 
		         if(ke.getKeyCode()==KeyEvent.VK_SPACE){
		              if (tm.isRunning() == true && timeCheck == 1){
		            	  tm.stop();
		            	  timeCheck = 2;
		            	  lblScramble.setText(scramble(puzzleList.getSelectedItem().toString()));
		  				  timeModel.addElement(lblTime.getText());
		  				  
		  				  if(timeModel.size() == 0){
		  					  c = new Calculator();
		  					  
		  					  txtCalculations.setText(c.getOutput());

		  				  } else {
		  					  Object[] obj = timeModel.toArray();
		  					  String[] str = new String[obj.length];
		  					  
		  					  for(int i = 0; i < obj.length ; i++){
		  						  str[i] = (String) obj[i];
		  					  }
		  					  
		  					 c = new Calculator(str);
		  					 txtCalculations.setText(c.getOutput());
		  				  }
		  					  
		              }
		         }
		     }
		    

			@Override
			public void keyReleased(KeyEvent ke) {
				if(ke.getKeyCode()==KeyEvent.VK_SPACE){
					if(tm.isRunning() == false && timeCheck == 0){
						tm.start();
						lblTime.setText("0.00");
						timeCheck = 1;
					} else if (tm.isRunning() == false && timeCheck == 2){
						timeCheck = 0;
					}
				}
				
			}

			@Override
			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		

	} private String scramble(String puzzle){
		Scrambler sc;
		if (puzzle.equals("3x3")){
			sc = new ThreeThree();
			sc.scramble();
			ss.arrangeStickers(sc.getScramble());

			return sc.getScramble();
		} else if (puzzle.equals("Temp")){
			sc = new TempScramble();
			sc.scramble();
			sc.scramble();
			return sc.getScramble();
		}
		return null;
	}

} class Calculator {
	
	//Class setup
	private String output;
	
	public Calculator(String[] times){
		output = "Avg: " + absAverage(times) +  "\r\n  \r\n" + 
				"Ao5: " + rollAverage(times, 5) + "\r\n    \r\n" + 
				"Ao12: " + rollAverage(times,12) +  "\r\n   \r\n" + 
				"PB: " + personalBest(times);
	} 
	
	public Calculator(){
		output = "Avg: N/A\r\n  \r\nAo5: N/A\r\n    \r\nAo12: N/A\r\n   \r\nPB: N/A \r\n";
	}
	
	//Calculate rolling average
	private String absAverage(String[] times){
		
		
		double average;
		double total = 0;
		int counter = 0;
		for(String time : times){
			if(time.equals("DNF")){
				continue;
			} else {
				total += Double.parseDouble(time);
				counter++;
			}
		}
		
		average = total /(double) counter;
		
		DecimalFormat df = new DecimalFormat("##.##");
		average = Double.valueOf(df.format(average));
		return Double.toString(average);
	
	} private String rollAverage(String[] times, int number){
		if (times.length < number){ return "N/A";} else{
		
		double[] itemsOfTimes= new double[number];
		double[] reducedIOT = new double[number - 2];
		int DNFCounter = 0;
		double dblAVG;
		String strAVG;
		
		//grab [number] items before last item;
		int counterIOT = 0;
		for(int i = times.length - number; i < times.length ; i++){
			if(times[i].equals("DNF")){
				itemsOfTimes[counterIOT] = Double.MAX_VALUE;
				DNFCounter++;
			} else {
				itemsOfTimes[counterIOT] = Double.parseDouble(times[i]);
				counterIOT++;
			}
		}
		
		//grab highest number
		int indexHigh = 0;
		double valueHigh = itemsOfTimes[0];
		
		for(int i = 0; i < itemsOfTimes.length; i++){
			if (itemsOfTimes[i] > valueHigh){
				valueHigh = itemsOfTimes[i];
				indexHigh = i;
			}
		}
		
		//grab lowest number
		int indexLow = 0;
		double valueLow = itemsOfTimes[0];
		
		for(int i = 0; i < itemsOfTimes.length; i++){
			if(itemsOfTimes[i] < valueLow){
				valueLow = itemsOfTimes[i];
				indexLow = i;
			}
		}
		
		//reduce the IOT
		int indexReducedArray = 0;
	
		for(int i = 0; i < itemsOfTimes.length; i++){
			if(i == indexHigh || i == indexLow){
				continue;
			} else {
				reducedIOT[indexReducedArray] = itemsOfTimes[i];
				indexReducedArray++;
			}
		}
		
		//Calculate the average
		double total = 0;
		
		
		for(double item : reducedIOT){
			total+= item;
		}
		
		dblAVG = total / (double) reducedIOT.length;
		
		
		//Check for Double DNF's
		if(DNFCounter > 1){
			strAVG = "DNF";
		}
		
		DecimalFormat df = new DecimalFormat("##.##");
		dblAVG = Double.valueOf(df.format(dblAVG));
		strAVG = Double.toString(dblAVG);
		return strAVG;
		}
		
	} private String personalBest(String[] times){
		for(int i = 0 ; i < times.length; i++){
			if (times[i].equals("DNF")){
				times[i] = Double.toString(Double.MAX_VALUE);
			}
		}
		
		double PB = Double.parseDouble(times[0]);
		
		for(int i = 1; i < times.length; i++){
			if (Double.parseDouble(times[i]) < PB){
				PB = Double.parseDouble(times[i]);
			}
		}
		DecimalFormat df = new DecimalFormat("##.##");
		PB = Double.valueOf(df.format(PB));
		return Double.toString(PB);
		
	}public String getOutput(){
		return output;
	}
}

package cubetimer;

import java.util.Scanner;

import javax.swing.DefaultListModel;

public class ScrambleDebug {
	public static void main(String[] args){
		ScrambleShower SS = new ScrambleShower();
		Scrambler sc = new ThreeThree();
		SS.arrangeStickers(sc.getScramble());
		SS.setVisible(true);
		System.out.println(sc.getScramble());
		
		Scanner ui = new Scanner(System.in);
		String temp = ui.next();
		
		sc.scramble();
		SS.arrangeStickers(sc.getScramble());
		System.out.println(sc.getScramble());
//		CubeTwister ct = new CubeTwister();
		
	}
	
}

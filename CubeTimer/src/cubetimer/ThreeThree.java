package cubetimer;

import java.util.Random;

public class ThreeThree extends Scrambler{
	public ThreeThree(){
		super();
	}

	@Override
	public void scramble() {
		String[] sides = {"R", "L", "U", "D", "F", "B"};
		String[] modifier = {"", "'", "2"};
		Random rand = new Random();
		String[] scramble33 = new String[25];
	
		for(int i = 0; i<25;i++){
			String side = sides[rand.nextInt(6)];
			
			if(i != 0){
				while(side.equals(scramble33[i-1].substring(0, 1))) {
					side = sides[rand.nextInt(6)];
				}
			}
			
			side += modifier[rand.nextInt(3)];
			
			scramble33[i] = side;
		}
		scramble = "";
		for(String item : scramble33){
			scramble += " " + item;
		}
		
	}
	public String getScramble(){
		return scramble;
	}
	
	
} 
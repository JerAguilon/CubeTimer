package cubetimer;

import java.util.Random;

public class TempScramble extends Scrambler{
	public TempScramble(){
		super();
	}


	@Override
	public void scramble() {
		scramble = "Temporary Scramble";
		}
	public String getScramble(){
		return scramble;
	}
	
	
}

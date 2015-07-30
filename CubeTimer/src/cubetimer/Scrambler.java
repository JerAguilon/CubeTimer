package cubetimer;

public abstract class Scrambler {
	protected static String scramble = "";
	protected String[] arrScramble;
	
	public Scrambler(){
		scramble();
	}

	abstract public void scramble();
	abstract protected String getScramble();
}

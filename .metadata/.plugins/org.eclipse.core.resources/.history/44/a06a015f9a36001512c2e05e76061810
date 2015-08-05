package cubetimer;

public class CubeTwister {
	private int[][] cube = {{0,0,0,0,0,0,0,0,0}, //Top Side 0
							{1,1,1,1,1,1,1,1,1}, //Left side 1
						    {2,2,2,2,2,2,2,2,2}, //Front side 2
						    {3,3,3,3,3,3,3,3,3}, // Right side 3
						    {4,4,4,4,4,4,4,4,4}, // Back side 4
						    {5,5,5,5,5,5,5,5,5}}; // Bottom side 5
	private int[] temp = new int[3];
	private int intTemp;
	private String[] arrScramble = new String[25];
	
	public CubeTwister(String scramble){
		resetCube();
		
		arrScramble = scramble.split(" ");
		for(String str : arrScramble){ System.out.println(str);}
		for(int i = 0; i < arrScramble.length;i++){
			switch (arrScramble[i]){
				case "R": R();
					break;
				case "R'": R();R();R();
					break;
				case "R2": R();R();
					break;
				
				case "L": L();
					break;
				case "L'": L();L();L();
					break;
				case "L2": L();L();
					break;
				
				case "U": U();
					break;
				case "U'": U();U();U();
					break;
				case "U2": U();U();
					break;
				
				case "D": D();
					break;
				case "D'": D();D();D();
					break;
				case "D2": D();D();
					break;
				
				case "F": F();
					break;
				case "F'": F();F();F();
					break;
				case "F2": F();F();
					break;
				
				case "B": B();
					break;
				case "B'": B();B();B();
					break;
				case "B2": B();B();
					break;
			}
		}
	}
	
	public CubeTwister(){
		System.out.print("CubeTwister Debug Mode\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		debugCube();
		R();
		for(int[] i : cube){
			for(int j : i){
				System.out.print(j + " " );
			}
			System.out.println();
		}
		
	} private void B(){
		//0,1,2 of 0 with 0,3,6 of 1
		for(int i = 0; i<3; i++){
			temp[i] = cube[0][i];
			cube[0][i] = cube[1][i*3];
			cube[1][i*3] = temp[i];
		}
		
		//0,1,2 of 0 with 6,7,8 of 5
		for(int i = 0;i<3; i++){
			temp[i] = cube[0][i];
			cube[0][i] = cube[5][i+6];
			cube[5][i+6] = temp[i];
		}
		
		//0,1,2 of 0 with 2,5,8 of 3
		for(int i = 0;i<3; i++){
			temp[i] = cube[0][i];
			cube[0][i] =cube[3][2+(i*3)];
			cube[3][2+(i*3)] = temp[i];
		}
		//Fix permutation on 1 and 3
		intTemp = cube[1][0];
		cube[1][0] = cube[1][6];
		cube[1][6] = intTemp;
		
		intTemp = cube[3][2];
		cube[3][2] = cube[3][8];
		cube[3][8] = intTemp;
		
		//rotate 4
		cube[4] = rotate(cube[4]);
	} private void F(){
		//6,7,8 of 0 with 0,3,6 of 3 
		for(int i = 6; i<=8; i++){
			temp[i-6] = cube[0][i];
			cube[0][i] = cube[3][3*(i-6)];
			cube[3][3*(i-6)] = temp[i-6];
		}
		//6,7,8 of 0 with 0,1,2 of 5
		for(int i = 6; i <= 8; i++){
			temp[i-6] = cube[0][i];
			cube[0][i] = cube[5][i-6];
			cube[5][i-6] = temp[i-6];
		}
		
		//6,7,8 of 0 with 2,5,8 of 1
		for(int i =6; i<= 8; i++){
			temp[i-6] = cube[0][i];
			cube[0][i] = cube[1][3*(i-6)+2];
			cube[1][3*(i-6)+2] = temp[i-6];
		}
		
		//rotate 2
		cube[2] = rotate(cube[2]);
		
		intTemp = cube[0][6];
		cube[0][6] = cube[0][8];
		cube[0][8] = intTemp;
		
		intTemp = cube[5][0];
		cube[5][0] = cube[5][2];
		cube[5][2] = intTemp;
		
	} private void U(){
		//1 and 4; 1 and 3; 1 and 2
		for(int i = 0; i < 3; i++){
			temp[i] = cube[1][i];
			cube[1][i] = cube[4][i];
			cube[4][i] = temp[i];
		}

		
		//1 and 3 switch
		for(int i = 0; i < 3; i++){
			temp[i] = cube[1][i];
			cube[1][i] = cube[3][i];
			cube[3][i] = temp[i];
		}
		//1 and 2 switch
		for(int i = 0; i < 3; i++){
			temp[i] = cube[1][i];
			cube[1][i] = cube[2][i];
			cube[2][i] = temp[i];
		}
		
//		intTemp = cube[4][0];
//		cube[4][0]= cube[4][2];
//		cube[4][2] = intTemp;
		
		//Rotate 0
		cube[0] = rotate(cube[0]);
	} private void D(){
		//1 and 2, 1 and 3, 1 and 4
		for(int i = 6; i <9; i++){
			temp[i-6] = cube[1][i];
			cube[1][i] = cube[2][i];
			cube[2][i] = temp[i-6];
		}
		
		for(int i = 6; i < 9; i++){
			temp[i-6] = cube[1][i];
			cube[1][i] = cube[3][i];
			cube[3][i] = temp[i-6];
		}
		
		for(int i = 6; i < 9; i++){
			temp[i-6] = cube[1][i];
			cube[1][i] = cube[4][i];
			cube[4][i] = temp[i-6];
		}
		
		//Rotate 5
		cube[5] = rotate(cube[5]);
		
//		//reverse side 1 for permutations
//		intTemp = cube[1][6];
//		cube[1][6] = cube[1][8];
//		cube[1][8] = intTemp;
	} private void R(){
		//2,5,8 of 0 with 6,3,0 of 4
		
		intTemp = cube[0][2]; //reverse array
		cube[0][2] = cube[0][8];
		cube[0][8] = intTemp;
		
		for(int i = 0; i <= 6; i+=3){
			temp[i/3] = cube[0][i+2];
			cube[0][i+2] = cube[4][i];
			cube[4][i] = temp[i/3];
		}
		
		//2,5,8 of 0 with 2,5,8 of 5
		intTemp = cube[0][2]; //reverse array
		cube[0][2] = cube[0][8];
		cube[0][8] = intTemp;

		for(int i = 2; i <=8; i+=3){
			temp[(i-2)/3] = cube[0][i];
			cube[0][i] = cube[5][i];
			cube[5][i] = temp[(i-2)/3];
		}
		
		//2,5,8 of 0 with 2,5,8 of 2
		
		for(int i = 2; i <=8; i+=3){
			temp[(i-2)/3] = cube[0][i];
			cube[0][i] = cube[2][i];
			cube[2][i] = temp[(i-2)/3];
		}
		
//		intTemp = cube[4][0]; //reverse array
//		cube[4][0] = cube[4][6];
//		cube[4][6] = intTemp;

		//Rotate 3
		cube[3] = rotate(cube[3]);
		
	} private void L(){
		//0,3,6 of 0 with 0,3,6 of 2
		
		for(int i = 0; i <=6; i+=3){
			temp[i/3] = cube[0][i];
			cube[0][i] = cube[2][i];
			cube[2][i] = temp[i/3];
		}
		//0,3,6 of 0 with 0,3,6 of 5
		for(int i = 0; i <=6; i+=3){
			temp[i/3] = cube[0][i];
			cube[0][i] = cube[5][i];
			cube[5][i] = temp[i/3];
		}
		//0,3,6 of 0 with 2,5,8 of 4
		for(int i = 0; i <=6; i+=3){
			temp[i/3] = cube[0][i];
			cube[0][i] = cube[4][i+2];
			cube[4][i+2] = temp[i/3];
		}
		intTemp = cube[0][0]; //reverse array
		cube[0][0] = cube[0][6];
		cube[0][6] = intTemp;
		
		intTemp = cube[4][2]; //reverse array
		cube[4][2] = cube[4][8];
		cube[4][8] = intTemp;
		

		//Rotate 1
		cube[1] = rotate(cube[1]);
		
	} private int[] rotate(int[]side){
		int temp;
		//0 and 2 switch
		temp = side[0];
		side[0] = side[2];
		side[2] = temp;
		
		//0 and 8 switch
		temp = side[0];
		side[0] = side[8];
		side[8] = temp;
		
		//0 and 6 switch
		temp = side[0];
		side[0] = side[6];
		side[6] = temp;
		
		//1 and 5 switch
		temp = side[1];
		side[1] = side[5];
		side[5] = temp;
		
		//1 and 7 switch
		temp = side[1];
		side[1] = side[7];
		side[7] = temp;
		
		//1 and 3 switch
		temp = side[1];
		side[1] = side[3];
		side[3] = temp;
		
		return side;
		
	} private void resetCube(){
		int[][] reset =  {{0,0,0,0,0,0,0,0,0}, //Top Side 0
				{1,1,1,1,1,1,1,1,1}, //Left side 1
			    {2,2,2,2,2,2,2,2,2}, //Front side 2
			    {3,3,3,3,3,3,3,3,3}, // Right side 3
			    {4,4,4,4,4,4,4,4,4}, // Back side 4
			    {5,5,5,5,5,5,5,5,5}}; // Bottom side 5
		cube = reset;
		
		
	} private void debugCube(){
		int[][] debugger = {{0,0,2,0,0,1,0,0,0}, //Top Side 0
				{0,0,0,0,0,0,0,0,0}, //Left side 1
				{0,0,11,0,0,10,0,0,9}, //Front side 2
				{0,0,0,0,0,0,0,0,0}, // Right side 3
				{3,0,0,4,0,0,5,0,0}, // Back side 4
				{0,0,8,0,0,7,0,0,6}}; // Bottom side 5
		cube = debugger;
	} public int[][] getCube(){
		return cube;
	}
}

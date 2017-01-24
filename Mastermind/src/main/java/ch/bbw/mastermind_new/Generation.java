package ch.bbw.mastermind_new;

import java.util.Random;

public class Generation {
	
	public int [] generateNumberRow() {
		int max = 6;
		int min = 1;
		int[] numberRow = new int[4];
		
		Random rn = new Random();
		numberRow[0] = rn.nextInt(max - min + 1) + min;
		numberRow[1] = rn.nextInt(max - min + 1) + min;
		numberRow[2] = rn.nextInt(max - min + 1) + min;
		numberRow[3] = rn.nextInt(max - min + 1) + min;
		
		// zum testen -> wird im echten Spiel nicht gebraucht
		System.out.println(numberRow[0]+""+numberRow[1]+""+numberRow[2]+""+numberRow[3]);
		
		return numberRow;
	}

}

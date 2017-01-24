package ch.bbw.mastermind_new;

import java.util.Scanner;

public class Input {
	
	public void getNumberRow(int[] numberRow, int[] userNumberRow) {
		Scanner sc = new Scanner(System.in);
		int numbers = sc.nextInt();

		String number = String.valueOf(numbers);
		for(int i = 0; i < number.length(); i++) {
		    int j = Character.digit(number.charAt(i), 10);
		    userNumberRow[i] = j;
		}
		
		
		Check c1 = new Check();
		c1.checkRow(numberRow, userNumberRow);
	}

}

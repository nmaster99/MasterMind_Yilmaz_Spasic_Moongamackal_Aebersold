package ch.bbw.mastermind_new;

public class Check {
	
	public void checkRow(int[] numberRow, int[] userNumberRow) {
		int correctPositions = 0;
		int correctNumbers = 0;
	
		if (userNumberRow[0] == numberRow[0]){
			correctPositions = correctPositions + 1;
		} else if(userNumberRow[0] == numberRow[1]) {
			correctNumbers = correctNumbers + 1;
		} else if(userNumberRow[0] == numberRow[2]) {
			correctNumbers = correctNumbers + 1;
		} else if(userNumberRow[0] == numberRow[3]) {
			correctNumbers = correctNumbers + 1;
		}
		
		if (userNumberRow[1] == numberRow[1]){
			correctPositions = correctPositions + 1;
		} else if(userNumberRow[1] == numberRow[0]) {
			correctNumbers = correctNumbers + 1;
		} else if(userNumberRow[1] == numberRow[2]) {
			correctNumbers = correctNumbers + 1;
		} else if(userNumberRow[1] == numberRow[3]) {
			correctNumbers = correctNumbers + 1;
		}
		
		if (userNumberRow[2] == numberRow[2]){
			correctPositions = correctPositions + 1;
		} else if(userNumberRow[2] == numberRow[0]) {
			correctNumbers = correctNumbers + 1;
		} else if(userNumberRow[2] == numberRow[1]) {
			correctNumbers = correctNumbers + 1;
		} else if(userNumberRow[2] == numberRow[3]) {
			correctNumbers = correctNumbers + 1;
		}
		
		if (userNumberRow[3] == numberRow[3]){
			correctPositions = correctPositions + 1;
		} else if(userNumberRow[3] == numberRow[0]) {
			correctNumbers = correctNumbers + 1;
		} else if(userNumberRow[3] == numberRow[1]) {
			correctNumbers = correctNumbers + 1;
		} else if(userNumberRow[3] == numberRow[2]) {
			correctNumbers = correctNumbers + 1;
		}
		
		Print p1 = new Print();
		
		if (correctPositions == 4) {
			p1.congratulations();
		} else {
			p1.retry(correctPositions, correctNumbers);

			Input i1 = new Input();
			i1.getNumberRow(numberRow, userNumberRow);
		}
	}

}

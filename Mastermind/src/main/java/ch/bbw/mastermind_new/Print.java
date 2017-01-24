package ch.bbw.mastermind_new;

public class Print {
	
	public void printStart() {
		System.out.println("Geben Sie 4 Zahlen zwischen 1 & 6 ein:");
	}
	
	public void congratulations() {
		System.out.println("Congratulations! You won! :)");
	}
	
	public void retry(int correctPositions, int correctNumbers) {
		System.out.println("correct Positions & Numbers: "+ correctPositions);
		System.out.println("correct Numbers: "+ correctNumbers);
	}

}

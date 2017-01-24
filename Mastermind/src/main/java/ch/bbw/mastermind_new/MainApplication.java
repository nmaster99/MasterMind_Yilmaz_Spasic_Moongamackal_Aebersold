package ch.bbw.mastermind_new;

public class MainApplication {
	
	public static void main(String[] args) {
		
		int[] userNumberRow = new int[4];
		int[] numberRow = null;
		
		Generation g1 = new Generation();
		Print p1 	  = new Print();
		Input i1 	  = new Input();
		
		numberRow = g1.generateNumberRow();
		
		p1.printStart();
		i1.getNumberRow(numberRow, userNumberRow);
	}

}

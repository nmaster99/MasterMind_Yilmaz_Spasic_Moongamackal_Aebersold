package ch.bbw.test;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import ch.bbw.mastermind_new.Generation;

public class TestGeneration {
	
	Generation generationTest;
	
	@Test
	public void testGeneration(){

		generationTest = new Generation();
		assertTrue(generationTest.generateNumberRow().length == 4);
	}

}

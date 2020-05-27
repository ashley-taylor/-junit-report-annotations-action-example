package github.ashley.taylor.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class SampleTest {

	@Test
	public void testPass() {
		
	}
	
	@Test
	@Disabled
	public void testSkip() {
		
	}
	
	@Test
	public void testFail() {
		Assertions.fail();
	}
	
}

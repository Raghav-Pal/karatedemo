package tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.intuit.karate.Results;
import com.intuit.karate.Runner;


class TestParallelWithJUnit4 {

	@Test
	void testParallel() {
		Results results = Runner.path("classpath:animals").tags("~@ignore").parallel(5);
		assertEquals(0, results.getFailCount(), results.getErrorMessages());
	}
	
	


}

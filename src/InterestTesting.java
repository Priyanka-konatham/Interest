import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InterestTesting {

	@Test
	void test() {
		Interest i = new Interest();
		assertEquals(100,i.simpleInterest(2000, 1, 5));
		assertEquals(127.62815625000003,i.compoundInterest(100, 5, 5));
	}

}

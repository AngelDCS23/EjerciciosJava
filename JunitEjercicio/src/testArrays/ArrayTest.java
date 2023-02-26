package testArrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayTest {

	@Test
	void testCompareArrays() {
		int[] Array = {1,2,4};
		int[] Array2 = {1,2,4};
		boolean actual = aaa.compareArrays(Array,Array2);
		assertEquals(true,actual);
	}
}

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class bubbleTests {

	@Test
	void test() {
		int[] array = { 1, 4, 3, 2, 36, 78, 43, 34, 65, 76, 23 };

		bubbleSort buba = new bubbleSort(array);
		array = buba.sort(array);

		assertEquals(2, array[1]);

	}

}

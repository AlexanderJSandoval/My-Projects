import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class insertionSortTest {

	@Test
	void test() {
		int[] array = { 1, 4, 3, 2, 36, 78, 43, 34, 65, 76, 23 };

		insertionSort inso = new insertionSort();
		inso.sort(array);

		assertEquals(2, array[1]);

	}


}

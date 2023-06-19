import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class mergeSortTest {
	@Test
	void test() {
		int[] array = { 1, 4, 3, 2, 36, 78, 43, 34, 65, 76, 23 };

		mergeSort meso = new mergeSort();
		meso.sort(array, 0, 10  );
		
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
		assertEquals(2, array[1]);

	}

}


public class bubbleSort {

	private int[] sortArray;

	public bubbleSort(int[] array) {
		this.sortArray = array;
	}

	// This will be my helper that switches the place of two items in the array
	public int[] switches(int[] array, int a, int b) {
		int c = array[a];
		array[a] = array[b];
		array[b] = c;

		return array;
	}

	// This is my method that does bubble sort
	public int[] sort(int[] list) {
		// Redo ensures that the sort runs enough time to accurately sort even large
		// lists
		int redo = 0;
		while (redo < list.length + 1) {
			for (int i = 0; i < list.length - 1; i++) {
				if (list[i] > list[i + 1]) {
					// Calls helper if one is smaller than the number after it
					list = switches(list, i, i + 1);
				}

			}
			redo++;
		}

		return list;
	}

}

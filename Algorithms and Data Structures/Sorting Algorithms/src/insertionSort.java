
public class insertionSort {

	// Function to sort array
	public void sort(int[] list) {

		for (int i = 1; i < list.length; i++) {
			int key = list[i];
			int j = i - 1;

			// Moves up elements that are greater than the key
			while (j >= 0 && list[j] > key) {
				list[j + 1] = list[j];
				j = j - 1;

			}

			list[j + 1] = key;
		}
	}

}
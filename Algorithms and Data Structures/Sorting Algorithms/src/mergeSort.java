
public class mergeSort {

	public void merge(int array[], int left, int mid, int right) {

		// These will be my two subarrays
		int size1 = mid - left + 1;
		int size2 = right - mid;

		int lefty[] = new int[size1];
		int righty[] = new int[size2];

		// Here we will make temp arrays
		for (int i = 0; i < size1; i++) {
			lefty[i] = array[left + i];
		}
		for (int j = 0; j < size2; j++) {
			righty[j] = array[mid + 1 + j];
		}

		int i = 0;
		int j = 0;

		int k = left;

		while (i < size1 && j < size2) {
			if (lefty[i] <= righty[j]) {
				array[k] = lefty[i];
				i++;
			} else {
				array[k] = righty[j];
				j++;
			}
			k++;
		}

		while (i < size1) {
			array[k] = lefty[i];
			i++;
			k++;
		}

		while (j < size2) {
			array[k] = righty[j];
			j++;
			k++;
		}

	}

	public void sort(int array[], int left, int right) {

		if (left < right) {
			// Get middle point
			int mid = left + (right - left) / 2;

			// Sort values
			sort(array, left, mid);
			sort(array, mid + 1, right);
			// merge
			merge(array, left, mid, right);
		}

	}

}

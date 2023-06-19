import java.util.Arrays;

public class builtArray {

	private int[] builtIn = new int[128];
	protected int[] copyHolder;
	protected int size;

	// This will use finder to determine if the given value is in the array
	public Boolean find(int x) {
		if (finder(x) != -1) {
			return true;
		} else {
			return false;
		}

	}
	/*
	 * The insert method has a few key jobs. Firstly, it has to check if the array
	 * is full. If it is then it will copy the array into once of twice the size
	 * Then it adds the value into the new array. If the array is not full it just
	 * gets added to the first empty slot. Once the value is added, we go ahead and
	 * sort.
	 */

	public void insert(int x) {
		// This section checks if the array is full
		size = builtIn.length; // Here I set a variable to hold length so I can use it to re-initialize the new
								// array
		// Here we check to see if the last item in the array is filled
		if (this.find(0) == false) {
			copyHolder = builtIn; // Here i set a holder to hold the array until after I extend it
			int[] builtIn = new int[size * 2]; // Reinitialize with double size
			for (int i = 0; i < size; i++) { // This will make sure that every item in the holder gets transfered to the
												// new array
				builtIn[i] = copyHolder[i];
			}
			builtIn[size] = x; // This adds the new x to the newly copied array
		} else {
			builtIn[this.finder(0)] = x;
			Arrays.sort(builtIn);
		}

	}

	/*
	 * This will be a little public helper object that is that is an expansion of
	 * the normal find algorithm because it is capable of giving us the index of the
	 * next empty. It will also help me test the sort in JUnit
	 */
	public int finder(int x) {
		// This will check for the desired value
		for (int i = 0; i < builtIn.length; i++) {
			if (builtIn[i] == x) {
				return i; // Returns index of value
			}
		}
		return -1;// in cases of the object not being found
	}

	public Boolean delete(int x) {
		if (finder(x) != -1) {
			builtIn[x] = 0;
			return true;
		} else {
			return false;
		}

	}

	public String toString() {
		return builtIn.toString();
	}

}

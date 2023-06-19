import java.util.ArrayList;

public class bsTree {

	// protected ArrayList<bNodes> tree = new ArrayList<bNodes>();
	protected bNodes root;
	protected bNodes pointer;
	protected Boolean contLoop;

	public bsTree() {
		root = null;
		pointer = null;
		contLoop = true;
	}

	public Boolean delete(int x) {
		contLoop = true; // Starts our loop and tells it when to stop
		pointer = root;
		if (pointer == null) { // Checks if root is null
			return false;
			// This section of code will cover the various situations in which root needs to
			// be deleted
		} else if (pointer.getValue() == x) {
			if (pointer.getLeftChild() == null) {
				if (pointer.getRightChild() == null) {
					pointer = null; // This covers both children being null
					return true;
				} else {
					pointer = pointer.getLeftChild(); // This covers only right child being null
					root = pointer;
					return true;
				}
			}
		} else if (pointer.getRightChild() == null) {
			if (pointer.getLeftChild() == null) {
				pointer = null; // This covers both children being null
			} else {
				pointer = pointer.getRightChild(); // This covers only left child being null
				root = pointer;
				return true;
			}
		}

		while (contLoop == true) {
			// This will check if the Node is bigger than root
			if (pointer.getValue() < x) {
				// If it is bigger then this will check if the rightChild slot is open
				if (pointer.getRightChild().getValue() == x) {
					contLoop = false;
					pointer.setRightChild(pointer.getRightChild().getRightChild());
					return true;
				} else if (pointer == null) {
					return false;
				} else {
					// If it's not open than we set the pointer to the right child and began the
					// loop again
					pointer = pointer.getRightChild();
				}
			}
			if (pointer.getValue() >= x) {
				// If it is bigger then this will check if the rightChild slot is open
				if (pointer.getLeftChild().getValue() == x) {
					contLoop = false;
					pointer.setLeftChild(pointer.getLeftChild().getLeftChild());
					return true;
				} else if (pointer == null) {
					return false;
				} else {
					// If it's not open than we set the pointer to the right child and began the
					// loop again
					pointer = pointer.getLeftChild();
				}
			}
		}
		return false;
	}

	public Boolean find(int x) {
		contLoop = true; // Starts our loop and tells it when to stop
		pointer = root;
		if (pointer == null) { // Checks if root is null
			return false;
		} else if (pointer.getValue() == x) {
			return true;
		}

		while (contLoop == true) {
			// This will check if the Node is bigger than root
			if (pointer.getValue() < x) {
				// If it is bigger then this will check if the rightChild slot is open
				if (pointer.getRightChild().getValue() == x) {
					contLoop = false;
					return true;
				} else if (pointer == null) {
					return false;
				} else {
					// If it's not open than we set the pointer to the right child and began the
					// loop again
					pointer = pointer.getRightChild();
				}
			}
			if (pointer.getValue() >= x) {
				// If it is bigger then this will check if the rightChild slot is open
				if (pointer.getLeftChild().getValue() == x) {
					contLoop = false;
					return true;
				} else if (pointer == null) {
					return false;
				} else {
					// If it's not open than we set the pointer to the right child and began the
					// loop again
					pointer = pointer.getLeftChild();
				}
			}
		}
		return false;
	}

	// This method will insert the new node by it's value
	public void insert(int x) {
		contLoop = true; // Starts our loop and tells it when to stop
		bNodes holdNew = new bNodes(x); // Sets our holder to equal a new node with the user's value
		if (root == null) { // Checks if root is null
			root = holdNew; // This sets holdNew to root to began
		} else {
			pointer = root; // Sets pointer to root to prime our loop
			while (contLoop == true) {
				// This will check if the Node is bigger than root
				if (pointer.getValue() < holdNew.getValue()) {
					// If it is bigger then this will check if the rightChild slot is open
					if (pointer.getRightChild() == null) {
						// If the slot is open then we can just sign it to that slot
						pointer.setRightChild(holdNew);
						contLoop = false; // and end the loop
						return;
					} else {
						// If it's not open than we set the pointer to the right child and began the
						// loop again
						pointer = pointer.getRightChild();
					}
				} else if (pointer.getValue() >= holdNew.getValue()) {
					if (pointer.getLeftChild() == null) {
						pointer.setLeftChild(holdNew);
						contLoop = false;
					} else {
						pointer = pointer.getLeftChild();
					}
				}
			}
		}
	}
}

import org.w3c.dom.Node;

/*
 * The purpose of this class is to create a linked list object
 * that will hold various integer values and keep them in sorted order.
 * I will be using my own node class "llNode" to power this linked list.
 * I've opted to sort from the start of the list being the lowest and the end being the highest.
 * @Alex Sandoval
 * - "I dabble in Mediocrity"
 */
public class linkedList {
	// These are the member variables I'll need
	protected llNode head; // I will use this to start from the beginning of the list
	protected llNode alpha; // I will use this to traverse the whole of the linked list
	protected int counter; // This will be my counter for determining length
	protected Boolean cont; // This will be my continue variable for my while loops

	public linkedList() {
		head = null;
	}

	// This is the add method for my linked list class
	public void add(int data) {
		llNode handle = new llNode();

		if (handle != null) {
			handle.setValue(data);

			if (head == null) {
				head = handle;
			} else {
				handle.setNext(head);

				head = handle;
			}

		}

	}

	// This method will sort the linked list
	public void sort(llNode al) {
		al = head;
		if (alpha != null) {
			for (int j = 0; j < this.getLength() * 10; j++) {
				for (int i = 0; i < this.getLength(); i++) {
					al.comp(alpha);
					al = al.getNext();
				}
			}
		}

	}

	// This method will find a value
	public boolean find(int value) {
		alpha = head;
		cont = true;

		while (cont = true) {
			if (alpha.getValue() == value) {
				return true;
			} else if (alpha.getNext() == null) {
				return false;
			} else {
				alpha = alpha.getNext();
			}
		}
		return false;

	}

	// This method will delete a value
	public Boolean delete(int value) {
		alpha = head;
		cont = true;

		if (head.getValue() == value) {
			head = head.getNext();
			return true;
		}

		while (cont = true) {
			if (alpha.getNext().getValue() == value) {
				alpha.setNext(alpha.getNext().getNext());
				;
				return true;
			} else if (alpha.getNext() == null) {
				return false;
			} else {
				alpha = alpha.getNext();
			}
		}
		return false;

	}

	// This function will return the length
	public int getLength() {
		cont = true;
		alpha = head;

		while (cont = true) {
			if (alpha != null) {
				counter++;
				alpha = alpha.getNext();
			} else {
				return counter;
			}
		}
		return counter;
	}

	// This will give the contents of the linked list
	public String contentsToString() {
		String total = "The list contains: ";
		cont = true;
		alpha = head;
		if (alpha != null) {
			while (cont == true) {
				if (alpha.getNext() == null) {
					total += (alpha.getValue() + ", ");
					cont = false;
					return total;
				} else {
					total += (alpha.getValue() + ", ");

				}
				alpha = alpha.getNext();
			}
		}

		return total;
	}

}

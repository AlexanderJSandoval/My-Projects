
public class llNode {

	protected int value;
	protected llNode next;
	protected llNode swapHolder;

	public llNode() {
		this.value = 0;
		this.next = null;
	}

	public Boolean comp(llNode a) {
		if (a.getNext() != null) {

			if (a.getValue() > a.getNext().getValue()) {
				swapHolder = a;
				a.setValue(a.getNext().getValue());
				a.getNext().setValue(swapHolder.getValue());
				return false;
			} else {
				return true;
			}
		} else {
			return false;
		}
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public llNode getNext() {
		return next;
	}

	public void setNext(llNode next) {
		this.next = next;
	}

}


public class bNodes {

	protected bNodes leftChild;
	protected bNodes rightChild;
	protected int value;

	public bNodes(int v) {
		this.setValue(v);
		this.setLeftChild(null);
		this.setRightChild(null);
	}

	// This method will compare the values that are being held by the nodes for
	// sorting during insertion
	public String compare(bNodes x, bNodes y) {
		if (x.getValue() > y.getValue()) {
			return "greater";
		} else if (x.getValue() == y.getValue()) {
			return "equal";
		} else {
			return "Lesser";
		}
	}

//\\\\\\\\\\\\\\\\\\\\\\\\\\\\Auto Generated Getters and Setters////////////////////////////////////////
	public bNodes getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(bNodes leftChild) {
		this.leftChild = leftChild;
	}

	public bNodes getRightChild() {
		return rightChild;
	}

	public void setRightChild(bNodes rightChild) {
		this.rightChild = rightChild;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}

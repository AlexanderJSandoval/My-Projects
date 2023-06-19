import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class bsTreeTests {

	@Test
	void testInsertAndFind5() {
		bsTree bt = new bsTree();
		bt.insert(5);
		assertEquals(bt.find(5), true);
	}

	@Test
	void testInsertAndFind6() {
		bsTree bt = new bsTree();
		bt.insert(5);
		bt.insert(6);
		assertEquals(bt.find(6), true);
	}

	@Test
	void testInsertAndFind7() {
		bsTree bt = new bsTree();
		bt.insert(5);
		bt.insert(6);
		bt.insert(7);

		assertEquals(bt.find(7), true);
	}

	@Test
	void testInsertAndFind2() {
		bsTree bt = new bsTree();
		bt.insert(5);
		bt.insert(2);
		bt.insert(2);
		bt.insert(5);

		assertEquals(bt.find(2), true);
	}

	@Test
	void testInsertAndFind4() {
		bsTree bt = new bsTree();
		bt.insert(5);
		bt.insert(4);
		bt.insert(6);
		assertEquals(bt.find(4), true);
	}

	@Test
	void testInsertAndFind5p() {
		bsTree bt = new bsTree();
		bt.insert(5);
		bt.insert(6);
		bt.insert(7);

		assertEquals(bt.find(7), true);
	}

	@Test
	void testInsertAndDelete1() {
		bsTree bt = new bsTree();
		bt.insert(1);
		bt.insert(6);
		bt.insert(7);

		assertEquals(bt.delete(1), true);
	}

	@Test
	void testInsertAndDelete6() {
		bsTree bt = new bsTree();
		bt.insert(1);
		bt.insert(6);
		bt.insert(7);

		assertEquals(bt.delete(6), true);
	}

	@Test
	void testInsertAndDelete7() {
		bsTree bt = new bsTree();
		bt.insert(1);
		bt.insert(6);
		bt.insert(7);

		assertEquals(bt.delete(7), true);
	}

}

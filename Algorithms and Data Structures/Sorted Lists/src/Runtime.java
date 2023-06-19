import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Runtime {

	//Inserts and Find
	@Test
	void testInsertAndFind5() {
		bsTree bt = new bsTree();
		bt.insert(5);
		assertEquals(bt.find(5), true);
	}
	@Test
	void testInsert3() {
		builtArray ba = new builtArray();
		ba.insert(3);
		assertEquals(ba.find(3), true);
	}
	@Test
	void findTests2() {
		linkedList ll = new linkedList();
		ll.add(2);
		assertEquals(ll.find(2), true);
	}
	//Insert and Delete
	@Test
	void testInsertAndDelete7() {
		bsTree bt = new bsTree();
		bt.insert(7);	
		assertEquals(bt.delete(7), true);
	}
	@Test
	void deleteTests() {
		linkedList ll = new linkedList();
		ll.add(9);
		assertTrue(ll.delete(9));
	}
	
}

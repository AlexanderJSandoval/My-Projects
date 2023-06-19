import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class linkedTests {

	@Test
	void findTests5() {
		linkedList ll = new linkedList();
		ll.add(5);
		ll.add(56);
		ll.add(2);
		ll.add(9);

		// True tests
		assertEquals(ll.find(5), true);

	}

	@Test
	void findTests56() {
		linkedList ll = new linkedList();
		ll.add(5);
		ll.add(56);
		ll.add(2);
		ll.add(9);

		// True tests
		assertEquals(ll.find(5), true);
		assertEquals(ll.find(56), true);
	}

	@Test
	void findTests2() {
		linkedList ll = new linkedList();
		ll.add(5);
		ll.add(56);
		ll.add(2);
		ll.add(9);

		// True tests
		assertEquals(ll.find(2), true);

	}

	@Test
	void findTests14() {
		linkedList ll = new linkedList();
		ll.add(5);
		ll.add(56);
		ll.add(2);
		ll.add(9);

		// False tests
		assertEquals(ll.find(14), false);

	}

	@Test
	void findTests23() {
		linkedList ll = new linkedList();
		ll.add(5);
		ll.add(56);
		ll.add(2);
		ll.add(9);

		// False tests
		assertEquals(ll.find(23), false);

	}

	@Test
	void findTests6() {
		linkedList ll = new linkedList();
		ll.add(5);
		ll.add(56);
		ll.add(2);
		ll.add(9);

		// False tests
		assertEquals(ll.find(6), false);

	}

	@Test
	void lengthTest() {
		linkedList ll = new linkedList();
		ll.add(100);
		ll.add(56);
		ll.add(2);
		ll.add(9);
		ll.add(10);

		assertEquals(5, ll.getLength());

	}

	@Test
	void sortTests() {

		linkedList ll = new linkedList();

		ll.add(100);
		ll.add(56);
		ll.add(21);
		ll.add(9);

		ll.sort(ll.head);

		assertEquals(9, ll.head.getValue());
		assertEquals(21, ll.head.getNext().getValue());
		assertEquals(56, ll.head.getNext().getNext().getValue());
		assertEquals(100, ll.head.getNext().getNext().getNext().getValue());
	}

	@Test
	void deleteTests() {
		linkedList ll = new linkedList();
		ll.add(9);
		assertTrue(ll.delete(9));
	}

}

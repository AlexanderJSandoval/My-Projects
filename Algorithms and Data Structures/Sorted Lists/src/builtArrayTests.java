import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class builtArrayTests {

	@Test
	void testInsert3() {
		builtArray ba = new builtArray();
		ba.insert(1);
		ba.insert(2);
		ba.insert(6);
		ba.insert(4);
		ba.insert(5);
		ba.insert(3);

		assertEquals(ba.find(3), true);
	}

	@Test
	void testInsert1() {
		builtArray ba = new builtArray();
		ba.insert(1);
		ba.insert(2);
		ba.insert(6);
		ba.insert(4);
		ba.insert(5);
		ba.insert(3);

		assertEquals(ba.find(1), true);
	}

	@Test
	void testInsert6() {
		builtArray ba = new builtArray();
		ba.insert(1);
		ba.insert(2);
		ba.insert(6);
		ba.insert(4);
		ba.insert(5);
		ba.insert(3);
		assertEquals(ba.find(6), true);
	}

	@Test
	void testSort1() {
		builtArray ba = new builtArray();

		ba.insert(1);
		ba.insert(2);
		ba.insert(6);
		ba.insert(4);
		ba.insert(5);
		ba.insert(3);
		assertEquals(ba.finder(1), 122);
	}

	@Test
	void testSort6() {
		builtArray ba = new builtArray();

		ba.insert(1);
		ba.insert(2);
		ba.insert(6);
		ba.insert(4);
		ba.insert(5);
		ba.insert(3);
		assertEquals(ba.finder(6), 127);
	}

	@Test
	void testSort3() {
		builtArray ba = new builtArray();

		ba.insert(1);
		ba.insert(2);
		ba.insert(6);
		ba.insert(4);
		ba.insert(5);
		ba.insert(3);
		assertEquals(ba.finder(3), 124);

	}
}

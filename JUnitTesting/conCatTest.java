package JUnitTesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class conCatTest {

	@Test
	public void testConCat() {
		
		MyJUnitClass junit = new MyJUnitClass();
		
		
		String result = junit.conCat("Hello", "World");
		assertEquals("HelloWorld", result);
	}

}

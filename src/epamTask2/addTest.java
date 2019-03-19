package epamTask2;

import static org.junit.Assert.*;

import org.junit.Test;

public class addTest {

	@Test
	public void test() {
		Calculator cal=new Calculator();
		int result=cal.add(3,4);
		assertEquals(7,result);
	}

}

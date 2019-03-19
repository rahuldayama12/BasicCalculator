package epamTask2;

import static org.junit.Assert.*;

import org.junit.Test;

public class mulTest {

	@Test
	public void test() {
		Calculator cal=new Calculator();
		int result=cal.mul(3,4);
		assertEquals(12,result);
	}

}

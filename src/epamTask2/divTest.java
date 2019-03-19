package epamTask2;

import static org.junit.Assert.*;

import org.junit.Test;

public class divTest {

	@Test
	public void test() {
		Calculator cal=new Calculator();
		int result=cal.div(8,4);
		assertEquals(2,result);
	}

}

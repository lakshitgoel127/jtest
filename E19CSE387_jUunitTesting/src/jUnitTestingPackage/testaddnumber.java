package jUnitTestingPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testaddnumber {

	@Test
	void test() {
		jUnitTestingFunction junit = new jUnitTestingFunction();
		int result = junit.addnumber(100, 200);
		assertEquals (300,result);
	}
}

package jUnitTestingPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testaddstring {

	@Test
	void test() {
		jUnitTestingFunction junit = new jUnitTestingFunction();
		String result = junit.addString("Shashwat ", "Singh Raghav");
		assertEquals ("Shashwat Singh Raghav",result);
	}
}

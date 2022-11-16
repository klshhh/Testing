package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class textAddNumbers {
	public void test() {
		jUnitFunctions junit = new jUnitFunctions();
		int result = junit.addNumbers(50, 30);
		assertEquals(80, result);
	}

}

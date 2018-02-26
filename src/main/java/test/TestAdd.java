package test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import logic.Add;

public class TestAdd {
	@Test
	public void TestGetC() {
		Add a = new Add(1, 2);
		assertTrue(a.getC() == 3);
	}
}

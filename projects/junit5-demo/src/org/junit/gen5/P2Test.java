package org.junit.gen5;

import org.junit.gen5.api.Assertions;
import org.junit.gen5.api.Test;

public class P2Test {
	
	@Test
	public void method21() {
		System.out.println("method21");
	}

	@Test
	public void method22() {
		throw new UnsupportedOperationException();
	}

	@Test
	public void method23() {
		Assertions.assertEquals(2, 1);
	}

}

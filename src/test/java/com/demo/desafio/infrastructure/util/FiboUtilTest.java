package com.demo.desafio.infrastructure.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class FiboUtilTest {

	@Test
	public void whithNumersThenReturnResult() {
		
		Integer result = FiboUtil.fiboRecursivo(10);
		
		assertNotNull(result);
		assertEquals(new Integer(55), result);
	}
	
	@Test
	public void whithNegativeNumerThenReturnResult() {
		
		Integer result = FiboUtil.fiboRecursivo(-10);
		
		assertNull(result);
	}
}

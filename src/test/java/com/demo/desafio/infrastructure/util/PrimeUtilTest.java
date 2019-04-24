package com.demo.desafio.infrastructure.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class PrimeUtilTest {

	@Test
	public void whithNumersThenReturnResult() {
		
		Integer result = PrimeUtil.verifyNumber(11, 7);
		
		assertNotNull(result);
		assertEquals(new Integer(11), result);
	}
	
	@Test
	public void whithNumersNoPrimeThenReturnResult() {
		
		Integer result = PrimeUtil.verifyNumber(8, 7);
		
		assertNotNull(result);
		assertEquals(new Integer(7), result);
		
		result = PrimeUtil.verifyNumber(7, 8);
		
		assertNotNull(result);
		assertEquals(new Integer(7), result);
	}
}

package com.demo.desafio.infrastructure.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class CriptoUtilTest {

	@Test
	public void whithTextToEncriptThenReturnResultEncripted() {
		
		String result = CriptoUtil.criptoText("teste");
		
		assertNotNull(result);
		assertEquals("WHVWH", result);
	}
	
	@Test
	public void whithTextEndAlphaToEncriptThenReturnResultEncripted() {
		
		String result = CriptoUtil.criptoText("xyz");
		
		assertNotNull(result);
		assertEquals("ABC", result);
	}
	
	@Test
	public void whithTextEndAlphaToDecriptThenReturnResult() {
		
		String result = CriptoUtil.decriptoText("ABC");
		
		assertNotNull(result);
		assertEquals("XYZ", result);
	}
	
	@Test
	public void whithTextToDecriptThenReturnResultDecripted() {
		
		String result = CriptoUtil.decriptoText("WHVWH");
		
		assertNotNull(result);
		assertEquals("TESTE", result);
	}
	
}

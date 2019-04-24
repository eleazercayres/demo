package com.demo.desafio.infrastructure.util;

public class PrimeUtil {
	
	private PrimeUtil() {
		// default constructor
	}

	private static boolean ehPrimo(int numero) {
		for (int j = 2; j < numero; j++) {
			if (numero % j == 0)
				return false;
		}
		return true;
	}
	
	public static Integer verifyNumber(Integer number1, Integer number2) {
		 
		if (PrimeUtil.ehPrimo(number1)) {
			if (PrimeUtil.ehPrimo(number2)) {
				if (number1 > number2) {
					return number1;
				} else {
					return number2;
				}
			} else {
				return number1;
			}
		} else {
			return number2;
		}
	}
}

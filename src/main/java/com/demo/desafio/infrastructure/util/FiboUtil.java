package com.demo.desafio.infrastructure.util;

public class FiboUtil {

	private FiboUtil() {
		// default constructor
	}
	
	public static Integer fiboRecursivo(int n){
		if (n < 0) {
			return null;
		}
		return n < 2 ? n : fiboRecursivo(n - 2) + fiboRecursivo(n - 1);
    }
 
}

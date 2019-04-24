package com.demo.desafio.infrastructure.util;

import java.util.ArrayList;
import java.util.List;

public class CriptoUtil {
	
	private CriptoUtil() {
		// default constructor
	}

	public static String criptoText(String teste) {
		StringBuilder sb = new StringBuilder();
		List<String> alfabeto = alfabeto();
		for (int i = 0; i < teste.length(); i++) {
			String current = String.valueOf(teste.charAt(i));
			for (int j = 0; j < alfabeto.size() ; j++) {
				
				if (alfabeto.get(j).equalsIgnoreCase(current)) {
					if (j + 3 >= alfabeto.size()) {
						int index = j + 3 - alfabeto.size();
						sb.append(alfabeto.get(index));
					} else {
						sb.append(alfabeto.get(j + 3));
					}
				}
			}
		}
		return sb.toString();
	}
	
	public static String decriptoText(String teste) {
		StringBuilder sb = new StringBuilder();
		List<String> alfabeto = alfabeto();
		for (int i = 0; i < teste.length(); i++) {
			String current = String.valueOf(teste.charAt(i));
			for (int j = 0; j < alfabeto.size() ; j++) {
				
				if (alfabeto.get(j).equalsIgnoreCase(current)) {
					if (j - 3 <= 0) {
						int index = (alfabeto.size()) - (3 - j);
						sb.append(alfabeto.get(index));
					} else {
						sb.append(alfabeto.get(j - 3));
					}
				}
			}
		}
		return sb.toString();
	}

	private static List<String> alfabeto() {
		List<String> alphaMAp = new ArrayList<>();
		for(char i = 0, c = 'A'; c <= 'Z'; i++, c++) {
			alphaMAp.add(String.valueOf(c));
		} 
		return alphaMAp;
	}

}

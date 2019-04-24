package com.demo.desafio.application.controller;

import static org.springframework.http.ResponseEntity.notFound;
import static org.springframework.http.ResponseEntity.ok;
import static org.springframework.http.ResponseEntity.badRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.desafio.infrastructure.util.CriptoUtil;
import com.demo.desafio.infrastructure.util.FiboUtil;
import com.demo.desafio.infrastructure.util.PrimeUtil;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("teste")
public class TesteController {
	
    @GetMapping("/cripto/{text}")
	private ResponseEntity<String> criptoText(@PathVariable String text) {
		
    	String criptoText = CriptoUtil.criptoText(text);
    	
		log.info("Texto encript. result: {}", criptoText);
		
		return criptoText != null ? ok(criptoText) : notFound().build();
		
	}
    
    @GetMapping("/decript/{text}")
	private ResponseEntity<String> decriptoText(@PathVariable String text) {
		
    	String criptoText = CriptoUtil.decriptoText(text);
        
		log.info("Textp decript. result: {}", criptoText);
		
		return criptoText != null ? ok(criptoText) : notFound().build();
		
	}

    @GetMapping("/primo/{number1}/{number2}")
	private ResponseEntity<Integer> verifyNumber(@PathVariable Integer number1, @PathVariable Integer number2) {
		
        Integer result = PrimeUtil.verifyNumber(number1, number2);
        
		log.info("Numero analisado. result: {}", result);
		
		return result != null ? ok(result) : notFound().build();
		
	}
    
    @GetMapping("/fibo/{number1}")
	private ResponseEntity<String> verifyNumber(@PathVariable Integer number1) {
		
    	StringBuilder result = new StringBuilder();
        try {
        	for (int i = 0; i <= number1; i++) {
        		result.append(" Fibonacci(" + i + ") = " + FiboUtil.fiboRecursivo(number1));
        	}
		} catch (StackOverflowError e) {
			log.error("Numero analisado maior que o permitido. result: {}", number1);
			return badRequest().build();
		}
        
		log.info("Numero analisado. result: {}", result.toString());
		
		return ok(result.toString());
		
	}
	
}

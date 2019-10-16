package com.caio.servicoCalc.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import servicoCalc.pojo.Retorno;

@RestController
public class ServicoCalcControler {
	
	@GetMapping("/soma/{a}/{b}")
	public Retorno soma (@PathVariable String a, @PathVariable String b) {
		return new Retorno(Integer.parseInt(a)+Integer.parseInt(b));
	}
	
	@GetMapping("/multiplica")
	public Retorno multiplica (String a, String b) {
		return new Retorno(Integer.parseInt(a)*Integer.parseInt(b));
	}

}

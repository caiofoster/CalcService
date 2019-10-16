package com.caio.servicoCalc.Controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.Metrics;
import servicoCalc.pojo.Retorno;

@RestController
@SpringBootApplication
public class ServicoCalcControler {
	
	final Counter counter = Metrics.counter("entity.count", "type", "order");
	

	@GetMapping("/soma/{a}/{b}")
	public Retorno soma (@PathVariable String a, @PathVariable String b) {
		counter.increment();
		return new Retorno(Integer.parseInt(a)+Integer.parseInt(b));
	}
	
	@GetMapping("/multiplica")
	public Retorno multiplica (String a, String b) {
		return new Retorno(Integer.parseInt(a)*Integer.parseInt(b));
	}

}

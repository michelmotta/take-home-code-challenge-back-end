package br.com.rest.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.rest.model.CalculoTributos;
import br.com.rest.model.Carrinho;

@Controller
public class RestController {
	
	@RequestMapping(value = "/icms", method = RequestMethod.POST)
	public ResponseEntity<?> calcularICMS(@Valid @RequestBody Carrinho carrinho, BindingResult result) {
		
		if (result.hasErrors()) {
			return new ResponseEntity<String>("teste", HttpStatus.BAD_REQUEST);
		}
		
		CalculoTributos calculoTributos = new CalculoTributos();
		
		for(int i = 0; i < carrinho.getItens().size(); i++){
			boolean calculoRealizado = calculoTributos.calcularICMSReduzido(carrinho.getItens().get(i));
			if(!calculoRealizado) {
				return new ResponseEntity<>("teste", HttpStatus.BAD_REQUEST);
			}
		}
		
		return new ResponseEntity<Carrinho>(carrinho, HttpStatus.OK);
		
	}
	
}
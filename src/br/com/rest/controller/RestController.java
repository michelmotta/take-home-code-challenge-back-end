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

/**
* Classe controladora da API REST.
* 
* Esta classe é responsável por delegar os métodos que 
* devem ser executados quando uma requisição é enviada 
* para as urls mapeadas através de @RequestMapping()
*
* @author  Michel Motta da Silva
* @version 1.0
* @since   2018-07-27
*/
@Controller
public class RestController {
	
	/**
	* Método responsável por receber requisições no endpont
	* /icms.
	* 
	* Este método recebe requições do tipo POST no enpoint /icms  
	* com um objeto Json no corpo da requisição. O objeto Json é
	* mapeado para um objeto do tipo Carrinho através da biblioteca
	* Jackson Databind. Este método retorna um ResponseEntity com
	* código de status HTTP 200 ou 400.
	* 
	* @param Carrinho carrinho parâmetro do tipo Carrinho
	* @return ResponseEntity<?> com status 200 ou 400
	* @author  Michel Motta da Silva
	* @version 1.0
	* @since   2018-07-27
	*/
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
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
* Esta classe � respons�vel por delegar os m�todos que 
* devem ser executados quando uma requisi��o � enviada 
* para as urls mapeadas atrav�s de @RequestMapping()
*
* @author  Michel Motta da Silva
* @version 1.0
* @since   2018-07-27
*/
@Controller
public class RestController {
	
	/**
	* M�todo respons�vel por receber requisi��es no endpont
	* /icms.
	* 
	* Este m�todo recebe requi��es do tipo POST no enpoint /icms  
	* com um objeto Json no corpo da requisi��o. O objeto Json �
	* mapeado para um objeto do tipo Carrinho atrav�s da biblioteca
	* Jackson Databind. Este m�todo retorna um ResponseEntity com
	* c�digo de status HTTP 200 ou 400.
	* 
	* @param Carrinho carrinho par�metro do tipo Carrinho
	* @return ResponseEntity<?> com status 200 ou 400
	* @author  Michel Motta da Silva
	* @version 1.0
	* @since   2018-07-27
	*/
	@RequestMapping(value = "/icms", method = RequestMethod.POST)
	public ResponseEntity<?> calcularICMS(@Valid @RequestBody Carrinho carrinho, BindingResult result) {
		
		//Verifica se tem algum erro de valida��o das annotations das classes modelos.
		if (result.hasErrors()) {
			return new ResponseEntity<String>("Os valores informados n�o s�o v�lidos.", HttpStatus.BAD_REQUEST);
		}
		
		//Instancia um objeto do tipo CalculoTributos, que � a classe respons�vel por calcular tributos de itens.
		CalculoTributos calculoTributos = new CalculoTributos();
		
		//Percorre a lista de itens recebidos
		for(int i = 0; i < carrinho.getItens().size(); i++){
			//Chama o m�todo calcularICMSReduzido() da classe CalculoTributos respons�vel por calcular ICMS Reduzido e armazena o retorno em um boolean true para calculo realizado ou false para erro desconhecido de c�lculo
			boolean calculoRealizado = calculoTributos.calcularICMSReduzido(carrinho.getItens().get(i));
			//Se o c�lculo de algum item der erro, o m�todo retorna ResponseEntity Bad Request
			if(calculoRealizado == false) {
				//Erro de c�lculo identificado e retorna ResponseEntity Bad Request
				return new ResponseEntity<>("Ocorreu um erro desconhecido ao calcular a tributa��o.", HttpStatus.BAD_REQUEST);
			}
		}
		// Os c�lculos dos itens foram realizados com sucesso e retorna a lista Json
		return new ResponseEntity<Carrinho>(carrinho, HttpStatus.OK);
		
	}
	
}
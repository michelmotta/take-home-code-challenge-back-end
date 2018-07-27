package br.com.rest.model;

import org.apache.commons.math3.util.Precision;

/**
* Classe modelo para os objetos do tipo CalculoTributos.
*  
* Esta classe contém todos os métodos necessários para
* realizar os cálculos de tributos.
*
* @author  Michel Motta da Silva
* @version 1.0
* @since   2018-07-27
*/
public class CalculoTributos {

	/**
	* Método que calcula a base de cálculo e o valor do ICMS de
	* itens que possuem tributo com redução na base de cálculo
	* do ICMS.
	*
	* Este método recebe um objeto do tipo Item e tenta realizar o cálculo 
	* da base de cálculo e do valor do ICMS de um item com redução na base de 
	* cálculo do ICMS utilizando um try-catch. Caso o cálculo seja realizado 
	* com sucesso, o método atualiza os valores baseDeCalculo e valorICMS do 
	* objeto item e retorna true. Caso não consiga realizar o cálculo, esse 
	* método retorna false.
	* 
	* @param Item item parâmetro do tipo Item
	* @return boolean pode retornar true ou false
	* @author  Michel Motta da Silva
	* @version 1.0
	* @since   2018-07-27
	*/
	public boolean calcularICMSReduzido(Item item) {

		try {
			double valorTotalItem = item.getValorUnitario() * item.getQuantidade();
			double valorDeReducaoDeBaseDeCalculo = valorTotalItem * (item.getTributos().getICMS().getFatorDeReducaoDaBaseDeCalculo() / 100);
			double baseDeCalculoComReducao = valorTotalItem - valorDeReducaoDeBaseDeCalculo;
			double valorICMS = baseDeCalculoComReducao * (item.getTributos().getICMS().getAliquota() / 100);

			
			item.getTributos().getICMS().setBaseDeCalculo(Precision.round(baseDeCalculoComReducao, 2));
			item.getTributos().getICMS().setValorICMS(Precision.round(valorICMS, 2));
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
		return true;
	}
}

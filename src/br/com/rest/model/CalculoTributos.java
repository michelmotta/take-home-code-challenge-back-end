package br.com.rest.model;

import org.apache.commons.math3.util.Precision;

/**
* Classe modelo para os objetos do tipo CalculoTributos.
*  
* Esta classe cont�m todos os m�todos necess�rios para
* realizar os c�lculos de tributos.
*
* @author  Michel Motta da Silva
* @version 1.0
* @since   2018-07-27
*/
public class CalculoTributos {

	/**
	* M�todo que calcula a base de c�lculo e o valor do ICMS de
	* itens que possuem tributo com redu��o na base de c�lculo
	* do ICMS.
	*
	* Este m�todo recebe um objeto do tipo Item e tenta realizar o c�lculo 
	* da base de c�lculo e do valor do ICMS de um item com redu��o na base de 
	* c�lculo do ICMS utilizando um try-catch. Caso o c�lculo seja realizado 
	* com sucesso, o m�todo atualiza os valores baseDeCalculo e valorICMS do 
	* objeto item e retorna true. Caso n�o consiga realizar o c�lculo, esse 
	* m�todo retorna false.
	* 
	* @param Item item par�metro do tipo Item
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

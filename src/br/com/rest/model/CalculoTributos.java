package br.com.rest.model;

import org.apache.commons.math3.util.Precision;

public class CalculoTributos {

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

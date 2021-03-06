package br.com.rest.model;

import javax.validation.constraints.NotBlank;

import org.springframework.format.annotation.NumberFormat;

/**
* Classe modelo para os objetos do tipo TributoICMS.
*  
* Esta classe define todos os atributos e os seus respectivos
* m�todos Getters and Setters para objetos inst�nciados do 
* tipo TributoICMS.
*
* @author  Michel Motta da Silva
* @version 1.0
* @since   2018-07-27
*/
public class TributoICMS {
	
	private double baseDeCalculo;
	@NotBlank @NumberFormat
    private double fatorDeReducaoDaBaseDeCalculo;
	@NotBlank @NumberFormat
    private double aliquota;
    private double valorICMS;
    
	public double getBaseDeCalculo() {
		return baseDeCalculo;
	}
	
	public void setBaseDeCalculo(double baseDeCalculo) {
		this.baseDeCalculo = baseDeCalculo;
	}
	
	public double getFatorDeReducaoDaBaseDeCalculo() {
		return fatorDeReducaoDaBaseDeCalculo;
	}
	
	public void setFatorDeReducaoDaBaseDeCalculo(double fatorDeReducaoDaBaseDeCalculo) {
		this.fatorDeReducaoDaBaseDeCalculo = fatorDeReducaoDaBaseDeCalculo;
	}
	
	public double getAliquota() {
		return aliquota;
	}
	
	public void setAliquota(double aliquota) {
		this.aliquota = aliquota;
	}
	
	public double getValorICMS() {
		return valorICMS;
	}
	
	public void setValorICMS(double valorICMS) {
		this.valorICMS = valorICMS;
	}

}

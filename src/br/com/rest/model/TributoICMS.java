package br.com.rest.model;

public class TributoICMS {
	
	private double baseDeCalculo;
    private double fatorDeReducaoDaBaseDeCalculo;
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
	
	public void setAliquota(float aliquota) {
		this.aliquota = aliquota;
	}
	
	public double getValorICMS() {
		return valorICMS;
	}
	
	public void setValorICMS(double valorICMS) {
		this.valorICMS = valorICMS;
	}

}

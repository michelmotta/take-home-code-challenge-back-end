package br.com.rest.model;

import javax.validation.constraints.NotBlank;

public class Item {
	
	private String codigo;
    private String descricao;
    @NotBlank
    private double valorUnitario;
    @NotBlank
    private int quantidade;
    private Tributos tributos;
    
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public double getValorUnitario() {
		return valorUnitario;
	}
	
	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public Tributos getTributos() {
		return tributos;
	}
	
	public void setTributos(Tributos tributos) {
		this.tributos = tributos;
	}
}

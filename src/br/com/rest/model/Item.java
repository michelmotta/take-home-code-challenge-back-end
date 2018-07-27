package br.com.rest.model;

import javax.validation.constraints.NotBlank;

import org.springframework.format.annotation.NumberFormat;

/**
* Classe modelo para os objetos do tipo Item.
*  
* Esta classe define todos os atributos e os seus respectivos
* métodos Getters and Setters para objetos instânciados do 
* tipo Item.
*
* @author  Michel Motta da Silva
* @version 1.0
* @since   2018-07-27
*/
public class Item {
	
	private String codigo;
    private String descricao;
    @NotBlank @NumberFormat
    private double valorUnitario;
    @NotBlank @NumberFormat
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

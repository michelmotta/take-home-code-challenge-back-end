package br.com.rest.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
* Classe modelo para os objetos do tipo Carrinho.
*  
* Esta classe define todos os atributos e os seus respectivos
* m�todos Getters and Setters para objetos inst�nciados do 
* tipo Carrinho.
*
* @author  Michel Motta da Silva
* @version 1.0
* @since   2018-07-27
*/
public class Carrinho {
	
	//Anota��o utilizada para mapear corretamente o objeto Json para este atributo.
	@JsonProperty("itens")
	private List<Item> itens;

    public void setItens(List<Item> itens){
        this.itens = itens;
    }
    public List<Item> getItens(){
        return this.itens;
    }
    
}
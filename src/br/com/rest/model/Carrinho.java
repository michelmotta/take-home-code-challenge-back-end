package br.com.rest.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Carrinho {
	
	@JsonProperty("itens")
	private List<Item> itens;

    public void setItens(List<Item> itens){
        this.itens = itens;
    }
    public List<Item> getItens(){
        return this.itens;
    }
    
}
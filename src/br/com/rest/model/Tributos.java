package br.com.rest.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
* Classe modelo para os objetos do tipo Tributos.
*  
* Esta classe define todos os atributos e os seus respectivos
* m�todos Getters and Setters para objetos inst�nciados do 
* tipo Tributos.
*
* @author  Michel Motta da Silva
* @version 1.0
* @since   2018-07-27
*/
public class Tributos {
	
	//Anota��o utilizada para mapear corretamente o objeto Json para este atributo.
	@JsonProperty("ICMS")
	private TributoICMS icms;

    public void setICMS(TributoICMS ICMS){
        this.icms = ICMS;
    }
    
    public TributoICMS getICMS(){
        return this.icms;
    }
    
}

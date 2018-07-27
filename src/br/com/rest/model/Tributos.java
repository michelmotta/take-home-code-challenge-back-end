package br.com.rest.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Tributos {
	
	@JsonProperty("ICMS")
	private TributoICMS icms;

    public void setICMS(TributoICMS ICMS){
        this.icms = ICMS;
    }
    
    public TributoICMS getICMS(){
        return this.icms;
    }
    
}

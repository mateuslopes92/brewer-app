package com.algaworks.brewer.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

public class Cerveja {
	
	@NotBlank
	private String sku;
	
	@NotBlank
	private String name;
	
	@NotBlank
	@Size(max = 30)
	private String descritpion;
	
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescritpion() {
		return descritpion;
	}
	public void setDescritpion(String descritpion) {
		this.descritpion = descritpion;
	}
	
}

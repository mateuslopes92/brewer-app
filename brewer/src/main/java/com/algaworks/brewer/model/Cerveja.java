package com.algaworks.brewer.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

public class Cerveja {
	
	@NotBlank(message = "SKU é obrigatório")
	private String sku;
	
	@NotBlank(message = "Nome é obrigatório")
	private String name;
	
	@NotBlank
	@Size(min = 1, max = 50, message = "A tamanho da descrição deve estar entre 1 e 50")
	private String description;
	
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}

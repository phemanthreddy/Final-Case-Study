package com.DrugInventoryMicroservices;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Document(collection = "Drug")
public class Drug {
	@Id
	private int id;
	private String drugName;
	private String price;
	public Drug() {
		super();
	}
	public Drug(int id, String drugName, String price) {
		super();
		this.id = id;
		this.drugName = drugName;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDrugName() {
		return drugName;
	}
	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	
}
	
	
		
	
	
	
	



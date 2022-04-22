package com.DrugInventoryMicroservices;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Document(collection = "Drug")
public class Drug {
	@Id
	private String id;
	private String drugName;
	private long price;
	public Drug() {
		super();
		
	}
	public Drug(String id, String drugName, long price) {
		super();
		this.id = id;
		this.drugName = drugName;
		this.price = price;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDrugName() {
		return drugName;
	}
	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	

}
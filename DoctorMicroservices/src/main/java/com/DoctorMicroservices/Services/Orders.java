package com.DoctorMicroservices.Services;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Orders")
public class Orders {
	
	@Id
	private String id;
	private String drugName;
	private long drugPrice;
	public Orders() {
		super();
		
	}
	public Orders(String id, String drugName, long drugPrice) {
		super();
		this.id = id;
		this.drugName = drugName;
		this.drugPrice = drugPrice;
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
	public long getDrugPrice() {
		return drugPrice;
	}
	public void setDrugPrice(long drugPrice) {
		this.drugPrice = drugPrice;
	}
	
	
	
	
}


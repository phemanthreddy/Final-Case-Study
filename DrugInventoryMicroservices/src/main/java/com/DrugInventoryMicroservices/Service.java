package com.DrugInventoryMicroservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Service {
	
	@Autowired
	private DrugRepository drugRepo;

	public List<Drug> viewDrug() {
		return drugRepo.findAll();
	}

	
	public Drug viewById(String id) {
		return drugRepo.findById(id).get();
	}
	

		public void addDrugInfo(Drug drug) {
			drugRepo.save(drug);
		}
		
	
		public void updateDrug(Drug drug) {
			drugRepo.save(drug);
		}


	public void deleteById( String id) {
		 drugRepo.deleteById(id);
	}

    
     
}
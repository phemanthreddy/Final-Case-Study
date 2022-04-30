package com.DrugInventoryMicroservices;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DrugInventoryMicroservices.Exceptions.DrugAlreadyExistException;
import com.DrugInventoryMicroservices.Exceptions.DrugNotFoundException;


@RestController
@RequestMapping("/drug")
public class DrugController {
	
	@Autowired
	private DrugRepository drugrepo;
	
	@PostMapping("/addDrug")
	public Drug addDrug(@RequestBody Drug drugrequest) {
	Optional<Drug> drug = drugrepo.findById(drugrequest.getId());
	if(!drug.isPresent()) {
		return drugrepo.save(drugrequest);
	}
	else {
		throw new DrugAlreadyExistException("Drug Already exists");
	}
}
	
	@GetMapping("/viewDrugs")
	public List<Drug> viewDrug() {
		return drugrepo.findAll();
	}
	@GetMapping("/viewDrug/{id}")
	public Optional<Drug> viewDrugById(@PathVariable(value="id") String id) {
		Optional<Drug> drug= drugrepo.findById(id);
		if(!drug.isPresent()) {
			throw new DrugNotFoundException("Drug doesnot exist");
			
		}
		else {
			return drugrepo.findById(id);
		}
		
	
	}

	@PutMapping("/updateDrug/{id}")
	public Drug updateDrug(@PathVariable(value="id")String id,@RequestBody Drug drug){
		Optional<Drug> olddrug = drugrepo.findById(id);
		olddrug=Optional.ofNullable(drug);
		olddrug.get().setId(id);
		drugrepo.save(olddrug.get());
		return olddrug.get();
	}
	@DeleteMapping("/deleteDrug/{id}")
	public Map<String,Drug> deleteDrug(@PathVariable(value="id") String id)
	{
		Optional<Drug> drug = drugrepo.findById(id);
		drugrepo.deleteById(id);
		Map<String,Drug> response = new HashMap<>();
		response.put("Deleted", drug.get());
		return response;
	}
	
	
}

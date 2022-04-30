package com.SupplierMicroservices;


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



@RestController
@RequestMapping("/supplier")

public class SupplierController {
	
	@Autowired
	private SupplierRepository supplierrepo;

	@PostMapping("/addSupplier")
	public Supplier addSupplier(@RequestBody Supplier supplier)
	{
		return supplierrepo.save(supplier);
	}
	
	
	@GetMapping("/viewSuppliers")
	public List<Supplier> viewSupplier() {
		return supplierrepo.findAll();
	}
	
	
	@GetMapping("/viewSupplier/{id}")
	public Optional<Supplier> viewSupplierById(@PathVariable(value="id") String id) {
		return supplierrepo.findById(id);
	}
	
	@PutMapping("/updateSupplier/{id}")
	public Supplier updateSupplier(@PathVariable(value="id")String id,@RequestBody Supplier supplier){
		Optional<Supplier> oldsupplier = supplierrepo.findById(id);
		oldsupplier=Optional.ofNullable(supplier);
		oldsupplier.get().setId(id);
		supplierrepo.save(oldsupplier.get());
		return oldsupplier.get();
	}

	@DeleteMapping("/deleteSupplier/{id}")
	public Map<String,Supplier> deleteSupplier(@PathVariable(value="id") String id)
	{
		Optional<Supplier> drug = supplierrepo.findById(id);
		supplierrepo.deleteById(id);
		Map<String,Supplier> response = new HashMap<>();
		response.put("Deleted", drug.get());
		return response;
		
	
	}
}

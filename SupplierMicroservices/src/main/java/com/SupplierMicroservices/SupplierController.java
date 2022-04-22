package com.SupplierMicroservices;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
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

}

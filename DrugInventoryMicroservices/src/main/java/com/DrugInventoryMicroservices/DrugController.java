package com.DrugInventoryMicroservices;


	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/drug")
public class DrugController {
	
	@Autowired
	private DrugRepository drugrepo;
	
	@PostMapping("/addDrug")
	public Drug addDrug(@RequestBody Drug drug)
	{
		return drugrepo.save(drug);
	}

}

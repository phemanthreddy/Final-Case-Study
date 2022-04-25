package com.DoctorMicroservices.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	//Drugs
	

	@GetMapping("/viewDrugs")
	public List<Object> getAllDrugInventoryInfo(){
		
		String url="http://localhost:8084/drug/viewDrugs";
		Object[] objects= restTemplate.getForObject(url, Object[].class);
		return Arrays.asList(objects);
	}


	@GetMapping("/viewDrug/{id}")
	public Object getDrugInventoryById(@RequestParam String id){
		
		String url="http://localhost:8084/drug/viewDrug/"+id;
		return restTemplate.getForObject(url, Object.class);
		}
	
	
	//Orders
	
	@GetMapping("/viewOrders")
	public List<Object> getAllOrdersInventoryInfo(){
		
		String url="http://localhost:8085/orders/viewOrders";
		Object[] objects= restTemplate.getForObject(url, Object[].class);
		return Arrays.asList(objects);
	}


	@GetMapping("/viewOrders/{id}")
	public Object getOrdersInventoryById(@RequestParam String id){
		
		String url="http://localhost:8085/orders/viewOrders/"+id;
		return restTemplate.getForObject(url, Object.class);
		}
		
	
}


	
	
	
	
	



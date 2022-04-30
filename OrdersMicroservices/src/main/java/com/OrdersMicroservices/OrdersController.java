package com.OrdersMicroservices;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/orders")

public class OrdersController {
	
	@Autowired
	private OrdersRepository ordersrepo;

	@PostMapping("/addOrders")
	public Orders addOrders(@RequestBody Orders orders)
	{
		return ordersrepo.save(orders);
	}
	@GetMapping("/viewOrders")
	public List<Orders> viewOrders() {
		return ordersrepo.findAll();
	}
	@GetMapping("/viewOrders/{id}")
	public Optional<Orders> viewordersById(@PathVariable(value="id") String id) {
		return ordersrepo.findById(id);
	


}
	}

package com.OrdersMicroservices;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Service {
	
	
	@Autowired
	private OrdersRepository ordersrepo;

	public List<Orders> viewOrders() {
		return ordersrepo.findAll();
	}

	
	public Orders viewById(String id) {
		return ordersrepo.findById(id).get();
	}
	

		public void addOrders(Orders orders) {
			ordersrepo.save(orders);
		}
		
	
     
}
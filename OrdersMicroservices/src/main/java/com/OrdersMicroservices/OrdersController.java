package com.OrdersMicroservices;

import org.springframework.beans.factory.annotation.Autowired;
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

}

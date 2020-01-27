package com.tvd12.ezyhttp.core.boot.test.service;

import java.util.HashMap;
import java.util.Map;

import com.tvd12.ezyhttp.core.boot.test.data.Customer;
import com.tvd12.ezyhttp.server.core.annotation.Service;

@Service
public class CustomerService {

	protected final Map<String, Customer> customers = new HashMap<>();
	
	public Customer getCustomer(String name) {
		Customer customer = customers.get(name);
		return customer;
	}
	
	public void save(Customer customer) {
		this.customers.put(customer.getName(), customer);
	}
	
}

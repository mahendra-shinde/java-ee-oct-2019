package com.mahendra.ejbs;

import javax.ejb.Remote;

import com.mahendra.models.Customer;

@Remote
public interface CustomerBeanRemote {
	
	public Customer findById(int id);
}

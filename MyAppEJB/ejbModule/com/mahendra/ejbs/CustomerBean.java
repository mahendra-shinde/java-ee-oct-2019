package com.mahendra.ejbs;

import javax.ejb.Stateless;

import com.mahendra.models.Customer;

/**
 * Session Bean implementation class CustomerBean
 */
@Stateless
public class CustomerBean implements CustomerBeanRemote {

    /**
     * Default constructor. 
     */
    public CustomerBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Customer findById(int id) {
		// TODO Auto-generated method stub
		return new Customer("Puneet Singh","Banglore");
	}
    
    

}

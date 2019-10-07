package com.mahendra.ejbs;

import java.util.List;

import javax.persistence.EntityManager;


public class JobDAO {

	private EntityManager em;
public JobDAO(EntityManager em) {
	this.em = em;
	System.out.println("Em is "+em);
}
	
	
	public List<Job> getJobs(){
		System.out.println("Getting all jobs");
		return em.createQuery("select e from Job e").getResultList();
	}
	
	
}

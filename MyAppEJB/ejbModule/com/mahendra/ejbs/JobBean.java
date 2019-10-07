package com.mahendra.ejbs;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Session Bean implementation class JobBean
 */
@Stateless
public class JobBean implements JobBeanRemote {
	
	@PersistenceContext(unitName="pu1")  private EntityManager em;
	
	private JobDAO dao = new JobDAO(em);
    /**
     * Default constructor. 
     */
    public JobBean() {
        // TODO Auto-generated constructor stub
    }
	@Override
	public List<Job> getAllJobs() {
		// TODO Auto-generated method stub
		return dao.getJobs();
	}
    
    

}

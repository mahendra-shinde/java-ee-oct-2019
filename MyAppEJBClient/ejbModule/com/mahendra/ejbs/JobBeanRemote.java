package com.mahendra.ejbs;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface JobBeanRemote {
	
	List<Job> getAllJobs();
}

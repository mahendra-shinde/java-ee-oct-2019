package com.mahendra.ejbs;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Job
 *
 */
@Entity
@Table(name="jobs")
public class Job implements Serializable {

	   
	@Id
	@Column(name="job_id")
	private int jobId;
	@Column(name="job_title",length=35)
	private String jobTitle;
	@Column(name="min_salary")
	private float minSalary;
	@Column(name="max_salary")
	private float maxSalary;
	private static final long serialVersionUID = 1L;

	public Job() {
		super();
	}   
	public int getJobId() {
		return this.jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}   
	public String getJobTitle() {
		return this.jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}   
	public float getMinSalary() {
		return this.minSalary;
	}

	public void setMinSalary(float minSalary) {
		this.minSalary = minSalary;
	}   
	public float getMaxSalary() {
		return this.maxSalary;
	}

	public void setMaxSalary(float maxSalary) {
		this.maxSalary = maxSalary;
	}
   
}

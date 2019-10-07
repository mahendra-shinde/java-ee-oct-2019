package com.mahendra.ejbs;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-10-07T13:01:08.422+0530")
@StaticMetamodel(Job.class)
public class Job_ {
	public static volatile SingularAttribute<Job, Integer> jobId;
	public static volatile SingularAttribute<Job, String> jobTitle;
	public static volatile SingularAttribute<Job, Float> minSalary;
	public static volatile SingularAttribute<Job, Float> maxSalary;
}

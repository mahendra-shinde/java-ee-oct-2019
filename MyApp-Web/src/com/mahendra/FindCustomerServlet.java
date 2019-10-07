package com.mahendra;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import com.mahendra.ejbs.CustomerBeanRemote;
import com.mahendra.ejbs.Job;
import com.mahendra.ejbs.JobBeanRemote;
import com.mahendra.models.Customer;

/**
 * Servlet implementation class FindCustomerServlet
 */
@WebServlet("/find-customer")
public class FindCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@EJB //Performing Dependency Lookup
	// Request the Server (WebLogic) to find and inject following session bean
	private CustomerBeanRemote bean;
	
	@EJB
	private JobBeanRemote jobBean;
	
	@Resource(mappedName="jdbc/data1")
	private DataSource da;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindCustomerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String id = request.getParameter("id");
		int custId ;
		if(id==null || id.trim().length()==0) {
			custId=0;
		}
		else {
			custId= Integer.parseInt(id);
		}
		
		response.setContentType("text/plain");
		PrintWriter out = response.getWriter();
		Customer customer = bean.findById(custId);
		out.println("Customer name: "+customer.getCustName()+", address: "+customer.getAddress());
		try {
			out.println("Connected to "+ da.getConnection().getMetaData().getDatabaseProductName());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		List<Job> jobs = jobBean.getAllJobs();
		for(Job b: jobs) {
			out.println(b.getJobTitle()+" "+b.getMaxSalary());
		}
		out.close();
	}

}

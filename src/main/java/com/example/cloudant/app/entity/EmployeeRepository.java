package com.example.cloudant.app.entity;

import java.util.List;

import org.ektorp.CouchDbConnector;
import org.ektorp.support.CouchDbRepositorySupport;
import org.ektorp.support.GenerateView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeRepository extends CouchDbRepositorySupport<Employee>{

	@Autowired
	  public EmployeeRepository(CouchDbConnector connector) {
	    super(Employee.class, connector);
	    initStandardDesignDocument();
	  }
	
	@GenerateView
	public List<Employee> findByBand(String band){
		return queryView("by_band", band);
	}
}

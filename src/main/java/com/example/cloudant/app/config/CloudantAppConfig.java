package com.example.cloudant.app.config;

import org.ektorp.CouchDbConnector;
import org.ektorp.CouchDbInstance;
import org.ektorp.impl.StdCouchDbConnector;
import org.springframework.cloud.config.java.AbstractCloudConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CloudantAppConfig extends AbstractCloudConfig{
	
	@Bean
	  public CouchDbConnector couchDbConnector(CouchDbInstance couchDbInstance) {
	    CouchDbConnector connector = new StdCouchDbConnector("employeedb", couchDbInstance);
	    connector.createDatabaseIfNotExists();
	    return connector;
	  }
	
	@Bean
    public CouchDbInstance couchDbInstance() {
      CouchDbInstance instance = connectionFactory().service(CouchDbInstance.class);
      return instance;
    }

}

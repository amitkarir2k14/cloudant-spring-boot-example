package com.example.cloudant.app.entity;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

//@JsonIgnoreProperties({ "_id", "_rev" })
public class Employee {

	@JsonProperty("_id")
	private String id;
	@JsonProperty("_rev")
	private String revision;
//	@JsonProperty("employeeName")
	private String name;
//	@JsonProperty("employeeBand")
	private String band;


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRevision() {
		return revision;
	}

	public void setRevision(String revision) {
		this.revision = revision;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBand() {
		return band;
	}

	public void setBand(String band) {
		this.band = band;
	}

}

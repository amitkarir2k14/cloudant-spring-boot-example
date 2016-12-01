package com.example.cloudant.app.entity;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;

@JsonSerialize(include = Inclusion.NON_NULL)
public class Employee {

	@JsonProperty("_id")
	private String id;
	@JsonProperty("_rev")
	private String revision;
	private String name;
	private String band;
	private String location;

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	private List<SkillSet> skills;
	private Date doj;

	@JsonSerialize(using = EmployeeDateSerializer.class)
	public Date getDoj() {
		return doj;
	}
	
	@JsonDeserialize(using=EmployeeDateDeserializer.class)
	public void setDoj(Date doj) {
		this.doj = doj;
	}

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

	public List<SkillSet> getSkills() {
		return skills;
	}

	public void setSkills(List<SkillSet> skills) {
		this.skills = skills;
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

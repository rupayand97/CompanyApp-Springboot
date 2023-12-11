package com.ty.company.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int projId;
	private String projName;
	private String projMgr;
	private String scrumMaster;
	
	@OneToMany
	@JoinColumn(name = "techId")
	@JsonManagedReference
	private List<Technologies> listOfTech;
	
	@OneToMany()
	@JoinColumn(name="empId")
	
	@JsonManagedReference
	private List<Employee> listOfEmployees;
}

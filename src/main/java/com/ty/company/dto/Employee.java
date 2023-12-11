package com.ty.company.dto;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	private String empName;
	private String companyName;
	private String empPic;
	private String jobDesignation;
	
	@OneToMany
	@JoinColumn(name = "skillId")
	private List<SkillSet> listOfSkillSet;
	
	@ManyToOne
	private Project project;
	
}

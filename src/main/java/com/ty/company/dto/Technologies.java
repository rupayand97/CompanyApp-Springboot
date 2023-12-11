package com.ty.company.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Technologies {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int techId;
	private String techName;
	private String webServer;
	private String databaseServer;
	
	@ManyToOne
	@JsonBackReference
	private Project project;
	
}

package com.ty.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ty.company.dto.Project;
import com.ty.company.response.ResponseStructure;
import com.ty.company.service.CompanyService;

@RestController
public class CompanyController {

	@Autowired
	private CompanyService companyService;
	
	@PostMapping(path = "/saveproject")
	public ResponseEntity<?> saveProject (@RequestBody Project project){
		
		ResponseStructure<?> responseStructure = companyService.saveProject(project);
		return new ResponseEntity<>(responseStructure, responseStructure.getHttpStatus());
		
	}
	
	@PostMapping(path="/updateproject")
	public ResponseEntity<?> updateProduct(@RequestBody Project project){
		
		ResponseStructure<?> responseStructure = companyService.updateProject(project);	
		return new ResponseEntity<>(responseStructure, responseStructure.getHttpStatus());
	}
	
}

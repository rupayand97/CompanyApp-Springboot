package com.ty.company.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.ty.company.dao.CompanyDao;
import com.ty.company.dto.Project;
import com.ty.company.response.ResponseStructure;

@Service
public class CompanyService {

	@Autowired
	private CompanyDao companyDao;
	
	public ResponseStructure<?> saveProject(Project project) {
		
		Project saveDbProject = companyDao.saveProject(project);
		ResponseStructure<Project> responseStructure = new ResponseStructure<>();
		responseStructure.setData(saveDbProject);
		responseStructure.setHttpStatus(HttpStatus.CREATED);
		
		return responseStructure;
	}

	public ResponseStructure<?> updateProject(Project project) {
		
		Project upDbProj = companyDao.projectUpdate(project);
		ResponseStructure<Project> responseStructure = new ResponseStructure<>();
		responseStructure.setData(upDbProj);
		responseStructure.setHttpStatus(HttpStatus.OK);
				
		return responseStructure;
	}

}

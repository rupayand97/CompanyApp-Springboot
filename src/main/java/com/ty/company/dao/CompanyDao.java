package com.ty.company.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.company.dto.Project;
import com.ty.company.exception.ProjectIdNotFoundException;
import com.ty.company.repository.CompanyRepository;

@Repository
public class CompanyDao {
	
	@Autowired
	private CompanyRepository companyRepository;

	public Project saveProject(Project project) {
		
		Project saveProject = companyRepository.save(project);
		return saveProject;
	}

	public Project projectUpdate(Project project) {
		if(companyRepository.existsById(project.getProjId())) {
			return companyRepository.save(project);
		}
		throw new ProjectIdNotFoundException("updation of project failed");
	}

}

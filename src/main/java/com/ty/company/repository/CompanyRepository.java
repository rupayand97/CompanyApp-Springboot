package com.ty.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.company.dto.Project;

public interface CompanyRepository extends JpaRepository<Project, Integer>{

//	public Project save(Project project) {
//		
//		return null;
//	}

}

package com.projfullstack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projfullstack.Service.ProjectService;
import com.projfullstack.domain.Project;

@RestController
@RequestMapping("/api/project")
public class ProjectController {
	
	@Autowired
	ProjectService projectService;
	
	@PostMapping("")
	public ResponseEntity<Project>  save(@RequestBody Project project){
		Project p = projectService.save(project);
		return new ResponseEntity<Project>(p, HttpStatus.CREATED);
	}

}

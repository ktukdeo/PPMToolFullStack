package com.projfullstack.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projfullstack.domain.Project;
import com.projfullstack.repository.ProjectRepository;

@Service
public class ProjectService {
	
	@Autowired
	ProjectRepository projectRepository;
	
	public Project save(Project project) {
		Project p = projectRepository.save(project);
		return p;
	}

}

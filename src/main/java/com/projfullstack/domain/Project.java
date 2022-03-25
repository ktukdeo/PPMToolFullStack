package com.projfullstack.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import lombok.Data;

@Data
@Entity
public class Project {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long Id;
	private String projectName;
	private String projectIdentifier;
	private String description;
	private Date start_date;
	private Date end_date;
	
	private Date created_date;
	private Date updated_date;

	@PrePersist
	protected void onCreate() {
		this.created_date = new Date();
	}
	
	@PreUpdate
	protected void onUpdate() {
		this.updated_date = new Date();
	}
}

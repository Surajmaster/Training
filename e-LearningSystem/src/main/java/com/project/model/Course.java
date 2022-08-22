package com.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "coursestable")
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long c_id;
	private String c_name;
	private String duration;
	private String description;
	private String link;

	public Course() {
		super();
	}

	public Course(Long c_id, String c_name, String duration, String description, String link) {
		super();
		this.c_id = c_id;
		this.c_name = c_name;
		this.duration = duration;
		this.description = description;
		this.link = link;
	}

	public Long getC_id() {
		return c_id;
	}

	public void setC_id(Long c_id) {
		this.c_id = c_id;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	@Override
	public String toString() {
		return "Course [c_id=" + c_id + ", c_name=" + c_name + ", duration=" + duration + ", description=" + description
				+ ", link="  +link+ "]";
	}

}

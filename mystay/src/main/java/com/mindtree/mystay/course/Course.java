package com.mindtree.mystay.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.mindtree.mystay.topic.Topic;

@Entity
public class Course {
	
	@Id
	private String id;
	private String name;
	private String description;
	
	@ManyToOne
	private Topic topic;
	
	public Course() {
	}
	
	public Course(String id, String name, String desc, String topicId) {
		super();
		this.id = id;
		this.name = name;
		this.description = desc;
		this.setTopic(new Topic(topicId, "", "")); 
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return description;
	}
	public void setDesc(String desc) {
		this.description = desc;
	}

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	
}

package com.mindtree.mystay.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String> {

	// public List<Course> findByName(String name); - rule to declare method
	// public List<Course> findByDescription(String description);
	public List<Course> findByTopicId(String topicId);
}

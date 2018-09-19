package com.mindtree.mystay.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;

	/*private List<Course> topics = new ArrayList<>(Arrays.asList(
			new Course("spring", "spring f", "desc1"),
			new Course("spring1", "spring f1", "desc11"),
			new Course("spring2", "spring f2", "desc12")
			));*/
	
	public List<Topic> getAllTopics() {
		// return topics;
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}
	
	public Topic getTopic(String id) {
		// return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return topicRepository.findOne(id);
	}

	public void addTopic(Topic topic) {
		// topics.add(topic);
		topicRepository.save(topic);
	}

	public void updateTopic(Topic topic, String id) {
		/*for (int i = 0; i < topics.size(); i++ ) {
			Course t = topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}*/
		topicRepository.save(topic);
	}

	public void deleteTopic(String id) {
		// topics.removeIf(t -> t.getId().equals(id));
		topicRepository.delete(id);
	}
}

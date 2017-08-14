package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	//we need a mutable array
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("spring", "Spring Framework", "desc"),
			new Topic("java", "Core Java", "desc2"),
			new Topic("javascript", "JavaScript", "desc3")
			));
	
	public List<Topic> getAllTopics() {
		return topics;
	}
	
	public Topic getTopic(String id) {
		// streams and lambda expression
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	
	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void updateTopic(String id, Topic topic) {
		for (int i = 0; i < topics.size(); i++) {
			Topic t = topics.get(i);
			if (t.getId().equals(id)) {
				topics.set(i,  topic);
				return;
			}
		}
	}

	public void deleteTopic(String id) {
		topics.removeIf(t -> t.getId().equals(id));
	}

}

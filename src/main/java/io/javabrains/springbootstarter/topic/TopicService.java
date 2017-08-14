package io.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics = Arrays.asList(
			new Topic("spring", "Spring Framework", "desc"),
			new Topic("java", "Core Java", "desc2"),
			new Topic("javascript", "JavaScript", "desc3")
			);
	
	public List<Topic> getAllTopics() {
		return topics;
	}
	
	public Topic getTopic(String id) {
		// streams and lambda expression
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

}

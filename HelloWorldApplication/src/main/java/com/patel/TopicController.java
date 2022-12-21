package com.patel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.model.Topic;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;

		@RequestMapping(value ="/topics")
		public List<Topic> allTopics()
		{
			return topicService.getAllTopics();
		}

		@RequestMapping(value ="/topics/{topicId}")
		public Topic getTopic(@PathVariable("topicId") String id)
		{
			
			
			return topicService.getTopic(id);
		}
		
		@RequestMapping(method =RequestMethod.POST, value ="/topics" )
		public void addTopics(@RequestBody Topic topic) {
			topicService.addTopic(topic);
		}
		
		@RequestMapping(method =RequestMethod.PUT, value ="/topics/{id}" )
		public void updateTopics(@RequestBody Topic topic,@PathVariable String id) {
			topicService.updateTopic(topic, id);
		}
		
		@RequestMapping(method =RequestMethod.DELETE, value ="/topics/{id}" )
		public void deleteTopics(@PathVariable  String id) {
			topicService.deleteTopic(id);
		}
	
}

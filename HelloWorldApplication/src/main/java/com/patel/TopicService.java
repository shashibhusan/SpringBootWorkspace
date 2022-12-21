package com.patel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;
import com.model.Topic;

@Service
public class TopicService {
	
	private List<Topic> topics =new ArrayList<>(Arrays.asList(
			new Topic("spring", "spring framework", "spring framework description"),
			new Topic("hibernate", "hibernate framework", "hibernate description"),
			new Topic("struts", "Struts framework", "Struts description"),
			new Topic("java", "Java framework", "Java description")
			));
	
	public List<Topic> getAllTopics()
	{
		return topics;
	}
	
	public Topic getTopic(String id)
	{
		return topics.stream().filter(t ->t.getId().equals(id)).findFirst().get();
	}
	
	public void addTopic( Topic t)
	{
		topics.add(t);
	}
	
	public void updateTopic( Topic t,String id)
	{
		 for (int i = 0; i < topics.size(); i++) {
			 
			 Topic topic=topics.get(i);
			 if(topic.getId().equals(id))
			 {
				 topics.add(i, topic);
			 }
		}
	}
	
	public void deleteTopic(String id)
	{
		for (int i = 0; i < topics.size(); i++) {
			 
			 Topic topic=topics.get(i);
			 if(topic.getId().equals(id))
			 {
				 topics.remove(i);
			 }
		} 
	}

}

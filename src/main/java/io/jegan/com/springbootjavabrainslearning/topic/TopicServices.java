package io.jegan.com.springbootjavabrainslearning.topic;

import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
@Data
public class TopicServices {
    private List<Topic> topics= new ArrayList<>(Arrays.asList(
            new Topic("spring","spring.org","framework to build java app"),
            new Topic("Java","oracle.org"," java programming language"),
            new Topic("Devops","idea.org","pipeline language")));

    public List<Topic> getTopics() {
        return topics;
    }

    public void setTopics(List<Topic> topics) {
        this.topics = topics;
    }

    public List<Topic> listAllTopics(){
        return topics;
    }
    public Topic topic(String name){
        return topics.stream().filter(s->s.getName().equalsIgnoreCase(name)).findAny().get();

    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(Topic topic, String name) {
       for (int i=0;i<topics.size();i++){
          Topic t=topics.get(i);
          if(t.getName().equals(name)){
              topics.add(i,topic);
              return;
          }
       }


    }

    public void deleteTopic(String name) {
        topics.removeIf(s->s.getName().equalsIgnoreCase(name));
    }
}

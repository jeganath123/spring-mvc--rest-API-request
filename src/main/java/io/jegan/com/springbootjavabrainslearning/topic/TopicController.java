package io.jegan.com.springbootjavabrainslearning.topic;

import io.jegan.com.springbootjavabrainslearning.topic.Topic;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

@RestController
@AllArgsConstructor
public class TopicController {
    private TopicServices topicServices;

    @RequestMapping("/topics")
    public List<Topic> courses() {
        return topicServices.listAllTopics();
    }
    @RequestMapping("/topics/{name}")
    public Topic gettopic(@PathVariable String name) {
        return topicServices.topic(name);
    }
    @RequestMapping(method = RequestMethod.POST,value = "/topics")
    public void addTopic(@RequestBody Topic topic){
        topicServices.addTopic(topic);
    }
    @RequestMapping(method = RequestMethod.PUT,value = "/topics/{name}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String name){
        topicServices.updateTopic(topic,name);
    }
    @RequestMapping(method = RequestMethod.DELETE,value = "/topics/{name}")
    public void deleteTopic(@PathVariable String name){
        topicServices.deleteTopic(name);
    }
}

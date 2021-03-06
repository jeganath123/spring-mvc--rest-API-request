package io.jegan.com.springbootjavabrainslearning.topic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Topic {
    private String name;
    private String group;
    private String desc;
}

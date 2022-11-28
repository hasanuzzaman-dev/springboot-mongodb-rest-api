package com.hasan.bootmongorest.collection;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Builder
@Document(collection = "person")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Person {

    public String personId;
    public String firstName;
    public String lastName;
    public Integer age;
    private List<String> hobbies;
    private List<Address> addresses;


}

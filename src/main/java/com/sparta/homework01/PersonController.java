package com.sparta.homework01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @GetMapping("/persons")
    public Person getPersons(){
        Person person = new Person();
        person.setName("이하눌");
        person.setAdress("관악구");
        person.setAge(30);

        return person;
    }


}

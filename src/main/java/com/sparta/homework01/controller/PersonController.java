package com.sparta.homework01.controller;

import com.sparta.homework01.domain.Person;
import com.sparta.homework01.domain.PersonRepository;
import com.sparta.homework01.domain.PersonRequestDto;
import com.sparta.homework01.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class PersonController {

        public final PersonService personService;
        public final PersonRepository personRepository;

        @PostMapping("/api/persons")
        public Person createPerson(@RequestBody PersonRequestDto requestDto){
            Person person = new Person(requestDto);
            return personRepository.save(person);
        }

        @GetMapping("/api/persons")
        public List<Person> readPerson(){
            return personRepository.findAll();
        }

        @PutMapping("/api/persons/{id}")
        public Long updatePerson(@PathVariable Long id,@RequestBody PersonRequestDto requestDto) {

           return personService.update(id,requestDto);
        }
        @DeleteMapping("/api/persons/{id}")
        public Long deletePerson(@PathVariable Long id){
            personRepository.deleteById(id);
            return id;
        }

    }



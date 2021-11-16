package com.sparta.homework01.service;

import com.sparta.homework01.domain.Person;
import com.sparta.homework01.domain.PersonRepository;
import com.sparta.homework01.domain.PersonRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@RequiredArgsConstructor
@Service
public class PersonService {

    private final PersonRepository personRepository;
    @Transactional
    public  Long update(Long id, PersonRequestDto requestDto){
        Person person = personRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("오류아이디가 존재하지 않습니다.")
        );
        person.update(requestDto);
        return id;
    }
}

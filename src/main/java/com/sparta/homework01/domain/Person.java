package com.sparta.homework01.domain;


import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Getter  //
@Entity
@NoArgsConstructor
public class Person {
    @GeneratedValue(strategy = GenerationType.AUTO )
    @Id
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private int age;

    @Column(nullable = false)
    private String job;

    public Person(PersonRequestDto requestDto) {
        this.name = requestDto.getName();
        this.address = requestDto.getAddress();
        this.age = requestDto.getAge();
        this.job = requestDto.getJob();
    }

    public void update( PersonRequestDto requestDto){
        this.name = requestDto.getName();
        this.address = requestDto.getAddress();
        this.age = requestDto.getAge();
        this.job = requestDto.getJob();
    }


}
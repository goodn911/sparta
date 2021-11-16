package com.sparta.homework01.domain;


import lombok.Getter;

@Getter
public class PersonRequestDto {

    private Long id;
    private String name;
    private String address;
    private int age;
    private String job;
}

package com.sparta.homework01;

public class Person {
    private String name;
    private String adress;
    private int age;


    public Person(){

    }

    public Person(String name,String adress,int age){
        this.name = name;
        this.adress = adress;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAdress(String adress){
        this.adress=adress;
    }
    public  void setAge(int age){
        this.age=age;
    }
    public String getName(){
        return this.name;
    }
    public String getAdress(){
        return  this.adress;
    }
    public int getAge(){
        return this.age;
    }

}
